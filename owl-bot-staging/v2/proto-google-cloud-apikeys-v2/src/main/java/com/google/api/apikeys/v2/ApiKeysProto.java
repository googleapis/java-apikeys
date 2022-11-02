// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/apikeys/v2/apikeys.proto

package com.google.api.apikeys.v2;

public final class ApiKeysProto {
  private ApiKeysProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_CreateKeyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_CreateKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_ListKeysRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_ListKeysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_ListKeysResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_ListKeysResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_GetKeyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_GetKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_GetKeyStringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_GetKeyStringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_GetKeyStringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_GetKeyStringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_UpdateKeyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_UpdateKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_DeleteKeyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_DeleteKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_UndeleteKeyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_UndeleteKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_LookupKeyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_LookupKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_apikeys_v2_LookupKeyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_apikeys_v2_LookupKeyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/api/apikeys/v2/apikeys.proto\022\025g" +
      "oogle.api.apikeys.v2\032\034google/api/annotat" +
      "ions.proto\032%google/api/apikeys/v2/resour" +
      "ces.proto\032\027google/api/client.proto\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\032#google/longrunning/opera" +
      "tions.proto\032 google/protobuf/field_mask." +
      "proto\"\204\001\n\020CreateKeyRequest\0222\n\006parent\030\001 \001" +
      "(\tB\"\340A\002\372A\034\022\032apikeys.googleapis.com/Key\022," +
      "\n\003key\030\002 \001(\0132\032.google.api.apikeys.v2.KeyB" +
      "\003\340A\002\022\016\n\006key_id\030\003 \001(\t\"\221\001\n\017ListKeysRequest" +
      "\0222\n\006parent\030\001 \001(\tB\"\340A\002\372A\034\022\032apikeys.google" +
      "apis.com/Key\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n" +
      "page_token\030\003 \001(\tB\003\340A\001\022\031\n\014show_deleted\030\006 " +
      "\001(\010B\003\340A\001\"U\n\020ListKeysResponse\022(\n\004keys\030\001 \003" +
      "(\0132\032.google.api.apikeys.v2.Key\022\027\n\017next_p" +
      "age_token\030\002 \001(\t\"A\n\rGetKeyRequest\0220\n\004name" +
      "\030\001 \001(\tB\"\340A\002\372A\034\n\032apikeys.googleapis.com/K" +
      "ey\"G\n\023GetKeyStringRequest\0220\n\004name\030\001 \001(\tB" +
      "\"\340A\002\372A\034\n\032apikeys.googleapis.com/Key\"*\n\024G" +
      "etKeyStringResponse\022\022\n\nkey_string\030\001 \001(\t\"" +
      "q\n\020UpdateKeyRequest\022,\n\003key\030\001 \001(\0132\032.googl" +
      "e.api.apikeys.v2.KeyB\003\340A\002\022/\n\013update_mask" +
      "\030\002 \001(\0132\032.google.protobuf.FieldMask\"W\n\020De" +
      "leteKeyRequest\0220\n\004name\030\001 \001(\tB\"\340A\002\372A\034\n\032ap" +
      "ikeys.googleapis.com/Key\022\021\n\004etag\030\002 \001(\tB\003" +
      "\340A\001\"F\n\022UndeleteKeyRequest\0220\n\004name\030\001 \001(\tB" +
      "\"\340A\002\372A\034\n\032apikeys.googleapis.com/Key\"+\n\020L" +
      "ookupKeyRequest\022\027\n\nkey_string\030\001 \001(\tB\003\340A\002" +
      "\"1\n\021LookupKeyResponse\022\016\n\006parent\030\001 \001(\t\022\014\n" +
      "\004name\030\002 \001(\t2\276\013\n\007ApiKeys\022\275\001\n\tCreateKey\022\'." +
      "google.api.apikeys.v2.CreateKeyRequest\032\035" +
      ".google.longrunning.Operation\"h\202\323\344\223\002/\"(/" +
      "v2/{parent=projects/*/locations/*}/keys:" +
      "\003key\332A\021parent,key,key_id\312A\034\n\003Key\022\025google" +
      ".protobuf.Empty\022\226\001\n\010ListKeys\022&.google.ap" +
      "i.apikeys.v2.ListKeysRequest\032\'.google.ap" +
      "i.apikeys.v2.ListKeysResponse\"9\202\323\344\223\002*\022(/" +
      "v2/{parent=projects/*/locations/*}/keys\332" +
      "A\006parent\022\203\001\n\006GetKey\022$.google.api.apikeys" +
      ".v2.GetKeyRequest\032\032.google.api.apikeys.v" +
      "2.Key\"7\202\323\344\223\002*\022(/v2/{name=projects/*/loca" +
      "tions/*/keys/*}\332A\004name\022\252\001\n\014GetKeyString\022" +
      "*.google.api.apikeys.v2.GetKeyStringRequ" +
      "est\032+.google.api.apikeys.v2.GetKeyString" +
      "Response\"A\202\323\344\223\0024\0222/v2/{name=projects/*/l" +
      "ocations/*/keys/*}/keyString\332A\004name\022\277\001\n\t" +
      "UpdateKey\022\'.google.api.apikeys.v2.Update" +
      "KeyRequest\032\035.google.longrunning.Operatio" +
      "n\"j\202\323\344\223\00232,/v2/{key.name=projects/*/loca" +
      "tions/*/keys/*}:\003key\332A\017key,update_mask\312A" +
      "\034\n\003Key\022\025google.protobuf.Empty\022\253\001\n\tDelete" +
      "Key\022\'.google.api.apikeys.v2.DeleteKeyReq" +
      "uest\032\035.google.longrunning.Operation\"V\202\323\344" +
      "\223\002**(/v2/{name=projects/*/locations/*/ke" +
      "ys/*}\332A\004name\312A\034\n\003Key\022\025google.protobuf.Em" +
      "pty\022\264\001\n\013UndeleteKey\022).google.api.apikeys" +
      ".v2.UndeleteKeyRequest\032\035.google.longrunn" +
      "ing.Operation\"[\202\323\344\223\0026\"1/v2/{name=project" +
      "s/*/locations/*/keys/*}:undelete:\001*\312A\034\n\003" +
      "Key\022\025google.protobuf.Empty\022z\n\tLookupKey\022" +
      "\'.google.api.apikeys.v2.LookupKeyRequest" +
      "\032(.google.api.apikeys.v2.LookupKeyRespon" +
      "se\"\032\202\323\344\223\002\024\022\022/v2/keys:lookupKey\032\203\001\312A\026apik" +
      "eys.googleapis.com\322Aghttps://www.googlea" +
      "pis.com/auth/cloud-platform,https://www." +
      "googleapis.com/auth/cloud-platform.read-" +
      "onlyB\272\001\n\031com.google.api.apikeys.v2B\014ApiK" +
      "eysProtoP\001Z<google.golang.org/genproto/g" +
      "oogleapis/api/apikeys/v2;apikeys\252\002\027Googl" +
      "e.Cloud.ApiKeys.V2\312\002\027Google\\Cloud\\ApiKey" +
      "s\\V2\352\002\032Google::Cloud::ApiKeys::V2b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.apikeys.v2.ResourcesProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_api_apikeys_v2_CreateKeyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_apikeys_v2_CreateKeyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_CreateKeyRequest_descriptor,
        new java.lang.String[] { "Parent", "Key", "KeyId", });
    internal_static_google_api_apikeys_v2_ListKeysRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_apikeys_v2_ListKeysRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_ListKeysRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "ShowDeleted", });
    internal_static_google_api_apikeys_v2_ListKeysResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_apikeys_v2_ListKeysResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_ListKeysResponse_descriptor,
        new java.lang.String[] { "Keys", "NextPageToken", });
    internal_static_google_api_apikeys_v2_GetKeyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_apikeys_v2_GetKeyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_GetKeyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_api_apikeys_v2_GetKeyStringRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_apikeys_v2_GetKeyStringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_GetKeyStringRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_api_apikeys_v2_GetKeyStringResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_api_apikeys_v2_GetKeyStringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_GetKeyStringResponse_descriptor,
        new java.lang.String[] { "KeyString", });
    internal_static_google_api_apikeys_v2_UpdateKeyRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_api_apikeys_v2_UpdateKeyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_UpdateKeyRequest_descriptor,
        new java.lang.String[] { "Key", "UpdateMask", });
    internal_static_google_api_apikeys_v2_DeleteKeyRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_api_apikeys_v2_DeleteKeyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_DeleteKeyRequest_descriptor,
        new java.lang.String[] { "Name", "Etag", });
    internal_static_google_api_apikeys_v2_UndeleteKeyRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_api_apikeys_v2_UndeleteKeyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_UndeleteKeyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_api_apikeys_v2_LookupKeyRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_api_apikeys_v2_LookupKeyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_LookupKeyRequest_descriptor,
        new java.lang.String[] { "KeyString", });
    internal_static_google_api_apikeys_v2_LookupKeyResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_api_apikeys_v2_LookupKeyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_apikeys_v2_LookupKeyResponse_descriptor,
        new java.lang.String[] { "Parent", "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.apikeys.v2.ResourcesProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}