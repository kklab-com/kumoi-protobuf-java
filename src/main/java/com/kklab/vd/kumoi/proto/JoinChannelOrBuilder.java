// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

public interface JoinChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:omega.JoinChannel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string channel_id = 2[json_name = "ch"];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <code>string channel_id = 2[json_name = "ch"];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <code>string name = 3[json_name = "n"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3[json_name = "n"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Struct channel_metadata = 4[json_name = "chm"];</code>
   * @return Whether the channelMetadata field is set.
   */
  boolean hasChannelMetadata();
  /**
   * <code>.google.protobuf.Struct channel_metadata = 4[json_name = "chm"];</code>
   * @return The channelMetadata.
   */
  com.google.protobuf.Struct getChannelMetadata();
  /**
   * <code>.google.protobuf.Struct channel_metadata = 4[json_name = "chm"];</code>
   */
  com.google.protobuf.StructOrBuilder getChannelMetadataOrBuilder();

  /**
   * <code>string session_id = 5[json_name = "s"];</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string session_id = 5[json_name = "s"];</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>string subject = 6[json_name = "sub"];</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <code>string subject = 6[json_name = "sub"];</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <code>string subject_name = 7[json_name = "sn"];</code>
   * @return The subjectName.
   */
  java.lang.String getSubjectName();
  /**
   * <code>string subject_name = 7[json_name = "sn"];</code>
   * @return The bytes for subjectName.
   */
  com.google.protobuf.ByteString
      getSubjectNameBytes();

  /**
   * <code>.google.protobuf.Struct session_metadata = 8[json_name = "sm"];</code>
   * @return Whether the sessionMetadata field is set.
   */
  boolean hasSessionMetadata();
  /**
   * <code>.google.protobuf.Struct session_metadata = 8[json_name = "sm"];</code>
   * @return The sessionMetadata.
   */
  com.google.protobuf.Struct getSessionMetadata();
  /**
   * <code>.google.protobuf.Struct session_metadata = 8[json_name = "sm"];</code>
   */
  com.google.protobuf.StructOrBuilder getSessionMetadataOrBuilder();

  /**
   * <code>string key = 9[json_name = "k"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 9[json_name = "k"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string role = 10[json_name = "r"];</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <code>string role = 10[json_name = "r"];</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <code>int64 offset = 11[json_name = "o", jstype = JS_STRING];</code>
   * @return The offset.
   */
  long getOffset();

  /**
   * <code>int64 created_at = 12[json_name = "ca", jstype = JS_STRING];</code>
   * @return The createdAt.
   */
  long getCreatedAt();

  /**
   * <code>.omega.Role roleIndicator = 13[json_name = "ri"];</code>
   * @return The enum numeric value on the wire for roleIndicator.
   */
  int getRoleIndicatorValue();
  /**
   * <code>.omega.Role roleIndicator = 13[json_name = "ri"];</code>
   * @return The roleIndicator.
   */
  com.kklab.vd.kumoi.proto.Role getRoleIndicator();

  /**
   * <code>.omega.Skill skill = 14[json_name = "sk"];</code>
   * @return Whether the skill field is set.
   */
  boolean hasSkill();
  /**
   * <code>.omega.Skill skill = 14[json_name = "sk"];</code>
   * @return The skill.
   */
  com.kklab.vd.kumoi.proto.Skill getSkill();
  /**
   * <code>.omega.Skill skill = 14[json_name = "sk"];</code>
   */
  com.kklab.vd.kumoi.proto.SkillOrBuilder getSkillOrBuilder();
}
