// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

public interface LeaveChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:omega.LeaveChannel)
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
   * <code>string session_id = 3[json_name = "s"];</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string session_id = 3[json_name = "s"];</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>int64 offset = 4[json_name = "o", jstype = JS_STRING];</code>
   * @return The offset.
   */
  long getOffset();
}