package io.seldon.engine.predictors;

import io.seldon.engine.predictors.PredictiveUnitParameterType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PredictiveUnitParameterTypeTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Arrange
    final String name = "3";

    // Act
    thrown.expect(IllegalArgumentException.class);
    PredictiveUnitParameterType.valueOf(name);

    // Method is not expected to return due to exception thrown
  }
}
