// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vss.proto

package org.vss;

/**
 * <pre>
 * Request payload to be used for `DeleteObject` API call to server.
 * </pre>
 * <p>
 * Protobuf type {@code vss.DeleteObjectRequest}
 */
public final class DeleteObjectRequest extends
		com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:vss.DeleteObjectRequest)
		DeleteObjectRequestOrBuilder {
	private static final long serialVersionUID = 0L;

	// Use DeleteObjectRequest.newBuilder() to construct.
	private DeleteObjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private DeleteObjectRequest() {
		storeId_ = "";
	}

	@java.lang.Override
	@SuppressWarnings({"unused"})
	protected java.lang.Object newInstance(
			UnusedPrivateParameter unused) {
		return new DeleteObjectRequest();
	}

	@java.lang.Override
	public final com.google.protobuf.UnknownFieldSet
	getUnknownFields() {
		return this.unknownFields;
	}

	public static final com.google.protobuf.Descriptors.Descriptor
	getDescriptor() {
		return org.vss.Vss.internal_static_vss_DeleteObjectRequest_descriptor;
	}

	@java.lang.Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
	internalGetFieldAccessorTable() {
		return org.vss.Vss.internal_static_vss_DeleteObjectRequest_fieldAccessorTable
				.ensureFieldAccessorsInitialized(
						org.vss.DeleteObjectRequest.class, org.vss.DeleteObjectRequest.Builder.class);
	}

	public static final int STORE_ID_FIELD_NUMBER = 1;
	private volatile java.lang.Object storeId_;

	/**
	 * <pre>
	 * `store_id` is a keyspace identifier.
	 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
	 * All APIs operate within a single `store_id`.
	 * It is up to clients to use single or multiple stores for their use-case.
	 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
	 * Authorization and billing can also be performed at the `store_id` level.
	 * </pre>
	 *
	 * <code>string store_id = 1;</code>
	 *
	 * @return The storeId.
	 */
	@java.lang.Override
	public java.lang.String getStoreId() {
		java.lang.Object ref = storeId_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs =
					(com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			storeId_ = s;
			return s;
		}
	}

	/**
	 * <pre>
	 * `store_id` is a keyspace identifier.
	 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
	 * All APIs operate within a single `store_id`.
	 * It is up to clients to use single or multiple stores for their use-case.
	 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
	 * Authorization and billing can also be performed at the `store_id` level.
	 * </pre>
	 *
	 * <code>string store_id = 1;</code>
	 *
	 * @return The bytes for storeId.
	 */
	@java.lang.Override
	public com.google.protobuf.ByteString
	getStoreIdBytes() {
		java.lang.Object ref = storeId_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b =
					com.google.protobuf.ByteString.copyFromUtf8(
							(java.lang.String) ref);
			storeId_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	public static final int KEY_VALUE_FIELD_NUMBER = 2;
	private org.vss.KeyValue keyValue_;

	/**
	 * <pre>
	 * Item to be deleted as a result of this `DeleteObjectRequest`.
	 * An item consists of a `key` and its corresponding `version`.
	 * Key-level Versioning (Conditional Delete):
	 *   The item is only deleted if the current database version against the `key` is the same as
	 *   the `version` specified in the request.
	 * Skipping key-level versioning (Non-conditional Delete):
	 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
	 *   This will perform a non-conditional delete query.
	 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
	 * If the requested item does not exist, this operation will not fail.
	 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
	 * </pre>
	 *
	 * <code>.vss.KeyValue key_value = 2;</code>
	 *
	 * @return Whether the keyValue field is set.
	 */
	@java.lang.Override
	public boolean hasKeyValue() {
		return keyValue_ != null;
	}

	/**
	 * <pre>
	 * Item to be deleted as a result of this `DeleteObjectRequest`.
	 * An item consists of a `key` and its corresponding `version`.
	 * Key-level Versioning (Conditional Delete):
	 *   The item is only deleted if the current database version against the `key` is the same as
	 *   the `version` specified in the request.
	 * Skipping key-level versioning (Non-conditional Delete):
	 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
	 *   This will perform a non-conditional delete query.
	 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
	 * If the requested item does not exist, this operation will not fail.
	 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
	 * </pre>
	 *
	 * <code>.vss.KeyValue key_value = 2;</code>
	 *
	 * @return The keyValue.
	 */
	@java.lang.Override
	public org.vss.KeyValue getKeyValue() {
		return keyValue_ == null ? org.vss.KeyValue.getDefaultInstance() : keyValue_;
	}

	/**
	 * <pre>
	 * Item to be deleted as a result of this `DeleteObjectRequest`.
	 * An item consists of a `key` and its corresponding `version`.
	 * Key-level Versioning (Conditional Delete):
	 *   The item is only deleted if the current database version against the `key` is the same as
	 *   the `version` specified in the request.
	 * Skipping key-level versioning (Non-conditional Delete):
	 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
	 *   This will perform a non-conditional delete query.
	 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
	 * If the requested item does not exist, this operation will not fail.
	 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
	 * </pre>
	 *
	 * <code>.vss.KeyValue key_value = 2;</code>
	 */
	@java.lang.Override
	public org.vss.KeyValueOrBuilder getKeyValueOrBuilder() {
		return getKeyValue();
	}

	private byte memoizedIsInitialized = -1;

	@java.lang.Override
	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1) return true;
		if (isInitialized == 0) return false;

		memoizedIsInitialized = 1;
		return true;
	}

	@java.lang.Override
	public void writeTo(com.google.protobuf.CodedOutputStream output)
			throws java.io.IOException {
		if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeId_)) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 1, storeId_);
		}
		if (keyValue_ != null) {
			output.writeMessage(2, getKeyValue());
		}
		getUnknownFields().writeTo(output);
	}

	@java.lang.Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) return size;

		size = 0;
		if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeId_)) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, storeId_);
		}
		if (keyValue_ != null) {
			size += com.google.protobuf.CodedOutputStream
					.computeMessageSize(2, getKeyValue());
		}
		size += getUnknownFields().getSerializedSize();
		memoizedSize = size;
		return size;
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof org.vss.DeleteObjectRequest)) {
			return super.equals(obj);
		}
		org.vss.DeleteObjectRequest other = (org.vss.DeleteObjectRequest) obj;

		if (!getStoreId()
				.equals(other.getStoreId())) return false;
		if (hasKeyValue() != other.hasKeyValue()) return false;
		if (hasKeyValue()) {
			if (!getKeyValue()
					.equals(other.getKeyValue())) return false;
		}
		if (!getUnknownFields().equals(other.getUnknownFields())) return false;
		return true;
	}

	@java.lang.Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = (19 * hash) + getDescriptor().hashCode();
		hash = (37 * hash) + STORE_ID_FIELD_NUMBER;
		hash = (53 * hash) + getStoreId().hashCode();
		if (hasKeyValue()) {
			hash = (37 * hash) + KEY_VALUE_FIELD_NUMBER;
			hash = (53 * hash) + getKeyValue().hashCode();
		}
		hash = (29 * hash) + getUnknownFields().hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	public static org.vss.DeleteObjectRequest parseFrom(
			java.nio.ByteBuffer data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.vss.DeleteObjectRequest parseFrom(
			java.nio.ByteBuffer data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.vss.DeleteObjectRequest parseFrom(
			com.google.protobuf.ByteString data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.vss.DeleteObjectRequest parseFrom(
			com.google.protobuf.ByteString data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.vss.DeleteObjectRequest parseFrom(byte[] data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.vss.DeleteObjectRequest parseFrom(
			byte[] data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.vss.DeleteObjectRequest parseFrom(java.io.InputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input);
	}

	public static org.vss.DeleteObjectRequest parseFrom(
			java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.vss.DeleteObjectRequest parseDelimitedFrom(java.io.InputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseDelimitedWithIOException(PARSER, input);
	}

	public static org.vss.DeleteObjectRequest parseDelimitedFrom(
			java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.vss.DeleteObjectRequest parseFrom(
			com.google.protobuf.CodedInputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input);
	}

	public static org.vss.DeleteObjectRequest parseFrom(
			com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input, extensionRegistry);
	}

	@java.lang.Override
	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(org.vss.DeleteObjectRequest prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	@java.lang.Override
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
	 * <pre>
	 * Request payload to be used for `DeleteObject` API call to server.
	 * </pre>
	 * <p>
	 * Protobuf type {@code vss.DeleteObjectRequest}
	 */
	public static final class Builder extends
			com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:vss.DeleteObjectRequest)
			org.vss.DeleteObjectRequestOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor
		getDescriptor() {
			return org.vss.Vss.internal_static_vss_DeleteObjectRequest_descriptor;
		}

		@java.lang.Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
		internalGetFieldAccessorTable() {
			return org.vss.Vss.internal_static_vss_DeleteObjectRequest_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							org.vss.DeleteObjectRequest.class, org.vss.DeleteObjectRequest.Builder.class);
		}

		// Construct using org.vss.DeleteObjectRequest.newBuilder()
		private Builder() {

		}

		private Builder(
				com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);

		}

		@java.lang.Override
		public Builder clear() {
			super.clear();
			storeId_ = "";

			if (keyValueBuilder_ == null) {
				keyValue_ = null;
			} else {
				keyValue_ = null;
				keyValueBuilder_ = null;
			}
			return this;
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.Descriptor
		getDescriptorForType() {
			return org.vss.Vss.internal_static_vss_DeleteObjectRequest_descriptor;
		}

		@java.lang.Override
		public org.vss.DeleteObjectRequest getDefaultInstanceForType() {
			return org.vss.DeleteObjectRequest.getDefaultInstance();
		}

		@java.lang.Override
		public org.vss.DeleteObjectRequest build() {
			org.vss.DeleteObjectRequest result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@java.lang.Override
		public org.vss.DeleteObjectRequest buildPartial() {
			org.vss.DeleteObjectRequest result = new org.vss.DeleteObjectRequest(this);
			result.storeId_ = storeId_;
			if (keyValueBuilder_ == null) {
				result.keyValue_ = keyValue_;
			} else {
				result.keyValue_ = keyValueBuilder_.build();
			}
			onBuilt();
			return result;
		}

		@java.lang.Override
		public Builder clone() {
			return super.clone();
		}

		@java.lang.Override
		public Builder setField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				java.lang.Object value) {
			return super.setField(field, value);
		}

		@java.lang.Override
		public Builder clearField(
				com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		@java.lang.Override
		public Builder clearOneof(
				com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		@java.lang.Override
		public Builder setRepeatedField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				int index, java.lang.Object value) {
			return super.setRepeatedField(field, index, value);
		}

		@java.lang.Override
		public Builder addRepeatedField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				java.lang.Object value) {
			return super.addRepeatedField(field, value);
		}

		@java.lang.Override
		public Builder mergeFrom(com.google.protobuf.Message other) {
			if (other instanceof org.vss.DeleteObjectRequest) {
				return mergeFrom((org.vss.DeleteObjectRequest) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(org.vss.DeleteObjectRequest other) {
			if (other == org.vss.DeleteObjectRequest.getDefaultInstance()) return this;
			if (!other.getStoreId().isEmpty()) {
				storeId_ = other.storeId_;
				onChanged();
			}
			if (other.hasKeyValue()) {
				mergeKeyValue(other.getKeyValue());
			}
			this.mergeUnknownFields(other.getUnknownFields());
			onChanged();
			return this;
		}

		@java.lang.Override
		public final boolean isInitialized() {
			return true;
		}

		@java.lang.Override
		public Builder mergeFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			if (extensionRegistry == null) {
				throw new java.lang.NullPointerException();
			}
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
						case 0:
							done = true;
							break;
						case 10: {
							storeId_ = input.readStringRequireUtf8();

							break;
						} // case 10
						case 18: {
							input.readMessage(
									getKeyValueFieldBuilder().getBuilder(),
									extensionRegistry);

							break;
						} // case 18
						default: {
							if (!super.parseUnknownField(input, extensionRegistry, tag)) {
								done = true; // was an endgroup tag
							}
							break;
						} // default:
					} // switch (tag)
				} // while (!done)
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.unwrapIOException();
			} finally {
				onChanged();
			} // finally
			return this;
		}

		private java.lang.Object storeId_ = "";

		/**
		 * <pre>
		 * `store_id` is a keyspace identifier.
		 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
		 * All APIs operate within a single `store_id`.
		 * It is up to clients to use single or multiple stores for their use-case.
		 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
		 * Authorization and billing can also be performed at the `store_id` level.
		 * </pre>
		 *
		 * <code>string store_id = 1;</code>
		 *
		 * @return The storeId.
		 */
		public java.lang.String getStoreId() {
			java.lang.Object ref = storeId_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs =
						(com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				storeId_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <pre>
		 * `store_id` is a keyspace identifier.
		 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
		 * All APIs operate within a single `store_id`.
		 * It is up to clients to use single or multiple stores for their use-case.
		 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
		 * Authorization and billing can also be performed at the `store_id` level.
		 * </pre>
		 *
		 * <code>string store_id = 1;</code>
		 *
		 * @return The bytes for storeId.
		 */
		public com.google.protobuf.ByteString
		getStoreIdBytes() {
			java.lang.Object ref = storeId_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b =
						com.google.protobuf.ByteString.copyFromUtf8(
								(java.lang.String) ref);
				storeId_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <pre>
		 * `store_id` is a keyspace identifier.
		 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
		 * All APIs operate within a single `store_id`.
		 * It is up to clients to use single or multiple stores for their use-case.
		 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
		 * Authorization and billing can also be performed at the `store_id` level.
		 * </pre>
		 *
		 * <code>string store_id = 1;</code>
		 *
		 * @param value The storeId to set.
		 * @return This builder for chaining.
		 */
		public Builder setStoreId(
				java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			storeId_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * `store_id` is a keyspace identifier.
		 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
		 * All APIs operate within a single `store_id`.
		 * It is up to clients to use single or multiple stores for their use-case.
		 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
		 * Authorization and billing can also be performed at the `store_id` level.
		 * </pre>
		 *
		 * <code>string store_id = 1;</code>
		 *
		 * @return This builder for chaining.
		 */
		public Builder clearStoreId() {

			storeId_ = getDefaultInstance().getStoreId();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * `store_id` is a keyspace identifier.
		 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
		 * All APIs operate within a single `store_id`.
		 * It is up to clients to use single or multiple stores for their use-case.
		 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
		 * Authorization and billing can also be performed at the `store_id` level.
		 * </pre>
		 *
		 * <code>string store_id = 1;</code>
		 *
		 * @param value The bytes for storeId to set.
		 * @return This builder for chaining.
		 */
		public Builder setStoreIdBytes(
				com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			storeId_ = value;
			onChanged();
			return this;
		}

		private org.vss.KeyValue keyValue_;
		private com.google.protobuf.SingleFieldBuilderV3<
				org.vss.KeyValue, org.vss.KeyValue.Builder, org.vss.KeyValueOrBuilder> keyValueBuilder_;

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 *
		 * @return Whether the keyValue field is set.
		 */
		public boolean hasKeyValue() {
			return keyValueBuilder_ != null || keyValue_ != null;
		}

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 *
		 * @return The keyValue.
		 */
		public org.vss.KeyValue getKeyValue() {
			if (keyValueBuilder_ == null) {
				return keyValue_ == null ? org.vss.KeyValue.getDefaultInstance() : keyValue_;
			} else {
				return keyValueBuilder_.getMessage();
			}
		}

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 */
		public Builder setKeyValue(org.vss.KeyValue value) {
			if (keyValueBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				keyValue_ = value;
				onChanged();
			} else {
				keyValueBuilder_.setMessage(value);
			}

			return this;
		}

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 */
		public Builder setKeyValue(
				org.vss.KeyValue.Builder builderForValue) {
			if (keyValueBuilder_ == null) {
				keyValue_ = builderForValue.build();
				onChanged();
			} else {
				keyValueBuilder_.setMessage(builderForValue.build());
			}

			return this;
		}

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 */
		public Builder mergeKeyValue(org.vss.KeyValue value) {
			if (keyValueBuilder_ == null) {
				if (keyValue_ != null) {
					keyValue_ =
							org.vss.KeyValue.newBuilder(keyValue_).mergeFrom(value).buildPartial();
				} else {
					keyValue_ = value;
				}
				onChanged();
			} else {
				keyValueBuilder_.mergeFrom(value);
			}

			return this;
		}

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 */
		public Builder clearKeyValue() {
			if (keyValueBuilder_ == null) {
				keyValue_ = null;
				onChanged();
			} else {
				keyValue_ = null;
				keyValueBuilder_ = null;
			}

			return this;
		}

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 */
		public org.vss.KeyValue.Builder getKeyValueBuilder() {

			onChanged();
			return getKeyValueFieldBuilder().getBuilder();
		}

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 */
		public org.vss.KeyValueOrBuilder getKeyValueOrBuilder() {
			if (keyValueBuilder_ != null) {
				return keyValueBuilder_.getMessageOrBuilder();
			} else {
				return keyValue_ == null ?
						org.vss.KeyValue.getDefaultInstance() : keyValue_;
			}
		}

		/**
		 * <pre>
		 * Item to be deleted as a result of this `DeleteObjectRequest`.
		 * An item consists of a `key` and its corresponding `version`.
		 * Key-level Versioning (Conditional Delete):
		 *   The item is only deleted if the current database version against the `key` is the same as
		 *   the `version` specified in the request.
		 * Skipping key-level versioning (Non-conditional Delete):
		 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
		 *   This will perform a non-conditional delete query.
		 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
		 * If the requested item does not exist, this operation will not fail.
		 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
		 * </pre>
		 *
		 * <code>.vss.KeyValue key_value = 2;</code>
		 */
		private com.google.protobuf.SingleFieldBuilderV3<
				org.vss.KeyValue, org.vss.KeyValue.Builder, org.vss.KeyValueOrBuilder>
		getKeyValueFieldBuilder() {
			if (keyValueBuilder_ == null) {
				keyValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
						org.vss.KeyValue, org.vss.KeyValue.Builder, org.vss.KeyValueOrBuilder>(
						getKeyValue(),
						getParentForChildren(),
						isClean());
				keyValue_ = null;
			}
			return keyValueBuilder_;
		}

		@java.lang.Override
		public final Builder setUnknownFields(
				final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.setUnknownFields(unknownFields);
		}

		@java.lang.Override
		public final Builder mergeUnknownFields(
				final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.mergeUnknownFields(unknownFields);
		}


		// @@protoc_insertion_point(builder_scope:vss.DeleteObjectRequest)
	}

	// @@protoc_insertion_point(class_scope:vss.DeleteObjectRequest)
	private static final org.vss.DeleteObjectRequest DEFAULT_INSTANCE;

	static {
		DEFAULT_INSTANCE = new org.vss.DeleteObjectRequest();
	}

	public static org.vss.DeleteObjectRequest getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final com.google.protobuf.Parser<DeleteObjectRequest>
			PARSER = new com.google.protobuf.AbstractParser<DeleteObjectRequest>() {
		@java.lang.Override
		public DeleteObjectRequest parsePartialFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			Builder builder = newBuilder();
			try {
				builder.mergeFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(builder.buildPartial());
			} catch (com.google.protobuf.UninitializedMessageException e) {
				throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e)
						.setUnfinishedMessage(builder.buildPartial());
			}
			return builder.buildPartial();
		}
	};

	public static com.google.protobuf.Parser<DeleteObjectRequest> parser() {
		return PARSER;
	}

	@java.lang.Override
	public com.google.protobuf.Parser<DeleteObjectRequest> getParserForType() {
		return PARSER;
	}

	@java.lang.Override
	public org.vss.DeleteObjectRequest getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

}

