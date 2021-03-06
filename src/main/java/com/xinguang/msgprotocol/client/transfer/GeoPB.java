// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Geo.proto

package com.xinguang.msgprotocol.client.transfer;

public final class GeoPB {
  private GeoPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GeoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Geo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.UserType userType = 1;</code>
     */
    int getUserTypeValue();
    /**
     * <code>.UserType userType = 1;</code>
     */
    com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType getUserType();

    /**
     * <code>double latitude = 2;</code>
     */
    double getLatitude();

    /**
     * <code>double longitude = 3;</code>
     */
    double getLongitude();
  }
  /**
   * Protobuf type {@code Geo}
   */
  public  static final class Geo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Geo)
      GeoOrBuilder {
    // Use Geo.newBuilder() to construct.
    private Geo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Geo() {
      userType_ = 0;
      latitude_ = 0D;
      longitude_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Geo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();

              userType_ = rawValue;
              break;
            }
            case 17: {

              latitude_ = input.readDouble();
              break;
            }
            case 25: {

              longitude_ = input.readDouble();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinguang.msgprotocol.client.transfer.GeoPB.internal_static_Geo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinguang.msgprotocol.client.transfer.GeoPB.internal_static_Geo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xinguang.msgprotocol.client.transfer.GeoPB.Geo.class, com.xinguang.msgprotocol.client.transfer.GeoPB.Geo.Builder.class);
    }

    public static final int USERTYPE_FIELD_NUMBER = 1;
    private int userType_;
    /**
     * <code>.UserType userType = 1;</code>
     */
    public int getUserTypeValue() {
      return userType_;
    }
    /**
     * <code>.UserType userType = 1;</code>
     */
    public com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType getUserType() {
      com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType result = com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType.valueOf(userType_);
      return result == null ? com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType.UNRECOGNIZED : result;
    }

    public static final int LATITUDE_FIELD_NUMBER = 2;
    private double latitude_;
    /**
     * <code>double latitude = 2;</code>
     */
    public double getLatitude() {
      return latitude_;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private double longitude_;
    /**
     * <code>double longitude = 3;</code>
     */
    public double getLongitude() {
      return longitude_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (userType_ != com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType.RIDER.getNumber()) {
        output.writeEnum(1, userType_);
      }
      if (latitude_ != 0D) {
        output.writeDouble(2, latitude_);
      }
      if (longitude_ != 0D) {
        output.writeDouble(3, longitude_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userType_ != com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType.RIDER.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, userType_);
      }
      if (latitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, latitude_);
      }
      if (longitude_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, longitude_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.xinguang.msgprotocol.client.transfer.GeoPB.Geo)) {
        return super.equals(obj);
      }
      com.xinguang.msgprotocol.client.transfer.GeoPB.Geo other = (com.xinguang.msgprotocol.client.transfer.GeoPB.Geo) obj;

      boolean result = true;
      result = result && userType_ == other.userType_;
      result = result && (
          java.lang.Double.doubleToLongBits(getLatitude())
          == java.lang.Double.doubleToLongBits(
              other.getLatitude()));
      result = result && (
          java.lang.Double.doubleToLongBits(getLongitude())
          == java.lang.Double.doubleToLongBits(
              other.getLongitude()));
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USERTYPE_FIELD_NUMBER;
      hash = (53 * hash) + userType_;
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLatitude()));
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLongitude()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.xinguang.msgprotocol.client.transfer.GeoPB.Geo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code Geo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Geo)
        com.xinguang.msgprotocol.client.transfer.GeoPB.GeoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinguang.msgprotocol.client.transfer.GeoPB.internal_static_Geo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinguang.msgprotocol.client.transfer.GeoPB.internal_static_Geo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xinguang.msgprotocol.client.transfer.GeoPB.Geo.class, com.xinguang.msgprotocol.client.transfer.GeoPB.Geo.Builder.class);
      }

      // Construct using com.xinguang.msgprotocol.client.transfer.GeoPB.Geo.newBuilder()
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
      public Builder clear() {
        super.clear();
        userType_ = 0;

        latitude_ = 0D;

        longitude_ = 0D;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinguang.msgprotocol.client.transfer.GeoPB.internal_static_Geo_descriptor;
      }

      public com.xinguang.msgprotocol.client.transfer.GeoPB.Geo getDefaultInstanceForType() {
        return com.xinguang.msgprotocol.client.transfer.GeoPB.Geo.getDefaultInstance();
      }

      public com.xinguang.msgprotocol.client.transfer.GeoPB.Geo build() {
        com.xinguang.msgprotocol.client.transfer.GeoPB.Geo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xinguang.msgprotocol.client.transfer.GeoPB.Geo buildPartial() {
        com.xinguang.msgprotocol.client.transfer.GeoPB.Geo result = new com.xinguang.msgprotocol.client.transfer.GeoPB.Geo(this);
        result.userType_ = userType_;
        result.latitude_ = latitude_;
        result.longitude_ = longitude_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinguang.msgprotocol.client.transfer.GeoPB.Geo) {
          return mergeFrom((com.xinguang.msgprotocol.client.transfer.GeoPB.Geo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xinguang.msgprotocol.client.transfer.GeoPB.Geo other) {
        if (other == com.xinguang.msgprotocol.client.transfer.GeoPB.Geo.getDefaultInstance()) return this;
        if (other.userType_ != 0) {
          setUserTypeValue(other.getUserTypeValue());
        }
        if (other.getLatitude() != 0D) {
          setLatitude(other.getLatitude());
        }
        if (other.getLongitude() != 0D) {
          setLongitude(other.getLongitude());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xinguang.msgprotocol.client.transfer.GeoPB.Geo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xinguang.msgprotocol.client.transfer.GeoPB.Geo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int userType_ = 0;
      /**
       * <code>.UserType userType = 1;</code>
       */
      public int getUserTypeValue() {
        return userType_;
      }
      /**
       * <code>.UserType userType = 1;</code>
       */
      public Builder setUserTypeValue(int value) {
        userType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.UserType userType = 1;</code>
       */
      public com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType getUserType() {
        com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType result = com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType.valueOf(userType_);
        return result == null ? com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UserType userType = 1;</code>
       */
      public Builder setUserType(com.xinguang.msgprotocol.client.transfer.UserTypePB.UserType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        userType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UserType userType = 1;</code>
       */
      public Builder clearUserType() {
        
        userType_ = 0;
        onChanged();
        return this;
      }

      private double latitude_ ;
      /**
       * <code>double latitude = 2;</code>
       */
      public double getLatitude() {
        return latitude_;
      }
      /**
       * <code>double latitude = 2;</code>
       */
      public Builder setLatitude(double value) {
        
        latitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double latitude = 2;</code>
       */
      public Builder clearLatitude() {
        
        latitude_ = 0D;
        onChanged();
        return this;
      }

      private double longitude_ ;
      /**
       * <code>double longitude = 3;</code>
       */
      public double getLongitude() {
        return longitude_;
      }
      /**
       * <code>double longitude = 3;</code>
       */
      public Builder setLongitude(double value) {
        
        longitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double longitude = 3;</code>
       */
      public Builder clearLongitude() {
        
        longitude_ = 0D;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:Geo)
    }

    // @@protoc_insertion_point(class_scope:Geo)
    private static final com.xinguang.msgprotocol.client.transfer.GeoPB.Geo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.xinguang.msgprotocol.client.transfer.GeoPB.Geo();
    }

    public static com.xinguang.msgprotocol.client.transfer.GeoPB.Geo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Geo>
        PARSER = new com.google.protobuf.AbstractParser<Geo>() {
      public Geo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Geo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Geo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Geo> getParserForType() {
      return PARSER;
    }

    public com.xinguang.msgprotocol.client.transfer.GeoPB.Geo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Geo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Geo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tGeo.proto\032\016UserType.proto\"G\n\003Geo\022\033\n\010us" +
      "erType\030\001 \001(\0162\t.UserType\022\020\n\010latitude\030\002 \001(" +
      "\001\022\021\n\tlongitude\030\003 \001(\001B1\n(com.xinguang.msg" +
      "protocol.client.transferB\005GeoPBb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinguang.msgprotocol.client.transfer.UserTypePB.getDescriptor(),
        }, assigner);
    internal_static_Geo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Geo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Geo_descriptor,
        new java.lang.String[] { "UserType", "Latitude", "Longitude", });
    com.xinguang.msgprotocol.client.transfer.UserTypePB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
