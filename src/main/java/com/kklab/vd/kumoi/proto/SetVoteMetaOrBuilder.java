// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

public interface SetVoteMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:omega.SetVoteMeta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string vote_id = 1[json_name = "vt"];</code>
   * @return The voteId.
   */
  java.lang.String getVoteId();
  /**
   * <code>string vote_id = 1[json_name = "vt"];</code>
   * @return The bytes for voteId.
   */
  com.google.protobuf.ByteString
      getVoteIdBytes();

  /**
   * <code>string name = 2[json_name = "n"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2[json_name = "n"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Struct data = 3[json_name = "d"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.google.protobuf.Struct data = 3[json_name = "d"];</code>
   * @return The data.
   */
  com.google.protobuf.Struct getData();
  /**
   * <code>.google.protobuf.Struct data = 3[json_name = "d"];</code>
   */
  com.google.protobuf.StructOrBuilder getDataOrBuilder();
}
