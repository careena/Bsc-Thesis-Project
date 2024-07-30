// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * Collect arbitrary (named) metrics from a dataset.
 * </pre>
 *
 * Protobuf type {@code spark.connect.CollectMetrics}
 */
public final class CollectMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.CollectMetrics)
    CollectMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CollectMetrics.newBuilder() to construct.
  private CollectMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CollectMetrics() {
    name_ = "";
    metrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CollectMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_CollectMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_CollectMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.CollectMetrics.class, org.apache.spark.connect.proto.CollectMetrics.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private org.apache.spark.connect.proto.Relation input_;
  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  @java.lang.Override
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.Relation getInput() {
    return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
  }
  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder() {
    return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * (Required) Name of the metrics.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required) Name of the metrics.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRICS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<org.apache.spark.connect.proto.Expression> metrics_;
  /**
   * <pre>
   * (Required) The metric sequence.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression metrics = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.apache.spark.connect.proto.Expression> getMetricsList() {
    return metrics_;
  }
  /**
   * <pre>
   * (Required) The metric sequence.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression metrics = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   * <pre>
   * (Required) The metric sequence.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression metrics = 3;</code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   * <pre>
   * (Required) The metric sequence.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression metrics = 3;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.Expression getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   * <pre>
   * (Required) The metric sequence.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression metrics = 3;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.ExpressionOrBuilder getMetricsOrBuilder(
      int index) {
    return metrics_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (input_ != null) {
      output.writeMessage(1, getInput());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(3, metrics_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInput());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, metrics_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.spark.connect.proto.CollectMetrics)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.CollectMetrics other = (org.apache.spark.connect.proto.CollectMetrics) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (!getMetricsList()
        .equals(other.getMetricsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.CollectMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.CollectMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.CollectMetrics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.spark.connect.proto.CollectMetrics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Collect arbitrary (named) metrics from a dataset.
   * </pre>
   *
   * Protobuf type {@code spark.connect.CollectMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.CollectMetrics)
      org.apache.spark.connect.proto.CollectMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_CollectMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_CollectMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.CollectMetrics.class, org.apache.spark.connect.proto.CollectMetrics.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.CollectMetrics.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      input_ = null;
      if (inputBuilder_ != null) {
        inputBuilder_.dispose();
        inputBuilder_ = null;
      }
      name_ = "";
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
      } else {
        metrics_ = null;
        metricsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_CollectMetrics_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CollectMetrics getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.CollectMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CollectMetrics build() {
      org.apache.spark.connect.proto.CollectMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CollectMetrics buildPartial() {
      org.apache.spark.connect.proto.CollectMetrics result = new org.apache.spark.connect.proto.CollectMetrics(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.apache.spark.connect.proto.CollectMetrics result) {
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
      }
    }

    private void buildPartial0(org.apache.spark.connect.proto.CollectMetrics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.input_ = inputBuilder_ == null
            ? input_
            : inputBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.spark.connect.proto.CollectMetrics) {
        return mergeFrom((org.apache.spark.connect.proto.CollectMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.CollectMetrics other) {
      if (other == org.apache.spark.connect.proto.CollectMetrics.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000004);
            metricsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetricsFieldBuilder() : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getInputFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              org.apache.spark.connect.proto.Expression m =
                  input.readMessage(
                      org.apache.spark.connect.proto.Expression.parser(),
                      extensionRegistry);
              if (metricsBuilder_ == null) {
                ensureMetricsIsMutable();
                metrics_.add(m);
              } else {
                metricsBuilder_.addMessage(m);
              }
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private org.apache.spark.connect.proto.Relation input_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder> inputBuilder_;
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     * @return Whether the input field is set.
     */
    public boolean hasInput() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     * @return The input.
     */
    public org.apache.spark.connect.proto.Relation getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder setInput(org.apache.spark.connect.proto.Relation value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
      } else {
        inputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder setInput(
        org.apache.spark.connect.proto.Relation.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder mergeInput(org.apache.spark.connect.proto.Relation value) {
      if (inputBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          input_ != null &&
          input_ != org.apache.spark.connect.proto.Relation.getDefaultInstance()) {
          getInputBuilder().mergeFrom(value);
        } else {
          input_ = value;
        }
      } else {
        inputBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder clearInput() {
      bitField0_ = (bitField0_ & ~0x00000001);
      input_ = null;
      if (inputBuilder_ != null) {
        inputBuilder_.dispose();
        inputBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public org.apache.spark.connect.proto.Relation.Builder getInputBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
      }
    }
    /**
     * <pre>
     * (Required) The input relation.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * (Required) Name of the metrics.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required) Name of the metrics.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required) Name of the metrics.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Name of the metrics.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Name of the metrics.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<org.apache.spark.connect.proto.Expression> metrics_ =
      java.util.Collections.emptyList();
    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        metrics_ = new java.util.ArrayList<org.apache.spark.connect.proto.Expression>(metrics_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.spark.connect.proto.Expression, org.apache.spark.connect.proto.Expression.Builder, org.apache.spark.connect.proto.ExpressionOrBuilder> metricsBuilder_;

    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public java.util.List<org.apache.spark.connect.proto.Expression> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public org.apache.spark.connect.proto.Expression getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder setMetrics(
        int index, org.apache.spark.connect.proto.Expression value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder setMetrics(
        int index, org.apache.spark.connect.proto.Expression.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder addMetrics(org.apache.spark.connect.proto.Expression value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder addMetrics(
        int index, org.apache.spark.connect.proto.Expression value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder addMetrics(
        org.apache.spark.connect.proto.Expression.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder addMetrics(
        int index, org.apache.spark.connect.proto.Expression.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends org.apache.spark.connect.proto.Expression> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public org.apache.spark.connect.proto.Expression.Builder getMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public org.apache.spark.connect.proto.ExpressionOrBuilder getMetricsOrBuilder(
        int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);  } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
         getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public org.apache.spark.connect.proto.Expression.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder().addBuilder(
          org.apache.spark.connect.proto.Expression.getDefaultInstance());
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public org.apache.spark.connect.proto.Expression.Builder addMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().addBuilder(
          index, org.apache.spark.connect.proto.Expression.getDefaultInstance());
    }
    /**
     * <pre>
     * (Required) The metric sequence.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression metrics = 3;</code>
     */
    public java.util.List<org.apache.spark.connect.proto.Expression.Builder> 
         getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.spark.connect.proto.Expression, org.apache.spark.connect.proto.Expression.Builder, org.apache.spark.connect.proto.ExpressionOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.spark.connect.proto.Expression, org.apache.spark.connect.proto.Expression.Builder, org.apache.spark.connect.proto.ExpressionOrBuilder>(
                metrics_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:spark.connect.CollectMetrics)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.CollectMetrics)
  private static final org.apache.spark.connect.proto.CollectMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.CollectMetrics();
  }

  public static org.apache.spark.connect.proto.CollectMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CollectMetrics>
      PARSER = new com.google.protobuf.AbstractParser<CollectMetrics>() {
    @java.lang.Override
    public CollectMetrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CollectMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollectMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.CollectMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

