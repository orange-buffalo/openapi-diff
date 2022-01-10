package org.openapitools.openapidiff.core.compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.openapitools.openapidiff.core.TestUtils.assertOpenApiBackwardCompatible;

class RemovedQueryParamsCompatibilityTest extends Assertions {

    @Test
    public void shouldBeIncompatibleChange() {
        assertOpenApiBackwardCompatible(
                "backwardCompatibility/remove_query_params_reference.yaml",
                "backwardCompatibility/remove_query_params_changed.yaml",
                false);
    }
}
