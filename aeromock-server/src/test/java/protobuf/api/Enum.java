// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/enum.proto

package protobuf.api;

public final class Enum {
  private Enum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface WithEnumResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.api.WithEnumResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 prop1 = 1;</code>
     */
    boolean hasProp1();
    /**
     * <code>required int32 prop1 = 1;</code>
     */
    int getProp1();

    /**
     * <code>required .protobuf.api.WithEnumResponse.TestEnum prop2 = 2 [default = KEY2];</code>
     */
    boolean hasProp2();
    /**
     * <code>required .protobuf.api.WithEnumResponse.TestEnum prop2 = 2 [default = KEY2];</code>
     */
    protobuf.api.Enum.WithEnumResponse.TestEnum getProp2();

    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
     */
    java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> getEnumListList();
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
     */
    int getEnumListCount();
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
     */
    protobuf.api.Enum.WithEnumResponse.TestEnum getEnumList(int index);

    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
     */
    java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> getEnumEmptyListList();
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
     */
    int getEnumEmptyListCount();
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
     */
    protobuf.api.Enum.WithEnumResponse.TestEnum getEnumEmptyList(int index);
  }
  /**
   * Protobuf type {@code protobuf.api.WithEnumResponse}
   */
  public static final class WithEnumResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protobuf.api.WithEnumResponse)
      WithEnumResponseOrBuilder {
    // Use WithEnumResponse.newBuilder() to construct.
    private WithEnumResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private WithEnumResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final WithEnumResponse defaultInstance;
    public static WithEnumResponse getDefaultInstance() {
      return defaultInstance;
    }

    public WithEnumResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private WithEnumResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              prop1_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              protobuf.api.Enum.WithEnumResponse.TestEnum value = protobuf.api.Enum.WithEnumResponse.TestEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                prop2_ = value;
              }
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              protobuf.api.Enum.WithEnumResponse.TestEnum value = protobuf.api.Enum.WithEnumResponse.TestEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
                } else {
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  enumList_ = new java.util.ArrayList<protobuf.api.Enum.WithEnumResponse.TestEnum>();
                  mutable_bitField0_ |= 0x00000004;
                }
                enumList_.add(value);
              }
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                protobuf.api.Enum.WithEnumResponse.TestEnum value = protobuf.api.Enum.WithEnumResponse.TestEnum.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(3, rawValue);
                  } else {
                  if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                    enumList_ = new java.util.ArrayList<protobuf.api.Enum.WithEnumResponse.TestEnum>();
                    mutable_bitField0_ |= 0x00000004;
                  }
                  enumList_.add(value);
                }
              }
              input.popLimit(oldLimit);
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              protobuf.api.Enum.WithEnumResponse.TestEnum value = protobuf.api.Enum.WithEnumResponse.TestEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
                } else {
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  enumEmptyList_ = new java.util.ArrayList<protobuf.api.Enum.WithEnumResponse.TestEnum>();
                  mutable_bitField0_ |= 0x00000008;
                }
                enumEmptyList_.add(value);
              }
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                protobuf.api.Enum.WithEnumResponse.TestEnum value = protobuf.api.Enum.WithEnumResponse.TestEnum.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(4, rawValue);
                  } else {
                  if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                    enumEmptyList_ = new java.util.ArrayList<protobuf.api.Enum.WithEnumResponse.TestEnum>();
                    mutable_bitField0_ |= 0x00000008;
                  }
                  enumEmptyList_.add(value);
                }
              }
              input.popLimit(oldLimit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          enumList_ = java.util.Collections.unmodifiableList(enumList_);
        }
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          enumEmptyList_ = java.util.Collections.unmodifiableList(enumEmptyList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.api.Enum.internal_static_protobuf_api_WithEnumResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.api.Enum.internal_static_protobuf_api_WithEnumResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.api.Enum.WithEnumResponse.class, protobuf.api.Enum.WithEnumResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<WithEnumResponse> PARSER =
        new com.google.protobuf.AbstractParser<WithEnumResponse>() {
      public WithEnumResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WithEnumResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<WithEnumResponse> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code protobuf.api.WithEnumResponse.TestEnum}
     */
    public enum TestEnum
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>KEY1 = 100;</code>
       */
      KEY1(0, 100),
      /**
       * <code>KEY2 = 101;</code>
       */
      KEY2(1, 101),
      /**
       * <code>KEY3 = 102;</code>
       */
      KEY3(2, 102),
      ;

      /**
       * <code>KEY1 = 100;</code>
       */
      public static final int KEY1_VALUE = 100;
      /**
       * <code>KEY2 = 101;</code>
       */
      public static final int KEY2_VALUE = 101;
      /**
       * <code>KEY3 = 102;</code>
       */
      public static final int KEY3_VALUE = 102;


      public final int getNumber() { return value; }

      public static TestEnum valueOf(int value) {
        switch (value) {
          case 100: return KEY1;
          case 101: return KEY2;
          case 102: return KEY3;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<TestEnum>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<TestEnum>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<TestEnum>() {
              public TestEnum findValueByNumber(int number) {
                return TestEnum.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return protobuf.api.Enum.WithEnumResponse.getDescriptor().getEnumTypes().get(0);
      }

      private static final TestEnum[] VALUES = values();

      public static TestEnum valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private TestEnum(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:protobuf.api.WithEnumResponse.TestEnum)
    }

    private int bitField0_;
    public static final int PROP1_FIELD_NUMBER = 1;
    private int prop1_;
    /**
     * <code>required int32 prop1 = 1;</code>
     */
    public boolean hasProp1() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 prop1 = 1;</code>
     */
    public int getProp1() {
      return prop1_;
    }

    public static final int PROP2_FIELD_NUMBER = 2;
    private protobuf.api.Enum.WithEnumResponse.TestEnum prop2_;
    /**
     * <code>required .protobuf.api.WithEnumResponse.TestEnum prop2 = 2 [default = KEY2];</code>
     */
    public boolean hasProp2() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .protobuf.api.WithEnumResponse.TestEnum prop2 = 2 [default = KEY2];</code>
     */
    public protobuf.api.Enum.WithEnumResponse.TestEnum getProp2() {
      return prop2_;
    }

    public static final int ENUMLIST_FIELD_NUMBER = 3;
    private java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> enumList_;
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
     */
    public java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> getEnumListList() {
      return enumList_;
    }
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
     */
    public int getEnumListCount() {
      return enumList_.size();
    }
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
     */
    public protobuf.api.Enum.WithEnumResponse.TestEnum getEnumList(int index) {
      return enumList_.get(index);
    }

    public static final int ENUMEMPTYLIST_FIELD_NUMBER = 4;
    private java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> enumEmptyList_;
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
     */
    public java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> getEnumEmptyListList() {
      return enumEmptyList_;
    }
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
     */
    public int getEnumEmptyListCount() {
      return enumEmptyList_.size();
    }
    /**
     * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
     */
    public protobuf.api.Enum.WithEnumResponse.TestEnum getEnumEmptyList(int index) {
      return enumEmptyList_.get(index);
    }

    private void initFields() {
      prop1_ = 0;
      prop2_ = protobuf.api.Enum.WithEnumResponse.TestEnum.KEY2;
      enumList_ = java.util.Collections.emptyList();
      enumEmptyList_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasProp1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasProp2()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, prop1_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, prop2_.getNumber());
      }
      for (int i = 0; i < enumList_.size(); i++) {
        output.writeEnum(3, enumList_.get(i).getNumber());
      }
      for (int i = 0; i < enumEmptyList_.size(); i++) {
        output.writeEnum(4, enumEmptyList_.get(i).getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, prop1_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, prop2_.getNumber());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < enumList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(enumList_.get(i).getNumber());
        }
        size += dataSize;
        size += 1 * enumList_.size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < enumEmptyList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(enumEmptyList_.get(i).getNumber());
        }
        size += dataSize;
        size += 1 * enumEmptyList_.size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static protobuf.api.Enum.WithEnumResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.api.Enum.WithEnumResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.api.Enum.WithEnumResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.api.Enum.WithEnumResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.api.Enum.WithEnumResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf.api.Enum.WithEnumResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protobuf.api.Enum.WithEnumResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protobuf.api.Enum.WithEnumResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protobuf.api.Enum.WithEnumResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf.api.Enum.WithEnumResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf.api.Enum.WithEnumResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protobuf.api.WithEnumResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.api.WithEnumResponse)
        protobuf.api.Enum.WithEnumResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf.api.Enum.internal_static_protobuf_api_WithEnumResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf.api.Enum.internal_static_protobuf_api_WithEnumResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf.api.Enum.WithEnumResponse.class, protobuf.api.Enum.WithEnumResponse.Builder.class);
      }

      // Construct using protobuf.api.Enum.WithEnumResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        prop1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        prop2_ = protobuf.api.Enum.WithEnumResponse.TestEnum.KEY2;
        bitField0_ = (bitField0_ & ~0x00000002);
        enumList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        enumEmptyList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf.api.Enum.internal_static_protobuf_api_WithEnumResponse_descriptor;
      }

      public protobuf.api.Enum.WithEnumResponse getDefaultInstanceForType() {
        return protobuf.api.Enum.WithEnumResponse.getDefaultInstance();
      }

      public protobuf.api.Enum.WithEnumResponse build() {
        protobuf.api.Enum.WithEnumResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protobuf.api.Enum.WithEnumResponse buildPartial() {
        protobuf.api.Enum.WithEnumResponse result = new protobuf.api.Enum.WithEnumResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.prop1_ = prop1_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.prop2_ = prop2_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          enumList_ = java.util.Collections.unmodifiableList(enumList_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.enumList_ = enumList_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          enumEmptyList_ = java.util.Collections.unmodifiableList(enumEmptyList_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.enumEmptyList_ = enumEmptyList_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf.api.Enum.WithEnumResponse) {
          return mergeFrom((protobuf.api.Enum.WithEnumResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf.api.Enum.WithEnumResponse other) {
        if (other == protobuf.api.Enum.WithEnumResponse.getDefaultInstance()) return this;
        if (other.hasProp1()) {
          setProp1(other.getProp1());
        }
        if (other.hasProp2()) {
          setProp2(other.getProp2());
        }
        if (!other.enumList_.isEmpty()) {
          if (enumList_.isEmpty()) {
            enumList_ = other.enumList_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEnumListIsMutable();
            enumList_.addAll(other.enumList_);
          }
          onChanged();
        }
        if (!other.enumEmptyList_.isEmpty()) {
          if (enumEmptyList_.isEmpty()) {
            enumEmptyList_ = other.enumEmptyList_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureEnumEmptyListIsMutable();
            enumEmptyList_.addAll(other.enumEmptyList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasProp1()) {
          
          return false;
        }
        if (!hasProp2()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protobuf.api.Enum.WithEnumResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf.api.Enum.WithEnumResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int prop1_ ;
      /**
       * <code>required int32 prop1 = 1;</code>
       */
      public boolean hasProp1() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 prop1 = 1;</code>
       */
      public int getProp1() {
        return prop1_;
      }
      /**
       * <code>required int32 prop1 = 1;</code>
       */
      public Builder setProp1(int value) {
        bitField0_ |= 0x00000001;
        prop1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 prop1 = 1;</code>
       */
      public Builder clearProp1() {
        bitField0_ = (bitField0_ & ~0x00000001);
        prop1_ = 0;
        onChanged();
        return this;
      }

      private protobuf.api.Enum.WithEnumResponse.TestEnum prop2_ = protobuf.api.Enum.WithEnumResponse.TestEnum.KEY2;
      /**
       * <code>required .protobuf.api.WithEnumResponse.TestEnum prop2 = 2 [default = KEY2];</code>
       */
      public boolean hasProp2() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .protobuf.api.WithEnumResponse.TestEnum prop2 = 2 [default = KEY2];</code>
       */
      public protobuf.api.Enum.WithEnumResponse.TestEnum getProp2() {
        return prop2_;
      }
      /**
       * <code>required .protobuf.api.WithEnumResponse.TestEnum prop2 = 2 [default = KEY2];</code>
       */
      public Builder setProp2(protobuf.api.Enum.WithEnumResponse.TestEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        prop2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .protobuf.api.WithEnumResponse.TestEnum prop2 = 2 [default = KEY2];</code>
       */
      public Builder clearProp2() {
        bitField0_ = (bitField0_ & ~0x00000002);
        prop2_ = protobuf.api.Enum.WithEnumResponse.TestEnum.KEY2;
        onChanged();
        return this;
      }

      private java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> enumList_ =
        java.util.Collections.emptyList();
      private void ensureEnumListIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          enumList_ = new java.util.ArrayList<protobuf.api.Enum.WithEnumResponse.TestEnum>(enumList_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
       */
      public java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> getEnumListList() {
        return java.util.Collections.unmodifiableList(enumList_);
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
       */
      public int getEnumListCount() {
        return enumList_.size();
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
       */
      public protobuf.api.Enum.WithEnumResponse.TestEnum getEnumList(int index) {
        return enumList_.get(index);
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
       */
      public Builder setEnumList(
          int index, protobuf.api.Enum.WithEnumResponse.TestEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnumListIsMutable();
        enumList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
       */
      public Builder addEnumList(protobuf.api.Enum.WithEnumResponse.TestEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnumListIsMutable();
        enumList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
       */
      public Builder addAllEnumList(
          java.lang.Iterable<? extends protobuf.api.Enum.WithEnumResponse.TestEnum> values) {
        ensureEnumListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, enumList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumList = 3;</code>
       */
      public Builder clearEnumList() {
        enumList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      private java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> enumEmptyList_ =
        java.util.Collections.emptyList();
      private void ensureEnumEmptyListIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          enumEmptyList_ = new java.util.ArrayList<protobuf.api.Enum.WithEnumResponse.TestEnum>(enumEmptyList_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
       */
      public java.util.List<protobuf.api.Enum.WithEnumResponse.TestEnum> getEnumEmptyListList() {
        return java.util.Collections.unmodifiableList(enumEmptyList_);
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
       */
      public int getEnumEmptyListCount() {
        return enumEmptyList_.size();
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
       */
      public protobuf.api.Enum.WithEnumResponse.TestEnum getEnumEmptyList(int index) {
        return enumEmptyList_.get(index);
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
       */
      public Builder setEnumEmptyList(
          int index, protobuf.api.Enum.WithEnumResponse.TestEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnumEmptyListIsMutable();
        enumEmptyList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
       */
      public Builder addEnumEmptyList(protobuf.api.Enum.WithEnumResponse.TestEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnumEmptyListIsMutable();
        enumEmptyList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
       */
      public Builder addAllEnumEmptyList(
          java.lang.Iterable<? extends protobuf.api.Enum.WithEnumResponse.TestEnum> values) {
        ensureEnumEmptyListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, enumEmptyList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .protobuf.api.WithEnumResponse.TestEnum enumEmptyList = 4;</code>
       */
      public Builder clearEnumEmptyList() {
        enumEmptyList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protobuf.api.WithEnumResponse)
    }

    static {
      defaultInstance = new WithEnumResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protobuf.api.WithEnumResponse)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_api_WithEnumResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_api_WithEnumResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016api/enum.proto\022\014protobuf.api\"\204\002\n\020WithE" +
      "numResponse\022\r\n\005prop1\030\001 \002(\005\022<\n\005prop2\030\002 \002(" +
      "\0162\'.protobuf.api.WithEnumResponse.TestEn" +
      "um:\004KEY2\0229\n\010enumList\030\003 \003(\0162\'.protobuf.ap" +
      "i.WithEnumResponse.TestEnum\022>\n\renumEmpty" +
      "List\030\004 \003(\0162\'.protobuf.api.WithEnumRespon" +
      "se.TestEnum\"(\n\010TestEnum\022\010\n\004KEY1\020d\022\010\n\004KEY" +
      "2\020e\022\010\n\004KEY3\020f"
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
        }, assigner);
    internal_static_protobuf_api_WithEnumResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_api_WithEnumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protobuf_api_WithEnumResponse_descriptor,
        new java.lang.String[] { "Prop1", "Prop2", "EnumList", "EnumEmptyList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
