// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface CachedLocalRelationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.CachedLocalRelation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) A sha-256 hash of the serialized local relation in proto, see LocalRelation.
   * </pre>
   *
   * <code>string hash = 3;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <pre>
   * (Required) A sha-256 hash of the serialized local relation in proto, see LocalRelation.
   * </pre>
   *
   * <code>string hash = 3;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();
}