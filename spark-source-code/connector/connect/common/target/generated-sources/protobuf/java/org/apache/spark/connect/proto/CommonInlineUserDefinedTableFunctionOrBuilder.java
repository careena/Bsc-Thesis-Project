// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface CommonInlineUserDefinedTableFunctionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.CommonInlineUserDefinedTableFunction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) Name of the user-defined table function.
   * </pre>
   *
   * <code>string function_name = 1;</code>
   * @return The functionName.
   */
  java.lang.String getFunctionName();
  /**
   * <pre>
   * (Required) Name of the user-defined table function.
   * </pre>
   *
   * <code>string function_name = 1;</code>
   * @return The bytes for functionName.
   */
  com.google.protobuf.ByteString
      getFunctionNameBytes();

  /**
   * <pre>
   * (Optional) Whether the user-defined table function is deterministic.
   * </pre>
   *
   * <code>bool deterministic = 2;</code>
   * @return The deterministic.
   */
  boolean getDeterministic();

  /**
   * <pre>
   * (Optional) Function input arguments. Empty arguments are allowed.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression arguments = 3;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getArgumentsList();
  /**
   * <pre>
   * (Optional) Function input arguments. Empty arguments are allowed.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression arguments = 3;</code>
   */
  org.apache.spark.connect.proto.Expression getArguments(int index);
  /**
   * <pre>
   * (Optional) Function input arguments. Empty arguments are allowed.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression arguments = 3;</code>
   */
  int getArgumentsCount();
  /**
   * <pre>
   * (Optional) Function input arguments. Empty arguments are allowed.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression arguments = 3;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getArgumentsOrBuilderList();
  /**
   * <pre>
   * (Optional) Function input arguments. Empty arguments are allowed.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression arguments = 3;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getArgumentsOrBuilder(
      int index);

  /**
   * <code>.spark.connect.PythonUDTF python_udtf = 4;</code>
   * @return Whether the pythonUdtf field is set.
   */
  boolean hasPythonUdtf();
  /**
   * <code>.spark.connect.PythonUDTF python_udtf = 4;</code>
   * @return The pythonUdtf.
   */
  org.apache.spark.connect.proto.PythonUDTF getPythonUdtf();
  /**
   * <code>.spark.connect.PythonUDTF python_udtf = 4;</code>
   */
  org.apache.spark.connect.proto.PythonUDTFOrBuilder getPythonUdtfOrBuilder();

  org.apache.spark.connect.proto.CommonInlineUserDefinedTableFunction.FunctionCase getFunctionCase();
}
