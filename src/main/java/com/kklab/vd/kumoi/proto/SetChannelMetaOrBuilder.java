// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

public interface SetChannelMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:omega.SetChannelMeta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Struct data = 1[json_name = "d"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.google.protobuf.Struct data = 1[json_name = "d"];</code>
   * @return The data.
   */
  com.google.protobuf.Struct getData();
  /**
   * <code>.google.protobuf.Struct data = 1[json_name = "d"];</code>
   */
  com.google.protobuf.StructOrBuilder getDataOrBuilder();

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
   * <code>int64 offset = 4[json_name = "o", jstype = JS_STRING];</code>
   * @return The offset.
   */
  long getOffset();

  /**
   * <code>.omega.Skill skill = 11[json_name = "sk"];</code>
   * @return Whether the skill field is set.
   */
  boolean hasSkill();
  /**
   * <code>.omega.Skill skill = 11[json_name = "sk"];</code>
   * @return The skill.
   */
  com.kklab.vd.kumoi.proto.Skill getSkill();
  /**
   * <code>.omega.Skill skill = 11[json_name = "sk"];</code>
   */
  com.kklab.vd.kumoi.proto.SkillOrBuilder getSkillOrBuilder();
}
