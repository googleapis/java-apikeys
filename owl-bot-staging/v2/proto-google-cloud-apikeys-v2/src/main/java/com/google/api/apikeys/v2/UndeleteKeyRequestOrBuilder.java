// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/apikeys/v2/apikeys.proto

package com.google.api.apikeys.v2;

public interface UndeleteKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.apikeys.v2.UndeleteKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the API key to be undeleted.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the API key to be undeleted.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
