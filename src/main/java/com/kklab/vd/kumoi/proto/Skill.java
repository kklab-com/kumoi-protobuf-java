// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

/**
 * Protobuf type {@code omega.Skill}
 */
public final class Skill extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:omega.Skill)
    SkillOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Skill.newBuilder() to construct.
  private Skill(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Skill() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Skill();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Skill(
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
            com.kklab.vd.kumoi.proto.Tagging.Builder subBuilder = null;
            if (tagging_ != null) {
              subBuilder = tagging_.toBuilder();
            }
            tagging_ = input.readMessage(com.kklab.vd.kumoi.proto.Tagging.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tagging_);
              tagging_ = subBuilder.buildPartial();
            }

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
    return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_Skill_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_Skill_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kklab.vd.kumoi.proto.Skill.class, com.kklab.vd.kumoi.proto.Skill.Builder.class);
  }

  public static final int TAGGING_FIELD_NUMBER = 1;
  private com.kklab.vd.kumoi.proto.Tagging tagging_;
  /**
   * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
   * @return Whether the tagging field is set.
   */
  @java.lang.Override
  public boolean hasTagging() {
    return tagging_ != null;
  }
  /**
   * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
   * @return The tagging.
   */
  @java.lang.Override
  public com.kklab.vd.kumoi.proto.Tagging getTagging() {
    return tagging_ == null ? com.kklab.vd.kumoi.proto.Tagging.getDefaultInstance() : tagging_;
  }
  /**
   * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
   */
  @java.lang.Override
  public com.kklab.vd.kumoi.proto.TaggingOrBuilder getTaggingOrBuilder() {
    return getTagging();
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
    if (tagging_ != null) {
      output.writeMessage(1, getTagging());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tagging_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTagging());
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
    if (!(obj instanceof com.kklab.vd.kumoi.proto.Skill)) {
      return super.equals(obj);
    }
    com.kklab.vd.kumoi.proto.Skill other = (com.kklab.vd.kumoi.proto.Skill) obj;

    if (hasTagging() != other.hasTagging()) return false;
    if (hasTagging()) {
      if (!getTagging()
          .equals(other.getTagging())) return false;
    }
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
    if (hasTagging()) {
      hash = (37 * hash) + TAGGING_FIELD_NUMBER;
      hash = (53 * hash) + getTagging().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kklab.vd.kumoi.proto.Skill parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kklab.vd.kumoi.proto.Skill parseFrom(
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
  public static Builder newBuilder(com.kklab.vd.kumoi.proto.Skill prototype) {
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
   * Protobuf type {@code omega.Skill}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:omega.Skill)
      com.kklab.vd.kumoi.proto.SkillOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_Skill_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_Skill_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kklab.vd.kumoi.proto.Skill.class, com.kklab.vd.kumoi.proto.Skill.Builder.class);
    }

    // Construct using com.kklab.vd.kumoi.proto.Skill.newBuilder()
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
      if (taggingBuilder_ == null) {
        tagging_ = null;
      } else {
        tagging_ = null;
        taggingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kklab.vd.kumoi.proto.Omega.internal_static_omega_Skill_descriptor;
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.Skill getDefaultInstanceForType() {
      return com.kklab.vd.kumoi.proto.Skill.getDefaultInstance();
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.Skill build() {
      com.kklab.vd.kumoi.proto.Skill result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kklab.vd.kumoi.proto.Skill buildPartial() {
      com.kklab.vd.kumoi.proto.Skill result = new com.kklab.vd.kumoi.proto.Skill(this);
      if (taggingBuilder_ == null) {
        result.tagging_ = tagging_;
      } else {
        result.tagging_ = taggingBuilder_.build();
      }
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
      if (other instanceof com.kklab.vd.kumoi.proto.Skill) {
        return mergeFrom((com.kklab.vd.kumoi.proto.Skill)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kklab.vd.kumoi.proto.Skill other) {
      if (other == com.kklab.vd.kumoi.proto.Skill.getDefaultInstance()) return this;
      if (other.hasTagging()) {
        mergeTagging(other.getTagging());
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
      com.kklab.vd.kumoi.proto.Skill parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kklab.vd.kumoi.proto.Skill) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.kklab.vd.kumoi.proto.Tagging tagging_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kklab.vd.kumoi.proto.Tagging, com.kklab.vd.kumoi.proto.Tagging.Builder, com.kklab.vd.kumoi.proto.TaggingOrBuilder> taggingBuilder_;
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     * @return Whether the tagging field is set.
     */
    public boolean hasTagging() {
      return taggingBuilder_ != null || tagging_ != null;
    }
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     * @return The tagging.
     */
    public com.kklab.vd.kumoi.proto.Tagging getTagging() {
      if (taggingBuilder_ == null) {
        return tagging_ == null ? com.kklab.vd.kumoi.proto.Tagging.getDefaultInstance() : tagging_;
      } else {
        return taggingBuilder_.getMessage();
      }
    }
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     */
    public Builder setTagging(com.kklab.vd.kumoi.proto.Tagging value) {
      if (taggingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tagging_ = value;
        onChanged();
      } else {
        taggingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     */
    public Builder setTagging(
        com.kklab.vd.kumoi.proto.Tagging.Builder builderForValue) {
      if (taggingBuilder_ == null) {
        tagging_ = builderForValue.build();
        onChanged();
      } else {
        taggingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     */
    public Builder mergeTagging(com.kklab.vd.kumoi.proto.Tagging value) {
      if (taggingBuilder_ == null) {
        if (tagging_ != null) {
          tagging_ =
            com.kklab.vd.kumoi.proto.Tagging.newBuilder(tagging_).mergeFrom(value).buildPartial();
        } else {
          tagging_ = value;
        }
        onChanged();
      } else {
        taggingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     */
    public Builder clearTagging() {
      if (taggingBuilder_ == null) {
        tagging_ = null;
        onChanged();
      } else {
        tagging_ = null;
        taggingBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     */
    public com.kklab.vd.kumoi.proto.Tagging.Builder getTaggingBuilder() {
      
      onChanged();
      return getTaggingFieldBuilder().getBuilder();
    }
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     */
    public com.kklab.vd.kumoi.proto.TaggingOrBuilder getTaggingOrBuilder() {
      if (taggingBuilder_ != null) {
        return taggingBuilder_.getMessageOrBuilder();
      } else {
        return tagging_ == null ?
            com.kklab.vd.kumoi.proto.Tagging.getDefaultInstance() : tagging_;
      }
    }
    /**
     * <code>.omega.Tagging tagging = 1[json_name = "tg"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kklab.vd.kumoi.proto.Tagging, com.kklab.vd.kumoi.proto.Tagging.Builder, com.kklab.vd.kumoi.proto.TaggingOrBuilder> 
        getTaggingFieldBuilder() {
      if (taggingBuilder_ == null) {
        taggingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kklab.vd.kumoi.proto.Tagging, com.kklab.vd.kumoi.proto.Tagging.Builder, com.kklab.vd.kumoi.proto.TaggingOrBuilder>(
                getTagging(),
                getParentForChildren(),
                isClean());
        tagging_ = null;
      }
      return taggingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:omega.Skill)
  }

  // @@protoc_insertion_point(class_scope:omega.Skill)
  private static final com.kklab.vd.kumoi.proto.Skill DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kklab.vd.kumoi.proto.Skill();
  }

  public static com.kklab.vd.kumoi.proto.Skill getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Skill>
      PARSER = new com.google.protobuf.AbstractParser<Skill>() {
    @java.lang.Override
    public Skill parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Skill(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Skill> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Skill> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kklab.vd.kumoi.proto.Skill getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
