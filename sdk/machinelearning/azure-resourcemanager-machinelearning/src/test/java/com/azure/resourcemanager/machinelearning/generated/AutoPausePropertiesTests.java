// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AutoPauseProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AutoPausePropertiesTests {
    @Test
    public void testDeserialize() {
        AutoPauseProperties model =
            BinaryData
                .fromString("{\"delayInMinutes\":1505052289,\"enabled\":true}")
                .toObject(AutoPauseProperties.class);
        Assertions.assertEquals(1505052289, model.delayInMinutes());
        Assertions.assertEquals(true, model.enabled());
    }

    @Test
    public void testSerialize() {
        AutoPauseProperties model = new AutoPauseProperties().withDelayInMinutes(1505052289).withEnabled(true);
        model = BinaryData.fromObject(model).toObject(AutoPauseProperties.class);
        Assertions.assertEquals(1505052289, model.delayInMinutes());
        Assertions.assertEquals(true, model.enabled());
    }
}