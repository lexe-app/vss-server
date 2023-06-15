package org.vss.api;

import com.google.protobuf.ByteString;
import jakarta.ws.rs.core.Response;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.vss.ErrorCode;
import org.vss.ErrorResponse;
import org.vss.KVStore;
import org.vss.KeyValue;
import org.vss.ListKeyVersionsRequest;
import org.vss.ListKeyVersionsResponse;
import org.vss.exception.ConflictException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ListKeyVersionsApiTest {
  private ListKeyVersionsApi listKeyVersionsApi;
  private KVStore mockKVStore;

  private static String TEST_STORE_ID = "storeId";
  private static String TEST_KEY = "key";
  private static KeyValue TEST_KV = KeyValue.newBuilder().setKey(TEST_KEY).setValue(
      ByteString.copyFrom("test_value", StandardCharsets.UTF_8)).build();

  @BeforeEach
  void setUp() {
    mockKVStore = mock(KVStore.class);
    listKeyVersionsApi = new ListKeyVersionsApi(mockKVStore);
  }

  @Test
  void execute_ValidPayload_ReturnsResponse() {
    ListKeyVersionsRequest expectedRequest =
        ListKeyVersionsRequest.newBuilder()
            .setStoreId(TEST_STORE_ID)
            .setKeyPrefix(TEST_KEY)
            .build();
    byte[] payload = expectedRequest.toByteArray();
    ListKeyVersionsResponse mockResponse = ListKeyVersionsResponse.newBuilder().addAllKeyVersions(
        List.of(TEST_KV)).build();
    when(mockKVStore.listKeyVersions(expectedRequest)).thenReturn(mockResponse);

    Response actualResponse = listKeyVersionsApi.execute(payload);

    assertThat(actualResponse.getStatus(), is(Response.Status.OK.getStatusCode()));
    assertThat(actualResponse.getEntity(), is(mockResponse.toByteArray()));
    verify(mockKVStore).listKeyVersions(expectedRequest);
  }

  @ParameterizedTest
  @MethodSource("provideErrorTestCases")
  void execute_InvalidPayload_ReturnsErrorResponse(Exception exception,
      ErrorCode errorCode) {
    ListKeyVersionsRequest expectedRequest =
        ListKeyVersionsRequest.newBuilder()
            .setStoreId(TEST_STORE_ID)
            .setKeyPrefix(TEST_KEY)
            .build();
    byte[] payload = expectedRequest.toByteArray();
    when(mockKVStore.listKeyVersions(any())).thenThrow(exception);

    Response response = listKeyVersionsApi.execute(payload);

    ErrorResponse expectedErrorResponse = ErrorResponse.newBuilder()
        .setErrorCode(errorCode)
        .setMessage("")
        .build();
    assertThat(response.getEntity(), is(expectedErrorResponse.toByteArray()));
    assertThat(response.getStatus(), is(expectedErrorResponse.getErrorCode().getNumber()));
    verify(mockKVStore).listKeyVersions(expectedRequest);
  }

  private static Stream<Arguments> provideErrorTestCases() {
    return Stream.of(
        Arguments.of(new ConflictException(""), ErrorCode.CONFLICT_EXCEPTION),
        Arguments.of(new IllegalArgumentException(""), ErrorCode.INVALID_REQUEST_EXCEPTION),
        Arguments.of(new RuntimeException(""), ErrorCode.INTERNAL_SERVER_EXCEPTION)
    );
  }
}
