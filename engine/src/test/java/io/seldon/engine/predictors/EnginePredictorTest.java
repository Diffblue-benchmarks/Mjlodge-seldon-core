package io.seldon.engine.predictors;

import io.seldon.engine.predictors.EnginePredictor;
import io.seldon.protos.DeploymentProtos.PredictorSpec;
import org.junit.Assert;
import org.junit.Test;

public class EnginePredictorTest {

  @Test
  public void getDeploymentNameOutputNotNull() {

    // Arrange
    final EnginePredictor objectUnderTest = new EnginePredictor();

    // Act
    final String actual = objectUnderTest.getDeploymentName();

    // Assert result
    Assert.assertEquals("None", actual);
  }

  @Test
  public void getPredictorSpecOutputNull() {

    // Arrange
    final EnginePredictor objectUnderTest = new EnginePredictor();

    // Act
    final PredictorSpec actual = objectUnderTest.getPredictorSpec();

    // Assert result
    Assert.assertNull(actual);
  }
}
