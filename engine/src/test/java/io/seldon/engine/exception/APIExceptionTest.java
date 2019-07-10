package io.seldon.engine.exception;

import io.seldon.engine.exception.APIException.ApiExceptionType;
import io.seldon.engine.exception.APIException;
import org.junit.Assert;
import org.junit.Test;

public class APIExceptionTest {

  @Test
  public void getApiExceptionTypeOutputNotNull() {

    // Arrange
    final APIException objectUnderTest =
        new APIException(APIException.ApiExceptionType.ENGINE_MICROSERVICE_ERROR, "a\'b\'c");

    // Act
    final APIException.ApiExceptionType actual = objectUnderTest.getApiExceptionType();

    // Assert result
    Assert.assertEquals(APIException.ApiExceptionType.ENGINE_MICROSERVICE_ERROR, actual);
  }

  @Test
  public void getHttpCodeOutputPositive() {

    // Arrange
    final APIException.ApiExceptionType objectUnderTest =
        APIException.ApiExceptionType.ENGINE_INVALID_COMBINER_RESPONSE;

    // Act
    final int actual = objectUnderTest.getHttpCode();

    // Assert result
    Assert.assertEquals(500, actual);
  }

  @Test
  public void getIdOutputPositive() {

    // Arrange
    final APIException.ApiExceptionType objectUnderTest =
        APIException.ApiExceptionType.ENGINE_INVALID_COMBINER_RESPONSE;

    // Act
    final int actual = objectUnderTest.getId();

    // Assert result
    Assert.assertEquals(204, actual);
  }

  @Test
  public void getInfoOutputNotNull() {

    // Arrange
    final APIException objectUnderTest =
        new APIException(APIException.ApiExceptionType.ENGINE_MICROSERVICE_ERROR, "a\'b\'c");

    // Act
    final String actual = objectUnderTest.getInfo();

    // Assert result
    Assert.assertEquals("a\'b\'c", actual);
  }

  @Test
  public void getMessageOutputNotNull() {

    // Arrange
    final APIException.ApiExceptionType objectUnderTest =
        APIException.ApiExceptionType.ENGINE_INVALID_COMBINER_RESPONSE;

    // Act
    final String actual = objectUnderTest.getMessage();

    // Assert result
    Assert.assertEquals("Invalid number of predictions from combiner", actual);
  }
}
