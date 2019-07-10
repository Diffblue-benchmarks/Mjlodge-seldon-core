package io.seldon.engine.pb;

import com.google.gson.JsonElement;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message.Builder;
import com.google.protobuf.MessageOrBuilder;
import io.seldon.engine.pb.IntOrStringUtils.IntOrStringConverter;
import io.seldon.engine.pb.IntOrStringUtils.IntOrStringParser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

public class IntOrStringUtilsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void convertInputNullOutputNullPointerException() throws IOException {

    // Arrange
    final IntOrStringConverter objectUnderTest = new IntOrStringConverter();
    final MessageOrBuilder message = null;

    // Act
    thrown.expect(NullPointerException.class);
    objectUnderTest.convert(message);

    // Method is not expected to return due to exception thrown
  }


  @Test
  public void mergeInputNullNullOutputNullPointerException() throws InvalidProtocolBufferException {

    // Arrange
    final IntOrStringParser objectUnderTest = new IntOrStringParser();
    final JsonElement json = null;
    final Builder builder = null;

    // Act
    thrown.expect(NullPointerException.class);
    objectUnderTest.merge(json, builder);

    // Method is not expected to return due to exception thrown
  }
}
