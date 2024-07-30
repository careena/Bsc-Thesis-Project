#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

"""
A collections of builtin protobuf functions
"""


from typing import Dict, Optional, TYPE_CHECKING, cast

from py4j.java_gateway import JVMView

from pyspark.sql.column import Column, _to_java_column
from pyspark.sql.utils import get_active_spark_context, try_remote_protobuf_functions
from pyspark.util import _print_missing_jar

if TYPE_CHECKING:
    from pyspark.sql._typing import ColumnOrName


@try_remote_protobuf_functions
def from_protobuf(
    data: "ColumnOrName",
    messageName: str,
    descFilePath: Optional[str] = None,
    options: Optional[Dict[str, str]] = None,
    binaryDescriptorSet: Optional[bytes] = None,
) -> Column:
    """
    Converts a binary column of Protobuf format into its corresponding catalyst value.
    The Protobuf definition is provided in one of these ways:

       - Protobuf descriptor file: E.g. a descriptor file created with
          `protoc --include_imports --descriptor_set_out=abc.desc abc.proto`
       - Protobuf descriptor as binary: Rather than file path as in previous option,
         we can provide the binary content of the file. This allows flexibility in how the
         descriptor set is created and fetched.
       - Jar containing Protobuf Java class: The jar containing Java class should be shaded.
         Specifically, `com.google.protobuf.*` should be shaded to
         `org.sparkproject.spark_protobuf.protobuf.*`.
         https://github.com/rangadi/shaded-protobuf-classes is useful to create shaded jar from
         Protobuf files. The jar file can be added with spark-submit option --jars.

    .. versionadded:: 3.4.0

    .. versionchanged:: 3.5.0
        Supports `binaryDescriptorSet` arg to pass binary descriptor directly.
        Supports Spark Connect.

    Parameters
    ----------
    data : :class:`~pyspark.sql.Column` or str
        the binary column.
    messageName: str, optional
        the protobuf message name to look for in descriptor file, or
        The Protobuf class name when descFilePath parameter is not set.
        E.g. `com.example.protos.ExampleEvent`.
    descFilePath : str, optional
        The Protobuf descriptor file.
    options : dict, optional
        options to control how the protobuf record is parsed.
    binaryDescriptorSet: bytes, optional
        The Protobuf `FileDescriptorSet` serialized as binary.

    Notes
    -----
    Protobuf functionality is provided as an pluggable external module.

    Examples
    --------
    >>> import tempfile
    >>> data = [("1", (2, "Alice", 109200))]
    >>> ddl_schema = "key STRING, value STRUCT<age: INTEGER, name: STRING, score: LONG>"
    >>> df = spark.createDataFrame(data, ddl_schema)
    >>> desc_hex = str('0ACE010A41636F6E6E6563746F722F70726F746F6275662F7372632F746573742F726'
    ...    '5736F75726365732F70726F746F6275662F7079737061726B5F746573742E70726F746F121D6F72672E61'
    ...    '70616368652E737061726B2E73716C2E70726F746F627566224B0A0D53696D706C654D657373616765121'
    ...    '00A03616765180120012805520361676512120A046E616D6518022001280952046E616D6512140A057363'
    ...    '6F7265180320012803520573636F72654215421353696D706C654D65737361676550726F746F736206707'
    ...    '26F746F33')
    >>> # Writing a protobuf description into a file, generated by using
    >>> # connector/protobuf/src/test/resources/protobuf/pyspark_test.proto file
    >>> with tempfile.TemporaryDirectory() as tmp_dir:
    ...     desc_file_path = "%s/pyspark_test.desc" % tmp_dir
    ...     with open(desc_file_path, "wb") as f:
    ...         _ = f.write(bytearray.fromhex(desc_hex))
    ...         f.flush()
    ...         message_name = 'SimpleMessage'
    ...         proto_df = df.select(
    ...             to_protobuf(df.value, message_name, desc_file_path).alias("value"))
    ...         proto_df.show(truncate=False)
    ...         proto_df_1 = proto_df.select( # With file name for descriptor
    ...             from_protobuf(proto_df.value, message_name, desc_file_path).alias("value"))
    ...         proto_df_1.show(truncate=False)
    ...         proto_df_2 = proto_df.select( # With binary for descriptor
    ...             from_protobuf(proto_df.value, message_name,
    ...                           binaryDescriptorSet = bytearray.fromhex(desc_hex))
    ...             .alias("value"))
    ...         proto_df_2.show(truncate=False)
    +----------------------------------------+
    |value                                   |
    +----------------------------------------+
    |[08 02 12 05 41 6C 69 63 65 18 90 D5 06]|
    +----------------------------------------+
    +------------------+
    |value             |
    +------------------+
    |{2, Alice, 109200}|
    +------------------+
    +------------------+
    |value             |
    +------------------+
    |{2, Alice, 109200}|
    +------------------+
    >>> data = [([(1668035962, 2020)])]
    >>> ddl_schema = "value struct<seconds: LONG, nanos: INT>"
    >>> df = spark.createDataFrame(data, ddl_schema)
    >>> message_class_name = "org.sparkproject.spark_protobuf.protobuf.Timestamp"
    >>> to_proto_df = df.select(to_protobuf(df.value, message_class_name).alias("value"))
    >>> from_proto_df = to_proto_df.select(
    ...     from_protobuf(to_proto_df.value, message_class_name).alias("value"))
    >>> from_proto_df.show(truncate=False)
    +------------------+
    |value             |
    +------------------+
    |{1668035962, 2020}|
    +------------------+
    """

    sc = get_active_spark_context()
    try:
        binary_proto = None
        if binaryDescriptorSet is not None:
            binary_proto = binaryDescriptorSet
        elif descFilePath is not None:
            binary_proto = _read_descriptor_set_file(descFilePath)
        if binary_proto is not None:
            jc = cast(JVMView, sc._jvm).org.apache.spark.sql.protobuf.functions.from_protobuf(
                _to_java_column(data), messageName, binary_proto, options or {}
            )
        else:
            jc = cast(JVMView, sc._jvm).org.apache.spark.sql.protobuf.functions.from_protobuf(
                _to_java_column(data), messageName, options or {}
            )
    except TypeError as e:
        if str(e) == "'JavaPackage' object is not callable":
            _print_missing_jar("Protobuf", "protobuf", "protobuf", sc.version)
        raise
    return Column(jc)


@try_remote_protobuf_functions
def to_protobuf(
    data: "ColumnOrName",
    messageName: str,
    descFilePath: Optional[str] = None,
    options: Optional[Dict[str, str]] = None,
    binaryDescriptorSet: Optional[bytes] = None,
) -> Column:
    """
    Converts a column into binary of protobuf format. The Protobuf definition is provided in one
    of these ways:

       - Protobuf descriptor file: E.g. a descriptor file created with
          `protoc --include_imports --descriptor_set_out=abc.desc abc.proto`
       - Protobuf descriptor as binary: Rather than file path as in previous option,
         we can provide the binary content of the file. This allows flexibility in how the
         descriptor set is created and fetched.
       - Jar containing Protobuf Java class: The jar containing Java class should be shaded.
         Specifically, `com.google.protobuf.*` should be shaded to
         `org.sparkproject.spark_protobuf.protobuf.*`.
         https://github.com/rangadi/shaded-protobuf-classes is useful to create shaded jar from
         Protobuf files. The jar file can be added with spark-submit option --jars.

    .. versionadded:: 3.4.0

    .. versionchanged:: 3.5.0
        Supports `binaryDescriptorSet` arg to pass binary descriptor directly.
        Supports Spark Connect.

    Parameters
    ----------
    data : :class:`~pyspark.sql.Column` or str
        the data column.
    messageName: str, optional
        the protobuf message name to look for in descriptor file, or
        The Protobuf class name when descFilePath parameter is not set.
        E.g. `com.example.protos.ExampleEvent`.
    descFilePath : str, optional
        the Protobuf descriptor file.
    options : dict, optional
    binaryDescriptorSet: bytes, optional
        The Protobuf `FileDescriptorSet` serialized as binary.

    Notes
    -----
    Protobuf functionality is provided as a pluggable external module

    Examples
    --------
    >>> import tempfile
    >>> data = [([(2, "Alice", 13093020)])]
    >>> ddl_schema = "value struct<age: INTEGER, name: STRING, score: LONG>"
    >>> df = spark.createDataFrame(data, ddl_schema)
    >>> desc_hex = str('0ACE010A41636F6E6E6563746F722F70726F746F6275662F7372632F746573742F726'
    ...    '5736F75726365732F70726F746F6275662F7079737061726B5F746573742E70726F746F121D6F72672E61'
    ...    '70616368652E737061726B2E73716C2E70726F746F627566224B0A0D53696D706C654D657373616765121'
    ...    '00A03616765180120012805520361676512120A046E616D6518022001280952046E616D6512140A057363'
    ...    '6F7265180320012803520573636F72654215421353696D706C654D65737361676550726F746F736206707'
    ...    '26F746F33')
    >>> # Writing a protobuf description into a file, generated by using
    >>> # connector/protobuf/src/test/resources/protobuf/pyspark_test.proto file
    >>> with tempfile.TemporaryDirectory() as tmp_dir:
    ...     desc_file_path = "%s/pyspark_test.desc" % tmp_dir
    ...     with open(desc_file_path, "wb") as f:
    ...         _ = f.write(bytearray.fromhex(desc_hex))
    ...         f.flush()
    ...         message_name = 'SimpleMessage'
    ...         proto_df = df.select( # With file name for descriptor
    ...             to_protobuf(df.value, message_name, desc_file_path).alias("suite"))
    ...         proto_df.show(truncate=False)
    ...         proto_df_2 = df.select( # With binary for descriptor
    ...             to_protobuf(df.value, message_name,
    ...                         binaryDescriptorSet=bytearray.fromhex(desc_hex))
    ...             .alias("suite"))
    ...         proto_df_2.show(truncate=False)
    +-------------------------------------------+
    |suite                                      |
    +-------------------------------------------+
    |[08 02 12 05 41 6C 69 63 65 18 9C 91 9F 06]|
    +-------------------------------------------+
    +-------------------------------------------+
    |suite                                      |
    +-------------------------------------------+
    |[08 02 12 05 41 6C 69 63 65 18 9C 91 9F 06]|
    +-------------------------------------------+
    >>> data = [([(1668035962, 2020)])]
    >>> ddl_schema = "value struct<seconds: LONG, nanos: INT>"
    >>> df = spark.createDataFrame(data, ddl_schema)
    >>> message_class_name = "org.sparkproject.spark_protobuf.protobuf.Timestamp"
    >>> proto_df = df.select(to_protobuf(df.value, message_class_name).alias("suite"))
    >>> proto_df.show(truncate=False)
    +----------------------------+
    |suite                       |
    +----------------------------+
    |[08 FA EA B0 9B 06 10 E4 0F]|
    +----------------------------+
    """

    sc = get_active_spark_context()
    try:
        binary_proto = None
        if binaryDescriptorSet is not None:
            binary_proto = binaryDescriptorSet
        elif descFilePath is not None:
            binary_proto = _read_descriptor_set_file(descFilePath)
        if binary_proto is not None:
            jc = cast(JVMView, sc._jvm).org.apache.spark.sql.protobuf.functions.to_protobuf(
                _to_java_column(data), messageName, binary_proto, options or {}
            )
        else:
            jc = cast(JVMView, sc._jvm).org.apache.spark.sql.protobuf.functions.to_protobuf(
                _to_java_column(data), messageName, options or {}
            )

    except TypeError as e:
        if str(e) == "'JavaPackage' object is not callable":
            _print_missing_jar("Protobuf", "protobuf", "protobuf", sc.version)
        raise
    return Column(jc)


def _read_descriptor_set_file(filePath: str) -> bytes:
    # TODO(SPARK-43847): Throw structured errors like "PROTOBUF_DESCRIPTOR_FILE_NOT_FOUND" etc.
    with open(filePath, "rb") as f:
        return f.read()


def _test() -> None:
    import os
    import sys
    from pyspark.testing.utils import search_jar

    protobuf_jar = search_jar("connector/protobuf", "spark-protobuf-assembly-", "spark-protobuf")
    if protobuf_jar is None:
        print(
            "Skipping all Protobuf Python tests as the optional Protobuf project was "
            "not compiled into a JAR. To run these tests, "
            "you need to build Spark with 'build/sbt package' or "
            "'build/mvn package' before running this test."
        )
        sys.exit(0)
    else:
        existing_args = os.environ.get("PYSPARK_SUBMIT_ARGS", "pyspark-shell")
        jars_args = "--jars %s" % protobuf_jar
        os.environ["PYSPARK_SUBMIT_ARGS"] = " ".join([jars_args, existing_args])

    import doctest
    from pyspark.sql import SparkSession
    import pyspark.sql.protobuf.functions

    globs = pyspark.sql.protobuf.functions.__dict__.copy()
    spark = (
        SparkSession.builder.master("local[2]")
        .appName("sql.protobuf.functions tests")
        .getOrCreate()
    )
    globs["spark"] = spark
    (failure_count, test_count) = doctest.testmod(
        pyspark.sql.protobuf.functions,
        globs=globs,
        optionflags=doctest.ELLIPSIS | doctest.NORMALIZE_WHITESPACE,
    )
    spark.stop()
    if failure_count:
        sys.exit(-1)


if __name__ == "__main__":
    _test()
