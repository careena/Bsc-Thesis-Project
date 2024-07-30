// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/commands.proto

package org.apache.spark.connect.proto;

public interface StreamingQueryCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.StreamingQueryCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) Query instance. See `StreamingQueryInstanceId`.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryInstanceId query_id = 1;</code>
   * @return Whether the queryId field is set.
   */
  boolean hasQueryId();
  /**
   * <pre>
   * (Required) Query instance. See `StreamingQueryInstanceId`.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryInstanceId query_id = 1;</code>
   * @return The queryId.
   */
  org.apache.spark.connect.proto.StreamingQueryInstanceId getQueryId();
  /**
   * <pre>
   * (Required) Query instance. See `StreamingQueryInstanceId`.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryInstanceId query_id = 1;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryInstanceIdOrBuilder getQueryIdOrBuilder();

  /**
   * <pre>
   * status() API.
   * </pre>
   *
   * <code>bool status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status() API.
   * </pre>
   *
   * <code>bool status = 2;</code>
   * @return The status.
   */
  boolean getStatus();

  /**
   * <pre>
   * lastProgress() API.
   * </pre>
   *
   * <code>bool last_progress = 3;</code>
   * @return Whether the lastProgress field is set.
   */
  boolean hasLastProgress();
  /**
   * <pre>
   * lastProgress() API.
   * </pre>
   *
   * <code>bool last_progress = 3;</code>
   * @return The lastProgress.
   */
  boolean getLastProgress();

  /**
   * <pre>
   * recentProgress() API.
   * </pre>
   *
   * <code>bool recent_progress = 4;</code>
   * @return Whether the recentProgress field is set.
   */
  boolean hasRecentProgress();
  /**
   * <pre>
   * recentProgress() API.
   * </pre>
   *
   * <code>bool recent_progress = 4;</code>
   * @return The recentProgress.
   */
  boolean getRecentProgress();

  /**
   * <pre>
   * stop() API. Stops the query.
   * </pre>
   *
   * <code>bool stop = 5;</code>
   * @return Whether the stop field is set.
   */
  boolean hasStop();
  /**
   * <pre>
   * stop() API. Stops the query.
   * </pre>
   *
   * <code>bool stop = 5;</code>
   * @return The stop.
   */
  boolean getStop();

  /**
   * <pre>
   * processAllAvailable() API. Waits till all the available data is processed
   * </pre>
   *
   * <code>bool process_all_available = 6;</code>
   * @return Whether the processAllAvailable field is set.
   */
  boolean hasProcessAllAvailable();
  /**
   * <pre>
   * processAllAvailable() API. Waits till all the available data is processed
   * </pre>
   *
   * <code>bool process_all_available = 6;</code>
   * @return The processAllAvailable.
   */
  boolean getProcessAllAvailable();

  /**
   * <pre>
   * explain() API. Returns logical and physical plans.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryCommand.ExplainCommand explain = 7;</code>
   * @return Whether the explain field is set.
   */
  boolean hasExplain();
  /**
   * <pre>
   * explain() API. Returns logical and physical plans.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryCommand.ExplainCommand explain = 7;</code>
   * @return The explain.
   */
  org.apache.spark.connect.proto.StreamingQueryCommand.ExplainCommand getExplain();
  /**
   * <pre>
   * explain() API. Returns logical and physical plans.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryCommand.ExplainCommand explain = 7;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryCommand.ExplainCommandOrBuilder getExplainOrBuilder();

  /**
   * <pre>
   * exception() API. Returns the exception in the query if any.
   * </pre>
   *
   * <code>bool exception = 8;</code>
   * @return Whether the exception field is set.
   */
  boolean hasException();
  /**
   * <pre>
   * exception() API. Returns the exception in the query if any.
   * </pre>
   *
   * <code>bool exception = 8;</code>
   * @return The exception.
   */
  boolean getException();

  /**
   * <pre>
   * awaitTermination() API. Waits for the termination of the query.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryCommand.AwaitTerminationCommand await_termination = 9;</code>
   * @return Whether the awaitTermination field is set.
   */
  boolean hasAwaitTermination();
  /**
   * <pre>
   * awaitTermination() API. Waits for the termination of the query.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryCommand.AwaitTerminationCommand await_termination = 9;</code>
   * @return The awaitTermination.
   */
  org.apache.spark.connect.proto.StreamingQueryCommand.AwaitTerminationCommand getAwaitTermination();
  /**
   * <pre>
   * awaitTermination() API. Waits for the termination of the query.
   * </pre>
   *
   * <code>.spark.connect.StreamingQueryCommand.AwaitTerminationCommand await_termination = 9;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryCommand.AwaitTerminationCommandOrBuilder getAwaitTerminationOrBuilder();

  org.apache.spark.connect.proto.StreamingQueryCommand.CommandCase getCommandCase();
}