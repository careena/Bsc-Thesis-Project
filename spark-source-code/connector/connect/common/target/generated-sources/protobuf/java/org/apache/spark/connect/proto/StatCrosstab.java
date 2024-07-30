// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * Computes a pair-wise frequency table of the given columns. Also known as a contingency table.
 * It will invoke 'Dataset.stat.crosstab' (same as 'StatFunctions.crossTabulate')
 * to compute the results.
 * </pre>
 *
 * Protobuf type {@code spark.connect.StatCrosstab}
 */
public final class StatCrosstab extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.StatCrosstab)
    StatCrosstabOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatCrosstab.newBuilder() to construct.
  private StatCrosstab(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatCrosstab() {
    col1_ = "";
    col2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatCrosstab();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_StatCrosstab_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_StatCrosstab_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.StatCrosstab.class, org.apache.spark.connect.proto.StatCrosstab.Builder.class);
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

  public static final int COL1_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object col1_ = "";
  /**
   * <pre>
   * (Required) The name of the first column.
   *
   * Distinct items will make the first item of each row.
   * </pre>
   *
   * <code>string col1 = 2;</code>
   * @return The col1.
   */
  @java.lang.Override
  public java.lang.String getCol1() {
    java.lang.Object ref = col1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      col1_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required) The name of the first column.
   *
   * Distinct items will make the first item of each row.
   * </pre>
   *
   * <code>string col1 = 2;</code>
   * @return The bytes for col1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCol1Bytes() {
    java.lang.Object ref = col1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      col1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COL2_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object col2_ = "";
  /**
   * <pre>
   * (Required) The name of the second column.
   *
   * Distinct items will make the column names of the DataFrame.
   * </pre>
   *
   * <code>string col2 = 3;</code>
   * @return The col2.
   */
  @java.lang.Override
  public java.lang.String getCol2() {
    java.lang.Object ref = col2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      col2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required) The name of the second column.
   *
   * Distinct items will make the column names of the DataFrame.
   * </pre>
   *
   * <code>string col2 = 3;</code>
   * @return The bytes for col2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCol2Bytes() {
    java.lang.Object ref = col2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      col2_ = b;
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
    if (input_ != null) {
      output.writeMessage(1, getInput());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(col1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, col1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(col2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, col2_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(col1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, col1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(col2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, col2_);
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
    if (!(obj instanceof org.apache.spark.connect.proto.StatCrosstab)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.StatCrosstab other = (org.apache.spark.connect.proto.StatCrosstab) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!getCol1()
        .equals(other.getCol1())) return false;
    if (!getCol2()
        .equals(other.getCol2())) return false;
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
    hash = (37 * hash) + COL1_FIELD_NUMBER;
    hash = (53 * hash) + getCol1().hashCode();
    hash = (37 * hash) + COL2_FIELD_NUMBER;
    hash = (53 * hash) + getCol2().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.StatCrosstab parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.StatCrosstab parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.StatCrosstab parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.StatCrosstab prototype) {
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
   * Computes a pair-wise frequency table of the given columns. Also known as a contingency table.
   * It will invoke 'Dataset.stat.crosstab' (same as 'StatFunctions.crossTabulate')
   * to compute the results.
   * </pre>
   *
   * Protobuf type {@code spark.connect.StatCrosstab}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.StatCrosstab)
      org.apache.spark.connect.proto.StatCrosstabOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_StatCrosstab_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_StatCrosstab_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.StatCrosstab.class, org.apache.spark.connect.proto.StatCrosstab.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.StatCrosstab.newBuilder()
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
      col1_ = "";
      col2_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_StatCrosstab_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.StatCrosstab getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.StatCrosstab.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.StatCrosstab build() {
      org.apache.spark.connect.proto.StatCrosstab result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.StatCrosstab buildPartial() {
      org.apache.spark.connect.proto.StatCrosstab result = new org.apache.spark.connect.proto.StatCrosstab(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.StatCrosstab result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.input_ = inputBuilder_ == null
            ? input_
            : inputBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.col1_ = col1_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.col2_ = col2_;
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
      if (other instanceof org.apache.spark.connect.proto.StatCrosstab) {
        return mergeFrom((org.apache.spark.connect.proto.StatCrosstab)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.StatCrosstab other) {
      if (other == org.apache.spark.connect.proto.StatCrosstab.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (!other.getCol1().isEmpty()) {
        col1_ = other.col1_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCol2().isEmpty()) {
        col2_ = other.col2_;
        bitField0_ |= 0x00000004;
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
              input.readMessage(
                  getInputFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              col1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              col2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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

    private java.lang.Object col1_ = "";
    /**
     * <pre>
     * (Required) The name of the first column.
     *
     * Distinct items will make the first item of each row.
     * </pre>
     *
     * <code>string col1 = 2;</code>
     * @return The col1.
     */
    public java.lang.String getCol1() {
      java.lang.Object ref = col1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        col1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required) The name of the first column.
     *
     * Distinct items will make the first item of each row.
     * </pre>
     *
     * <code>string col1 = 2;</code>
     * @return The bytes for col1.
     */
    public com.google.protobuf.ByteString
        getCol1Bytes() {
      java.lang.Object ref = col1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        col1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required) The name of the first column.
     *
     * Distinct items will make the first item of each row.
     * </pre>
     *
     * <code>string col1 = 2;</code>
     * @param value The col1 to set.
     * @return This builder for chaining.
     */
    public Builder setCol1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      col1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The name of the first column.
     *
     * Distinct items will make the first item of each row.
     * </pre>
     *
     * <code>string col1 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCol1() {
      col1_ = getDefaultInstance().getCol1();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The name of the first column.
     *
     * Distinct items will make the first item of each row.
     * </pre>
     *
     * <code>string col1 = 2;</code>
     * @param value The bytes for col1 to set.
     * @return This builder for chaining.
     */
    public Builder setCol1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      col1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object col2_ = "";
    /**
     * <pre>
     * (Required) The name of the second column.
     *
     * Distinct items will make the column names of the DataFrame.
     * </pre>
     *
     * <code>string col2 = 3;</code>
     * @return The col2.
     */
    public java.lang.String getCol2() {
      java.lang.Object ref = col2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        col2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required) The name of the second column.
     *
     * Distinct items will make the column names of the DataFrame.
     * </pre>
     *
     * <code>string col2 = 3;</code>
     * @return The bytes for col2.
     */
    public com.google.protobuf.ByteString
        getCol2Bytes() {
      java.lang.Object ref = col2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        col2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required) The name of the second column.
     *
     * Distinct items will make the column names of the DataFrame.
     * </pre>
     *
     * <code>string col2 = 3;</code>
     * @param value The col2 to set.
     * @return This builder for chaining.
     */
    public Builder setCol2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      col2_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The name of the second column.
     *
     * Distinct items will make the column names of the DataFrame.
     * </pre>
     *
     * <code>string col2 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCol2() {
      col2_ = getDefaultInstance().getCol2();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The name of the second column.
     *
     * Distinct items will make the column names of the DataFrame.
     * </pre>
     *
     * <code>string col2 = 3;</code>
     * @param value The bytes for col2 to set.
     * @return This builder for chaining.
     */
    public Builder setCol2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      col2_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.StatCrosstab)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.StatCrosstab)
  private static final org.apache.spark.connect.proto.StatCrosstab DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.StatCrosstab();
  }

  public static org.apache.spark.connect.proto.StatCrosstab getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatCrosstab>
      PARSER = new com.google.protobuf.AbstractParser<StatCrosstab>() {
    @java.lang.Override
    public StatCrosstab parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatCrosstab> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatCrosstab> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.StatCrosstab getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

