package io.seldon.engine.predictors;

import com.google.protobuf.InvalidProtocolBufferException;
import io.seldon.engine.predictors.AverageCombinerUnit;
import io.seldon.engine.predictors.PredictiveUnitState;
import io.seldon.protos.PredictionProtos.SeldonMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PredictiveUnitImplTest {

  @Test
  public void readyInputNullOutputTrue() {

    // Arrange
    final AverageCombinerUnit objectUnderTest = new AverageCombinerUnit();
    final PredictiveUnitState state = null;

    // Act
    final boolean actual = objectUnderTest.ready(state);

    // Assert result
    Assert.assertTrue(actual);
  }

  @Test
  public void transformInputInputNullNullOutputNull() throws InvalidProtocolBufferException {

    // Arrange
    final AverageCombinerUnit objectUnderTest = new AverageCombinerUnit();
    final SeldonMessage input = null;
    final PredictiveUnitState state = null;

    // Act
    final SeldonMessage actual = objectUnderTest.transformInput(input, state);

    // Assert result
    Assert.assertNull(actual);
  }

  @Test
  public void transformOutputInputNullNullOutputNull() throws InvalidProtocolBufferException {

    // Arrange
    final AverageCombinerUnit objectUnderTest = new AverageCombinerUnit();
    final SeldonMessage output = null;
    final PredictiveUnitState state = null;

    // Act
    final SeldonMessage actual = objectUnderTest.transformOutput(output, state);

    // Assert result
    Assert.assertNull(actual);
  }
}
