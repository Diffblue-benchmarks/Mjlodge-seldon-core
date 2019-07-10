package io.seldon.engine.metrics;

import io.micrometer.spring.web.client.RestTemplateExchangeTagsProvider;
import io.seldon.engine.metrics.MetricsConfig;
import io.seldon.engine.metrics.SeldonRestTemplateExchangeTagsProvider;
import org.junit.Assert;
import org.junit.Test;

public class MetricsConfigTest {

  @Test
  public void getSeldonTagProviderOutputNotNull() {

    // Arrange
    final MetricsConfig objectUnderTest = new MetricsConfig();

    // Act
    final RestTemplateExchangeTagsProvider actual = objectUnderTest.getSeldonTagProvider();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(((SeldonRestTemplateExchangeTagsProvider)actual).enginePredictor);
  }
}
