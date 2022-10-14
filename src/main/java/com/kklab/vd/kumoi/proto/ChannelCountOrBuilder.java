// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

public interface ChannelCountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:omega.ChannelCount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string channel_id = 1[json_name = "ch"];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <code>string channel_id = 1[json_name = "ch"];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <code>int32 owner_count = 2[json_name = "oc"];</code>
   * @return The ownerCount.
   */
  int getOwnerCount();

  /**
   * <code>int32 participator_count = 3[json_name = "pc"];</code>
   * @return The participatorCount.
   */
  int getParticipatorCount();

  /**
   * <code>int32 count = 4[json_name = "c"];</code>
   * @return The count.
   */
  int getCount();

  /**
   * <code>int64 offset = 5[json_name = "o", jstype = JS_STRING];</code>
   * @return The offset.
   */
  long getOffset();
}
