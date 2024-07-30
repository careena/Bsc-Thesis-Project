// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/expressions.proto

package org.apache.spark.connect.proto;

public interface PythonUDFOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.PythonUDF)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) Output type of the Python UDF
   * </pre>
   *
   * <code>.spark.connect.DataType output_type = 1;</code>
   * @return Whether the outputType field is set.
   */
  boolean hasOutputType();
  /**
   * <pre>
   * (Required) Output type of the Python UDF
   * </pre>
   *
   * <code>.spark.connect.DataType output_type = 1;</code>
   * @return The outputType.
   */
  org.apache.spark.connect.proto.DataType getOutputType();
  /**
   * <pre>
   * (Required) Output type of the Python UDF
   * </pre>
   *
   * <code>.spark.connect.DataType output_type = 1;</code>
   */
  org.apache.spark.connect.proto.DataTypeOrBuilder getOutputTypeOrBuilder();

  /**
   * <pre>
   * (Required) EvalType of the Python UDF
   * </pre>
   *
   * <code>int32 eval_type = 2;</code>
   * @return The evalType.
   */
  int getEvalType();

  /**
   * <pre>
   * (Required) The encoded commands of the Python UDF
   * </pre>
   *
   * <code>bytes command = 3;</code>
   * @return The command.
   */
  com.google.protobuf.ByteString getCommand();

  /**
   * <pre>
   * (Required) Python version being used in the client.
   * </pre>
   *
   * <code>string python_ver = 4;</code>
   * @return The pythonVer.
   */
  java.lang.String getPythonVer();
  /**
   * <pre>
   * (Required) Python version being used in the client.
   * </pre>
   *
   * <code>string python_ver = 4;</code>
   * @return The bytes for pythonVer.
   */
  com.google.protobuf.ByteString
      getPythonVerBytes();
}
