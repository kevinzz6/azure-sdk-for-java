// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.DraModelCustomProperties;

public final class DraModelCustomPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DraModelCustomProperties model = BinaryData.fromString("{\"instanceType\":\"DraModelCustomProperties\"}")
            .toObject(DraModelCustomProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DraModelCustomProperties model = new DraModelCustomProperties();
        model = BinaryData.fromObject(model).toObject(DraModelCustomProperties.class);
    }
}
