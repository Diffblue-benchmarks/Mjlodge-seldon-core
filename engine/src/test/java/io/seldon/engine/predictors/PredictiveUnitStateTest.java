package io.seldon.engine.predictors;

import io.kubernetes.client.proto.V1.Container;
import io.seldon.engine.predictors.PredictiveUnitParameterInterface;
import io.seldon.engine.predictors.PredictiveUnitState;
import io.seldon.protos.DeploymentProtos.Endpoint;
import io.seldon.protos.DeploymentProtos.Parameter;
import io.seldon.protos.DeploymentProtos.PredictiveUnit;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PredictiveUnitStateTest {
	
	@Test
	public void testImageExtractionBasic()
	{
		final String name = "test";
		PredictiveUnit pu = PredictiveUnit.newBuilder().setName(name).setEndpoint(Endpoint.newBuilder().setServiceHost("host")).build();
		Map<String,Container> containersMap = new HashMap<String,Container>();
		containersMap.put(name, Container.newBuilder().setImage("myimage:0.1").build());
		PredictiveUnitState pus = new PredictiveUnitState(pu, containersMap);
		Assert.assertEquals("myimage", pus.imageName);
		Assert.assertEquals("0.1", pus.imageVersion);
	}
	
	@Test
	public void testImageExtractionWithPort()
	{
		final String name = "test";
		PredictiveUnit pu = PredictiveUnit.newBuilder().setName(name).setEndpoint(Endpoint.newBuilder().setServiceHost("host")).build();
		Map<String,Container> containersMap = new HashMap<String,Container>();
		containersMap.put(name, Container.newBuilder().setImage("myrep:1234/someorg/myimage:0.1").build());
		PredictiveUnitState pus = new PredictiveUnitState(pu, containersMap);
		Assert.assertEquals("myrep:1234/someorg/myimage", pus.imageName);
		Assert.assertEquals("0.1", pus.imageVersion);
	}

  @Test
  public void addChildInputNullOutputVoid() {

    // Arrange
    final PredictiveUnitState objectUnderTest = new PredictiveUnitState();
    final PredictiveUnitState predictiveUnitState = null;

    // Act
    objectUnderTest.addChild(predictiveUnitState);

    // Assert side effects
    final ArrayList<PredictiveUnitState> arrayList = new ArrayList<PredictiveUnitState>();
    arrayList.add(null);
    Assert.assertEquals(arrayList, objectUnderTest.children);
  }

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final PredictiveUnitState objectUnderTest = new PredictiveUnitState();

    // Assert side effects
    final ArrayList<PredictiveUnitState> arrayList = new ArrayList<PredictiveUnitState>();
    Assert.assertEquals(arrayList, objectUnderTest.children);
  }


  @Test
  public void deserializeParametersInput0Output0() {

    // Arrange
    final ArrayList<Parameter> Parameters = new ArrayList<Parameter>();

    // Act
    final Map<String, PredictiveUnitParameterInterface> actual =
        PredictiveUnitState.deserializeParameters(Parameters);

    // Assert result
    final HashMap<String, PredictiveUnitParameterInterface> hashMap =
        new HashMap<String, PredictiveUnitParameterInterface>();
    Assert.assertEquals(hashMap, actual);
  }
}
