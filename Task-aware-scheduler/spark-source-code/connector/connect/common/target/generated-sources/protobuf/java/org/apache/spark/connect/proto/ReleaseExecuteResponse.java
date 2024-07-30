// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/base.proto

package org.apache.spark.connect.proto;

/**
 * Protobuf type {@code spark.connect.ReleaseExecuteResponse}
 */
public final class ReleaseExecuteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.ReleaseExecuteResponse)
    ReleaseExecuteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReleaseExecuteResponse.newBuilder() to construct.
  private ReleaseExecuteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReleaseExecuteResponse() {
    sessionId_ = "";
    operationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReleaseExecuteResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Base.internal_static_spark_connect_ReleaseExecuteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Base.internal_static_spark_connect_ReleaseExecuteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.ReleaseExecuteResponse.class, org.apache.spark.connect.proto.ReleaseExecuteResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SESSION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sessionId_ = "";
  /**
   * <pre>
   * Session id in which the release was running.
   * </pre>
   *
   * <code>string session_id = 1;</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Session id in which the release was running.
   * </pre>
   *
   * <code>string session_id = 1;</code>
   * @return The bytes for sessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATION_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object operationId_ = "";
  /**
   * <pre>
   * Operation id of the operation on which the release executed.
   * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
   * Otherwise, it will be equal to the operation_id from request.
   * </pre>
   *
   * <code>optional string operation_id = 2;</code>
   * @return Whether the operationId field is set.
   */
  @java.lang.Override
  public boolean hasOperationId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Operation id of the operation on which the release executed.
   * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
   * Otherwise, it will be equal to the operation_id from request.
   * </pre>
   *
   * <code>optional string operation_id = 2;</code>
   * @return The operationId.
   */
  @java.lang.Override
  public java.lang.String getOperationId() {
    java.lang.Object ref = operationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operationId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Operation id of the operation on which the release executed.
   * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
   * Otherwise, it will be equal to the operation_id from request.
   * </pre>
   *
   * <code>optional string operation_id = 2;</code>
   * @return The bytes for operationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOperationIdBytes() {
    java.lang.Object ref = operationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operationId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operationId_);
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
    if (!(obj instanceof org.apache.spark.connect.proto.ReleaseExecuteResponse)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.ReleaseExecuteResponse other = (org.apache.spark.connect.proto.ReleaseExecuteResponse) obj;

    if (!getSessionId()
        .equals(other.getSessionId())) return false;
    if (hasOperationId() != other.hasOperationId()) return false;
    if (hasOperationId()) {
      if (!getOperationId()
          .equals(other.getOperationId())) return false;
    }
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
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    if (hasOperationId()) {
      hash = (37 * hash) + OPERATION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOperationId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.ReleaseExecuteResponse parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.ReleaseExecuteResponse prototype) {
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
   * Protobuf type {@code spark.connect.ReleaseExecuteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.ReleaseExecuteResponse)
      org.apache.spark.connect.proto.ReleaseExecuteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Base.internal_static_spark_connect_ReleaseExecuteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Base.internal_static_spark_connect_ReleaseExecuteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.ReleaseExecuteResponse.class, org.apache.spark.connect.proto.ReleaseExecuteResponse.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.ReleaseExecuteResponse.newBuilder()
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
      sessionId_ = "";
      operationId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Base.internal_static_spark_connect_ReleaseExecuteResponse_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.ReleaseExecuteResponse getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.ReleaseExecuteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.ReleaseExecuteResponse build() {
      org.apache.spark.connect.proto.ReleaseExecuteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.ReleaseExecuteResponse buildPartial() {
      org.apache.spark.connect.proto.ReleaseExecuteResponse result = new org.apache.spark.connect.proto.ReleaseExecuteResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.ReleaseExecuteResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionId_ = sessionId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.operationId_ = operationId_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof org.apache.spark.connect.proto.ReleaseExecuteResponse) {
        return mergeFrom((org.apache.spark.connect.proto.ReleaseExecuteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.ReleaseExecuteResponse other) {
      if (other == org.apache.spark.connect.proto.ReleaseExecuteResponse.getDefaultInstance()) return this;
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOperationId()) {
        operationId_ = other.operationId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              sessionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              operationId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object sessionId_ = "";
    /**
     * <pre>
     * Session id in which the release was running.
     * </pre>
     *
     * <code>string session_id = 1;</code>
     * @return The sessionId.
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Session id in which the release was running.
     * </pre>
     *
     * <code>string session_id = 1;</code>
     * @return The bytes for sessionId.
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Session id in which the release was running.
     * </pre>
     *
     * <code>string session_id = 1;</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sessionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Session id in which the release was running.
     * </pre>
     *
     * <code>string session_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      sessionId_ = getDefaultInstance().getSessionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Session id in which the release was running.
     * </pre>
     *
     * <code>string session_id = 1;</code>
     * @param value The bytes for sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sessionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object operationId_ = "";
    /**
     * <pre>
     * Operation id of the operation on which the release executed.
     * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
     * Otherwise, it will be equal to the operation_id from request.
     * </pre>
     *
     * <code>optional string operation_id = 2;</code>
     * @return Whether the operationId field is set.
     */
    public boolean hasOperationId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Operation id of the operation on which the release executed.
     * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
     * Otherwise, it will be equal to the operation_id from request.
     * </pre>
     *
     * <code>optional string operation_id = 2;</code>
     * @return The operationId.
     */
    public java.lang.String getOperationId() {
      java.lang.Object ref = operationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Operation id of the operation on which the release executed.
     * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
     * Otherwise, it will be equal to the operation_id from request.
     * </pre>
     *
     * <code>optional string operation_id = 2;</code>
     * @return The bytes for operationId.
     */
    public com.google.protobuf.ByteString
        getOperationIdBytes() {
      java.lang.Object ref = operationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Operation id of the operation on which the release executed.
     * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
     * Otherwise, it will be equal to the operation_id from request.
     * </pre>
     *
     * <code>optional string operation_id = 2;</code>
     * @param value The operationId to set.
     * @return This builder for chaining.
     */
    public Builder setOperationId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      operationId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Operation id of the operation on which the release executed.
     * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
     * Otherwise, it will be equal to the operation_id from request.
     * </pre>
     *
     * <code>optional string operation_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperationId() {
      operationId_ = getDefaultInstance().getOperationId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Operation id of the operation on which the release executed.
     * If the operation couldn't be found (because e.g. it was concurrently released), will be unset.
     * Otherwise, it will be equal to the operation_id from request.
     * </pre>
     *
     * <code>optional string operation_id = 2;</code>
     * @param value The bytes for operationId to set.
     * @return This builder for chaining.
     */
    public Builder setOperationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      operationId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.ReleaseExecuteResponse)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.ReleaseExecuteResponse)
  private static final org.apache.spark.connect.proto.ReleaseExecuteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.ReleaseExecuteResponse();
  }

  public static org.apache.spark.connect.proto.ReleaseExecuteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReleaseExecuteResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReleaseExecuteResponse>() {
    @java.lang.Override
    public ReleaseExecuteResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReleaseExecuteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReleaseExecuteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.ReleaseExecuteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
