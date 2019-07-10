package io.seldon.engine.config;

import io.seldon.engine.config.AppConfig;
import io.seldon.engine.predictors.EnginePredictor;
import org.junit.Assert;
import org.junit.Test;

public class AppConfigTest {

  @Test
  public void enginePredictorOutputNotNull() {

    // Arrange
    final AppConfig objectUnderTest = new AppConfig();

    // Act
    final EnginePredictor actual = objectUnderTest.enginePredictor();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("None", actual.getDeploymentName());
    Assert.assertNull(actual.getPredictorSpec());
  }
}
