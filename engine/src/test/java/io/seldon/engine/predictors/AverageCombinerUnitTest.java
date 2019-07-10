package io.seldon.engine.predictors;

import io.seldon.engine.predictors.AverageCombinerUnit;
import io.seldon.engine.predictors.PredictiveUnitState;
import io.seldon.protos.PredictionProtos.SeldonMessage;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

public class AverageCombinerUnitTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void aggregateInput0NotNullOutputAPIException() {

    // Arrange
    final AverageCombinerUnit objectUnderTest = new AverageCombinerUnit();
    final ArrayList<SeldonMessage> outputs = new ArrayList<SeldonMessage>();
    final PredictiveUnitState state = new PredictiveUnitState();
    state.imageVersion = null;
    state.methods = null;
    state.type = null;
    state.endpoint = null;
    state.implementation = null;
    state.parameters = null;
    state.children = null;
    state.image = null;
    state.predictorBean = null;
    state.name = null;
    state.imageName = null;

    // Act
    thrown.expect(io.seldon.engine.exception.APIException.class);
    objectUnderTest.aggregate(outputs, state);

    // Method is not expected to return due to exception thrown
  }
}
