// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * Projection of a bag of expressions for a given input relation.
 *
 * The input relation must be specified.
 * The projected expression can be an arbitrary expression.
 * </pre>
 *
 * Protobuf type {@code spark.connect.Project}
 */
public final class Project extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.Project)
    ProjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Project.newBuilder() to construct.
  private Project(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Project() {
    expressions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Project();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Project_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Project_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.Project.class, org.apache.spark.connect.proto.Project.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private org.apache.spark.connect.proto.Relation input_;
  /**
   * <pre>
   * (Optional) Input relation is optional for Project.
   *
   * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
   * (Optional) Input relation is optional for Project.
   *
   * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
   * (Optional) Input relation is optional for Project.
   *
   * For example, `SELECT ABS(-1)` is valid plan without an input plan.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder() {
    return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
  }

  public static final int EXPRESSIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<org.apache.spark.connect.proto.Expression> expressions_;
  /**
   * <pre>
   * (Required) A Project requires at least one expression.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression expressions = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.apache.spark.connect.proto.Expression> getExpressionsList() {
    return expressions_;
  }
  /**
   * <pre>
   * (Required) A Project requires at least one expression.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression expressions = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getExpressionsOrBuilderList() {
    return expressions_;
  }
  /**
   * <pre>
   * (Required) A Project requires at least one expression.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression expressions = 3;</code>
   */
  @java.lang.Override
  public int getExpressionsCount() {
    return expressions_.size();
  }
  /**
   * <pre>
   * (Required) A Project requires at least one expression.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression expressions = 3;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.Expression getExpressions(int index) {
    return expressions_.get(index);
  }
  /**
   * <pre>
   * (Required) A Project requires at least one expression.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression expressions = 3;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.ExpressionOrBuilder getExpressionsOrBuilder(
      int index) {
    return expressions_.get(index);
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
    for (int i = 0; i < expressions_.size(); i++) {
      output.writeMessage(3, expressions_.get(i));
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
    for (int i = 0; i < expressions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, expressions_.get(i));
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
    if (!(obj instanceof org.apache.spark.connect.proto.Project)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.Project other = (org.apache.spark.connect.proto.Project) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!getExpressionsList()
        .equals(other.getExpressionsList())) return false;
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
    if (getExpressionsCount() > 0) {
      hash = (37 * hash) + EXPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getExpressionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.Project parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.Project parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.Project parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.Project parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.Project prototype) {
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
   * Projection of a bag of expressions for a given input relation.
   *
   * The input relation must be specified.
   * The projected expression can be an arbitrary expression.
   * </pre>
   *
   * Protobuf type {@code spark.connect.Project}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.Project)
      org.apache.spark.connect.proto.ProjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Project_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Project_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.Project.class, org.apache.spark.connect.proto.Project.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.Project.newBuilder()
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
      if (expressionsBuilder_ == null) {
        expressions_ = java.util.Collections.emptyList();
      } else {
        expressions_ = null;
        expressionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Project_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Project getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.Project.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Project build() {
      org.apache.spark.connect.proto.Project result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Project buildPartial() {
      org.apache.spark.connect.proto.Project result = new org.apache.spark.connect.proto.Project(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.apache.spark.connect.proto.Project result) {
      if (expressionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          expressions_ = java.util.Collections.unmodifiableList(expressions_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.expressions_ = expressions_;
      } else {
        result.expressions_ = expressionsBuilder_.build();
      }
    }

    private void buildPartial0(org.apache.spark.connect.proto.Project result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.input_ = inputBuilder_ == null
            ? input_
            : inputBuilder_.build();
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
      if (other instanceof org.apache.spark.connect.proto.Project) {
        return mergeFrom((org.apache.spark.connect.proto.Project)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.Project other) {
      if (other == org.apache.spark.connect.proto.Project.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (expressionsBuilder_ == null) {
        if (!other.expressions_.isEmpty()) {
          if (expressions_.isEmpty()) {
            expressions_ = other.expressions_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureExpressionsIsMutable();
            expressions_.addAll(other.expressions_);
          }
          onChanged();
        }
      } else {
        if (!other.expressions_.isEmpty()) {
          if (expressionsBuilder_.isEmpty()) {
            expressionsBuilder_.dispose();
            expressionsBuilder_ = null;
            expressions_ = other.expressions_;
            bitField0_ = (bitField0_ & ~0x00000002);
            expressionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExpressionsFieldBuilder() : null;
          } else {
            expressionsBuilder_.addAllMessages(other.expressions_);
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
            case 26: {
              org.apache.spark.connect.proto.Expression m =
                  input.readMessage(
                      org.apache.spark.connect.proto.Expression.parser(),
                      extensionRegistry);
              if (expressionsBuilder_ == null) {
                ensureExpressionsIsMutable();
                expressions_.add(m);
              } else {
                expressionsBuilder_.addMessage(m);
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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
     * (Optional) Input relation is optional for Project.
     *
     * For example, `SELECT ABS(-1)` is valid plan without an input plan.
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

    private java.util.List<org.apache.spark.connect.proto.Expression> expressions_ =
      java.util.Collections.emptyList();
    private void ensureExpressionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        expressions_ = new java.util.ArrayList<org.apache.spark.connect.proto.Expression>(expressions_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.spark.connect.proto.Expression, org.apache.spark.connect.proto.Expression.Builder, org.apache.spark.connect.proto.ExpressionOrBuilder> expressionsBuilder_;

    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public java.util.List<org.apache.spark.connect.proto.Expression> getExpressionsList() {
      if (expressionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(expressions_);
      } else {
        return expressionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public int getExpressionsCount() {
      if (expressionsBuilder_ == null) {
        return expressions_.size();
      } else {
        return expressionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public org.apache.spark.connect.proto.Expression getExpressions(int index) {
      if (expressionsBuilder_ == null) {
        return expressions_.get(index);
      } else {
        return expressionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder setExpressions(
        int index, org.apache.spark.connect.proto.Expression value) {
      if (expressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionsIsMutable();
        expressions_.set(index, value);
        onChanged();
      } else {
        expressionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder setExpressions(
        int index, org.apache.spark.connect.proto.Expression.Builder builderForValue) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        expressions_.set(index, builderForValue.build());
        onChanged();
      } else {
        expressionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder addExpressions(org.apache.spark.connect.proto.Expression value) {
      if (expressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionsIsMutable();
        expressions_.add(value);
        onChanged();
      } else {
        expressionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder addExpressions(
        int index, org.apache.spark.connect.proto.Expression value) {
      if (expressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionsIsMutable();
        expressions_.add(index, value);
        onChanged();
      } else {
        expressionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder addExpressions(
        org.apache.spark.connect.proto.Expression.Builder builderForValue) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        expressions_.add(builderForValue.build());
        onChanged();
      } else {
        expressionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder addExpressions(
        int index, org.apache.spark.connect.proto.Expression.Builder builderForValue) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        expressions_.add(index, builderForValue.build());
        onChanged();
      } else {
        expressionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder addAllExpressions(
        java.lang.Iterable<? extends org.apache.spark.connect.proto.Expression> values) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, expressions_);
        onChanged();
      } else {
        expressionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder clearExpressions() {
      if (expressionsBuilder_ == null) {
        expressions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        expressionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public Builder removeExpressions(int index) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        expressions_.remove(index);
        onChanged();
      } else {
        expressionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public org.apache.spark.connect.proto.Expression.Builder getExpressionsBuilder(
        int index) {
      return getExpressionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public org.apache.spark.connect.proto.ExpressionOrBuilder getExpressionsOrBuilder(
        int index) {
      if (expressionsBuilder_ == null) {
        return expressions_.get(index);  } else {
        return expressionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
         getExpressionsOrBuilderList() {
      if (expressionsBuilder_ != null) {
        return expressionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(expressions_);
      }
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public org.apache.spark.connect.proto.Expression.Builder addExpressionsBuilder() {
      return getExpressionsFieldBuilder().addBuilder(
          org.apache.spark.connect.proto.Expression.getDefaultInstance());
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public org.apache.spark.connect.proto.Expression.Builder addExpressionsBuilder(
        int index) {
      return getExpressionsFieldBuilder().addBuilder(
          index, org.apache.spark.connect.proto.Expression.getDefaultInstance());
    }
    /**
     * <pre>
     * (Required) A Project requires at least one expression.
     * </pre>
     *
     * <code>repeated .spark.connect.Expression expressions = 3;</code>
     */
    public java.util.List<org.apache.spark.connect.proto.Expression.Builder> 
         getExpressionsBuilderList() {
      return getExpressionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.spark.connect.proto.Expression, org.apache.spark.connect.proto.Expression.Builder, org.apache.spark.connect.proto.ExpressionOrBuilder> 
        getExpressionsFieldBuilder() {
      if (expressionsBuilder_ == null) {
        expressionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.spark.connect.proto.Expression, org.apache.spark.connect.proto.Expression.Builder, org.apache.spark.connect.proto.ExpressionOrBuilder>(
                expressions_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        expressions_ = null;
      }
      return expressionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.Project)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.Project)
  private static final org.apache.spark.connect.proto.Project DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.Project();
  }

  public static org.apache.spark.connect.proto.Project getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Project>
      PARSER = new com.google.protobuf.AbstractParser<Project>() {
    @java.lang.Override
    public Project parsePartialFrom(
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

  public static com.google.protobuf.Parser<Project> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Project> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.Project getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
