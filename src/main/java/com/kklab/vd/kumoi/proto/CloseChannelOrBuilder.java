// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

public interface CloseChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:omega.CloseChannel)
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
   * <code>string key = 3[json_name = "k"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 3[json_name = "k"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>int64 offset = 4[json_name = "o", jstype = JS_STRING];</code>
   * @return The offset.
   */
  long getOffset();
}
