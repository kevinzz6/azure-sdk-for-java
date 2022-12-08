// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BatchEndpointDefaults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BatchEndpointDefaultsTests {
    @Test
    public void testDeserialize() {
        BatchEndpointDefaults model =
            BinaryData.fromString("{\"deploymentName\":\"wsbpfvm\"}").toObject(BatchEndpointDefaults.class);
        Assertions.assertEquals("wsbpfvm", model.deploymentName());
    }

    @Test
    public void testSerialize() {
        BatchEndpointDefaults model = new BatchEndpointDefaults().withDeploymentName("wsbpfvm");
        model = BinaryData.fromObject(model).toObject(BatchEndpointDefaults.class);
        Assertions.assertEquals("wsbpfvm", model.deploymentName());
    }
}