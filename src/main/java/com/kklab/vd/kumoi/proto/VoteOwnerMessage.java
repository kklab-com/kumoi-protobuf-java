// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

/**
 * Protobuf type {@code omega.VoteOwnerMessage}
 */
public final class VoteOwnerMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:omega.VoteOwnerMessage)
    VoteOwnerMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoteOwnerMessage.newBuilder() to construct.
  private VoteOwnerMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoteOwnerMessage() {
    voteId_ = "";
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VoteOwnerMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VoteOwnerMessage(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            voteId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 64: {

            sequential_ = input.readBool();
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
    return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_VoteOwnerMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_VoteOwnerMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kklab.vd.kumoi.proto.VoteOwnerMessage.class, com.kklab.vd.kumoi.proto.VoteOwnerMessage.Builder.class);
  }

  public static final int VOTE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object voteId_;
  /**
   * <code>string vote_id = 1[json_name = "vt"];</code>
   * @return The voteId.
   */
  @java.lang.Override
  public java.lang.String getVoteId() {
    java.lang.Object ref = voteId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      voteId_ = s;
      return s;
    }
  }
  /**
   * <code>string vote_id = 1[json_name = "vt"];</code>
   * @return The bytes for voteId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVoteIdBytes() {
    java.lang.Object ref = voteId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      voteId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2[json_name = "m"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2[json_name = "m"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEQUENTIAL_FIELD_NUMBER = 8;
  private boolean sequential_;
  /**
   * <pre>
   *  google.protobuf.Struct metadata = 10 [json_name = "mta"];
   *  Skill skill = 11 [json_name = "sk"];
   * </pre>
   *
   * <code>bool sequential = 8[json_name = "se"];</code>
   * @return The sequential.
   */
  @java.lang.Override
  public boolean getSequential() {
    return sequential_;
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
    if (!getVoteIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, voteId_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (sequential_ != false) {
      output.writeBool(8, sequential_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVoteIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, voteId_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (sequential_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, sequential_);
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
    if (!(obj instanceof com.kklab.vd.kumoi.proto.VoteOwnerMessage)) {
      return super.equals(obj);
    }
    com.kklab.vd.kumoi.proto.VoteOwnerMessage other = (com.kklab.vd.kumoi.proto.VoteOwnerMessage) obj;

    if (!getVoteId()
        .equals(other.getVoteId())) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (getSequential()
        != other.getSequential()) return false;
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
    hash = (37 * hash) + VOTE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVoteId().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + SEQUENTIAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSequential());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage parseFrom(
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
  public static Builder newBuilder(com.kklab.vd.kumoi.proto.VoteOwnerMessage prototype) {
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
   * Protobuf type {@code omega.VoteOwnerMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:omega.VoteOwnerMessage)
      com.kklab.vd.kumoi.proto.VoteOwnerMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_VoteOwnerMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_VoteOwnerMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kklab.vd.kumoi.proto.VoteOwnerMessage.class, com.kklab.vd.kumoi.proto.VoteOwnerMessage.Builder.class);
    }

    // Construct using com.kklab.vd.kumoi.proto.VoteOwnerMessage.newBuilder()
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
      voteId_ = "";

      message_ = "";

      sequential_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_VoteOwnerMessage_descriptor;
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.VoteOwnerMessage getDefaultInstanceForType() {
      return com.kklab.vd.kumoi.proto.VoteOwnerMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.VoteOwnerMessage build() {
      com.kklab.vd.kumoi.proto.VoteOwnerMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.VoteOwnerMessage buildPartial() {
      com.kklab.vd.kumoi.proto.VoteOwnerMessage result = new com.kklab.vd.kumoi.proto.VoteOwnerMessage(this);
      result.voteId_ = voteId_;
      result.message_ = message_;
      result.sequential_ = sequential_;
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
      if (other instanceof com.kklab.vd.kumoi.proto.VoteOwnerMessage) {
        return mergeFrom((com.kklab.vd.kumoi.proto.VoteOwnerMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kklab.vd.kumoi.proto.VoteOwnerMessage other) {
      if (other == com.kklab.vd.kumoi.proto.VoteOwnerMessage.getDefaultInstance()) return this;
      if (!other.getVoteId().isEmpty()) {
        voteId_ = other.voteId_;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getSequential() != false) {
        setSequential(other.getSequential());
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
      com.kklab.vd.kumoi.proto.VoteOwnerMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kklab.vd.kumoi.proto.VoteOwnerMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object voteId_ = "";
    /**
     * <code>string vote_id = 1[json_name = "vt"];</code>
     * @return The voteId.
     */
    public java.lang.String getVoteId() {
      java.lang.Object ref = voteId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        voteId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string vote_id = 1[json_name = "vt"];</code>
     * @return The bytes for voteId.
     */
    public com.google.protobuf.ByteString
        getVoteIdBytes() {
      java.lang.Object ref = voteId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        voteId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vote_id = 1[json_name = "vt"];</code>
     * @param value The voteId to set.
     * @return This builder for chaining.
     */
    public Builder setVoteId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      voteId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vote_id = 1[json_name = "vt"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVoteId() {
      
      voteId_ = getDefaultInstance().getVoteId();
      onChanged();
      return this;
    }
    /**
     * <code>string vote_id = 1[json_name = "vt"];</code>
     * @param value The bytes for voteId to set.
     * @return This builder for chaining.
     */
    public Builder setVoteIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      voteId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2[json_name = "m"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2[json_name = "m"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2[json_name = "m"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2[json_name = "m"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2[json_name = "m"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private boolean sequential_ ;
    /**
     * <pre>
     *  google.protobuf.Struct metadata = 10 [json_name = "mta"];
     *  Skill skill = 11 [json_name = "sk"];
     * </pre>
     *
     * <code>bool sequential = 8[json_name = "se"];</code>
     * @return The sequential.
     */
    @java.lang.Override
    public boolean getSequential() {
      return sequential_;
    }
    /**
     * <pre>
     *  google.protobuf.Struct metadata = 10 [json_name = "mta"];
     *  Skill skill = 11 [json_name = "sk"];
     * </pre>
     *
     * <code>bool sequential = 8[json_name = "se"];</code>
     * @param value The sequential to set.
     * @return This builder for chaining.
     */
    public Builder setSequential(boolean value) {
      
      sequential_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  google.protobuf.Struct metadata = 10 [json_name = "mta"];
     *  Skill skill = 11 [json_name = "sk"];
     * </pre>
     *
     * <code>bool sequential = 8[json_name = "se"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequential() {
      
      sequential_ = false;
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


    // @@protoc_insertion_point(builder_scope:omega.VoteOwnerMessage)
  }

  // @@protoc_insertion_point(class_scope:omega.VoteOwnerMessage)
  private static final com.kklab.vd.kumoi.proto.VoteOwnerMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kklab.vd.kumoi.proto.VoteOwnerMessage();
  }

  public static com.kklab.vd.kumoi.proto.VoteOwnerMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoteOwnerMessage>
      PARSER = new com.google.protobuf.AbstractParser<VoteOwnerMessage>() {
    @java.lang.Override
    public VoteOwnerMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VoteOwnerMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VoteOwnerMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoteOwnerMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kklab.vd.kumoi.proto.VoteOwnerMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

