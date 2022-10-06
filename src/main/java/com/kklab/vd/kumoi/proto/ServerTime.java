// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

/**
 * Protobuf type {@code omega.ServerTime}
 */
public final class ServerTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:omega.ServerTime)
    ServerTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerTime.newBuilder() to construct.
  private ServerTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerTime() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerTime();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerTime(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 16: {

            unixNano_ = input.readInt64();
            break;
          }
          case 24: {

            unixTimestamp_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_ServerTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_ServerTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kklab.vd.kumoi.proto.ServerTime.class, com.kklab.vd.kumoi.proto.ServerTime.Builder.class);
  }

  public static final int UNIX_NANO_FIELD_NUMBER = 2;
  private long unixNano_;
  /**
   * <code>int64 unix_nano = 2[json_name = "n", jstype = JS_STRING];</code>
   * @return The unixNano.
   */
  @java.lang.Override
  public long getUnixNano() {
    return unixNano_;
  }

  public static final int UNIX_TIMESTAMP_FIELD_NUMBER = 3;
  private long unixTimestamp_;
  /**
   * <code>int64 unix_timestamp = 3[json_name = "t", jstype = JS_STRING];</code>
   * @return The unixTimestamp.
   */
  @java.lang.Override
  public long getUnixTimestamp() {
    return unixTimestamp_;
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
    if (unixNano_ != 0L) {
      output.writeInt64(2, unixNano_);
    }
    if (unixTimestamp_ != 0L) {
      output.writeInt64(3, unixTimestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (unixNano_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, unixNano_);
    }
    if (unixTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, unixTimestamp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.kklab.vd.kumoi.proto.ServerTime)) {
      return super.equals(obj);
    }
    com.kklab.vd.kumoi.proto.ServerTime other = (com.kklab.vd.kumoi.proto.ServerTime) obj;

    if (getUnixNano()
        != other.getUnixNano()) return false;
    if (getUnixTimestamp()
        != other.getUnixTimestamp()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UNIX_NANO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnixNano());
    hash = (37 * hash) + UNIX_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnixTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.ServerTime parseFrom(
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
  public static Builder newBuilder(com.kklab.vd.kumoi.proto.ServerTime prototype) {
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
   * Protobuf type {@code omega.ServerTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:omega.ServerTime)
      com.kklab.vd.kumoi.proto.ServerTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_ServerTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_ServerTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kklab.vd.kumoi.proto.ServerTime.class, com.kklab.vd.kumoi.proto.ServerTime.Builder.class);
    }

    // Construct using com.kklab.vd.kumoi.proto.ServerTime.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      unixNano_ = 0L;

      unixTimestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_ServerTime_descriptor;
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.ServerTime getDefaultInstanceForType() {
      return com.kklab.vd.kumoi.proto.ServerTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.ServerTime build() {
      com.kklab.vd.kumoi.proto.ServerTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.ServerTime buildPartial() {
      com.kklab.vd.kumoi.proto.ServerTime result = new com.kklab.vd.kumoi.proto.ServerTime(this);
      result.unixNano_ = unixNano_;
      result.unixTimestamp_ = unixTimestamp_;
      onBuilt();
      return result;
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
      if (other instanceof com.kklab.vd.kumoi.proto.ServerTime) {
        return mergeFrom((com.kklab.vd.kumoi.proto.ServerTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kklab.vd.kumoi.proto.ServerTime other) {
      if (other == com.kklab.vd.kumoi.proto.ServerTime.getDefaultInstance()) return this;
      if (other.getUnixNano() != 0L) {
        setUnixNano(other.getUnixNano());
      }
      if (other.getUnixTimestamp() != 0L) {
        setUnixTimestamp(other.getUnixTimestamp());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.kklab.vd.kumoi.proto.ServerTime parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kklab.vd.kumoi.proto.ServerTime) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long unixNano_ ;
    /**
     * <code>int64 unix_nano = 2[json_name = "n", jstype = JS_STRING];</code>
     * @return The unixNano.
     */
    @java.lang.Override
    public long getUnixNano() {
      return unixNano_;
    }
    /**
     * <code>int64 unix_nano = 2[json_name = "n", jstype = JS_STRING];</code>
     * @param value The unixNano to set.
     * @return This builder for chaining.
     */
    public Builder setUnixNano(long value) {
      
      unixNano_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 unix_nano = 2[json_name = "n", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnixNano() {
      
      unixNano_ = 0L;
      onChanged();
      return this;
    }

    private long unixTimestamp_ ;
    /**
     * <code>int64 unix_timestamp = 3[json_name = "t", jstype = JS_STRING];</code>
     * @return The unixTimestamp.
     */
    @java.lang.Override
    public long getUnixTimestamp() {
      return unixTimestamp_;
    }
    /**
     * <code>int64 unix_timestamp = 3[json_name = "t", jstype = JS_STRING];</code>
     * @param value The unixTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setUnixTimestamp(long value) {
      
      unixTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 unix_timestamp = 3[json_name = "t", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnixTimestamp() {
      
      unixTimestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:omega.ServerTime)
  }

  // @@protoc_insertion_point(class_scope:omega.ServerTime)
  private static final com.kklab.vd.kumoi.proto.ServerTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kklab.vd.kumoi.proto.ServerTime();
  }

  public static com.kklab.vd.kumoi.proto.ServerTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerTime>
      PARSER = new com.google.protobuf.AbstractParser<ServerTime>() {
    @java.lang.Override
    public ServerTime parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerTime(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kklab.vd.kumoi.proto.ServerTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
