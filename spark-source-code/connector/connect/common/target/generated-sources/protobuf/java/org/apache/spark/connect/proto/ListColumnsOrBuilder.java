// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/catalog.proto

package org.apache.spark.connect.proto;

public interface ListColumnsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.ListColumns)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string db_name = 2;</code>
   * @return Whether the dbName field is set.
   */
  boolean hasDbName();
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string db_name = 2;</code>
   * @return The dbName.
   */
  java.lang.String getDbName();
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional string db_name = 2;</code>
   * @return The bytes for dbName.
   */
  com.google.protobuf.ByteString
      getDbNameBytes();
}
