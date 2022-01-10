package org.openapitools.openapidiff.core.compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.openapitools.openapidiff.core.TestUtils.assertOpenApiBackwardIncompatible;

class AddRequestRequiredFieldCompatibilityTest extends Assertions {
  @Test
  public void shouldBeIncompatibleChange() {
    assertOpenApiBackwardIncompatible(
        "backwardCompatibility/add_request_required_field_reference.yaml",
        "backwardCompatibility/add_request_required_field_changed.yaml");
  }
}
