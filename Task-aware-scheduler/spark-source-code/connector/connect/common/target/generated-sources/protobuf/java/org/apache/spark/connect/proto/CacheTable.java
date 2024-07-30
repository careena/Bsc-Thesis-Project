// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/catalog.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * See `spark.catalog.cacheTable`
 * </pre>
 *
 * Protobuf type {@code spark.connect.CacheTable}
 */
public final class CacheTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.CacheTable)
    CacheTableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CacheTable.newBuilder() to construct.
  private CacheTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CacheTable() {
    tableName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CacheTable();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_CacheTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_CacheTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.CacheTable.class, org.apache.spark.connect.proto.CacheTable.Builder.class);
  }

  private int bitField0_;
  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tableName_ = "";
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The tableName.
   */
  @java.lang.Override
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The bytes for tableName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORAGE_LEVEL_FIELD_NUMBER = 2;
  private org.apache.spark.connect.proto.StorageLevel storageLevel_;
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
   * @return Whether the storageLevel field is set.
   */
  @java.lang.Override
  public boolean hasStorageLevel() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
   * @return The storageLevel.
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.StorageLevel getStorageLevel() {
    return storageLevel_ == null ? org.apache.spark.connect.proto.StorageLevel.getDefaultInstance() : storageLevel_;
  }
  /**
   * <pre>
   * (Optional)
   * </pre>
   *
   * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.StorageLevelOrBuilder getStorageLevelOrBuilder() {
    return storageLevel_ == null ? org.apache.spark.connect.proto.StorageLevel.getDefaultInstance() : storageLevel_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getStorageLevel());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStorageLevel());
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
    if (!(obj instanceof org.apache.spark.connect.proto.CacheTable)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.CacheTable other = (org.apache.spark.connect.proto.CacheTable) obj;

    if (!getTableName()
        .equals(other.getTableName())) return false;
    if (hasStorageLevel() != other.hasStorageLevel()) return false;
    if (hasStorageLevel()) {
      if (!getStorageLevel()
          .equals(other.getStorageLevel())) return false;
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
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    if (hasStorageLevel()) {
      hash = (37 * hash) + STORAGE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getStorageLevel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.CacheTable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.CacheTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.CacheTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.CacheTable parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.CacheTable prototype) {
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
   * See `spark.catalog.cacheTable`
   * </pre>
   *
   * Protobuf type {@code spark.connect.CacheTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.CacheTable)
      org.apache.spark.connect.proto.CacheTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_CacheTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_CacheTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.CacheTable.class, org.apache.spark.connect.proto.CacheTable.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.CacheTable.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStorageLevelFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tableName_ = "";
      storageLevel_ = null;
      if (storageLevelBuilder_ != null) {
        storageLevelBuilder_.dispose();
        storageLevelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_CacheTable_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CacheTable getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.CacheTable.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CacheTable build() {
      org.apache.spark.connect.proto.CacheTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.CacheTable buildPartial() {
      org.apache.spark.connect.proto.CacheTable result = new org.apache.spark.connect.proto.CacheTable(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.CacheTable result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tableName_ = tableName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.storageLevel_ = storageLevelBuilder_ == null
            ? storageLevel_
            : storageLevelBuilder_.build();
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
      if (other instanceof org.apache.spark.connect.proto.CacheTable) {
        return mergeFrom((org.apache.spark.connect.proto.CacheTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.CacheTable other) {
      if (other == org.apache.spark.connect.proto.CacheTable.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasStorageLevel()) {
        mergeStorageLevel(other.getStorageLevel());
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
              tableName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStorageLevelFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object tableName_ = "";
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @return The tableName.
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @return The bytes for tableName.
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @param value The tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tableName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTableName() {
      tableName_ = getDefaultInstance().getTableName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @param value The bytes for tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tableName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private org.apache.spark.connect.proto.StorageLevel storageLevel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.StorageLevel, org.apache.spark.connect.proto.StorageLevel.Builder, org.apache.spark.connect.proto.StorageLevelOrBuilder> storageLevelBuilder_;
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     * @return Whether the storageLevel field is set.
     */
    public boolean hasStorageLevel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     * @return The storageLevel.
     */
    public org.apache.spark.connect.proto.StorageLevel getStorageLevel() {
      if (storageLevelBuilder_ == null) {
        return storageLevel_ == null ? org.apache.spark.connect.proto.StorageLevel.getDefaultInstance() : storageLevel_;
      } else {
        return storageLevelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     */
    public Builder setStorageLevel(org.apache.spark.connect.proto.StorageLevel value) {
      if (storageLevelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        storageLevel_ = value;
      } else {
        storageLevelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     */
    public Builder setStorageLevel(
        org.apache.spark.connect.proto.StorageLevel.Builder builderForValue) {
      if (storageLevelBuilder_ == null) {
        storageLevel_ = builderForValue.build();
      } else {
        storageLevelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     */
    public Builder mergeStorageLevel(org.apache.spark.connect.proto.StorageLevel value) {
      if (storageLevelBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          storageLevel_ != null &&
          storageLevel_ != org.apache.spark.connect.proto.StorageLevel.getDefaultInstance()) {
          getStorageLevelBuilder().mergeFrom(value);
        } else {
          storageLevel_ = value;
        }
      } else {
        storageLevelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     */
    public Builder clearStorageLevel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      storageLevel_ = null;
      if (storageLevelBuilder_ != null) {
        storageLevelBuilder_.dispose();
        storageLevelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     */
    public org.apache.spark.connect.proto.StorageLevel.Builder getStorageLevelBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStorageLevelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     */
    public org.apache.spark.connect.proto.StorageLevelOrBuilder getStorageLevelOrBuilder() {
      if (storageLevelBuilder_ != null) {
        return storageLevelBuilder_.getMessageOrBuilder();
      } else {
        return storageLevel_ == null ?
            org.apache.spark.connect.proto.StorageLevel.getDefaultInstance() : storageLevel_;
      }
    }
    /**
     * <pre>
     * (Optional)
     * </pre>
     *
     * <code>optional .spark.connect.StorageLevel storage_level = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.StorageLevel, org.apache.spark.connect.proto.StorageLevel.Builder, org.apache.spark.connect.proto.StorageLevelOrBuilder> 
        getStorageLevelFieldBuilder() {
      if (storageLevelBuilder_ == null) {
        storageLevelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.spark.connect.proto.StorageLevel, org.apache.spark.connect.proto.StorageLevel.Builder, org.apache.spark.connect.proto.StorageLevelOrBuilder>(
                getStorageLevel(),
                getParentForChildren(),
                isClean());
        storageLevel_ = null;
      }
      return storageLevelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.CacheTable)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.CacheTable)
  private static final org.apache.spark.connect.proto.CacheTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.CacheTable();
  }

  public static org.apache.spark.connect.proto.CacheTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CacheTable>
      PARSER = new com.google.protobuf.AbstractParser<CacheTable>() {
    @java.lang.Override
    public CacheTable parsePartialFrom(
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

  public static com.google.protobuf.Parser<CacheTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CacheTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.CacheTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
