// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omega.proto

package com.kklab.vd.kumoi.proto;

public interface VoteCountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:omega.VoteCount)
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
   * <code>string key = 2[json_name = "k"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 2[json_name = "k"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>repeated .omega.Vote.Option vote_options = 3[json_name = "vtos"];</code>
   */
  java.util.List<com.kklab.vd.kumoi.proto.Vote.Option> 
      getVoteOptionsList();
  /**
   * <code>repeated .omega.Vote.Option vote_options = 3[json_name = "vtos"];</code>
   */
  com.kklab.vd.kumoi.proto.Vote.Option getVoteOptions(int index);
  /**
   * <code>repeated .omega.Vote.Option vote_options = 3[json_name = "vtos"];</code>
   */
  int getVoteOptionsCount();
  /**
   * <code>repeated .omega.Vote.Option vote_options = 3[json_name = "vtos"];</code>
   */
  java.util.List<? extends com.kklab.vd.kumoi.proto.Vote.OptionOrBuilder> 
      getVoteOptionsOrBuilderList();
  /**
   * <code>repeated .omega.Vote.Option vote_options = 3[json_name = "vtos"];</code>
   */
  com.kklab.vd.kumoi.proto.Vote.OptionOrBuilder getVoteOptionsOrBuilder(
      int index);
}