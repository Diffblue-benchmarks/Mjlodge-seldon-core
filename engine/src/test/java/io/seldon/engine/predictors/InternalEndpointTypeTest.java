package io.seldon.engine.predictors;

import io.seldon.engine.predictors.InternalEndpointType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InternalEndpointTypeTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Arrange
    final String name = "1";

    // Act
    thrown.expect(IllegalArgumentException.class);
    InternalEndpointType.valueOf(name);

    // Method is not expected to return due to exception thrown
  }
}
