// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/base.proto

package org.apache.spark.connect.proto;

public interface PlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.Plan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.spark.connect.Relation root = 1;</code>
   * @return Whether the root field is set.
   */
  boolean hasRoot();
  /**
   * <code>.spark.connect.Relation root = 1;</code>
   * @return The root.
   */
  org.apache.spark.connect.proto.Relation getRoot();
  /**
   * <code>.spark.connect.Relation root = 1;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getRootOrBuilder();

  /**
   * <code>.spark.connect.Command command = 2;</code>
   * @return Whether the command field is set.
   */
  boolean hasCommand();
  /**
   * <code>.spark.connect.Command command = 2;</code>
   * @return The command.
   */
  org.apache.spark.connect.proto.Command getCommand();
  /**
   * <code>.spark.connect.Command command = 2;</code>
   */
  org.apache.spark.connect.proto.CommandOrBuilder getCommandOrBuilder();

  org.apache.spark.connect.proto.Plan.OpTypeCase getOpTypeCase();
}
