// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentitySettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedIdentitySettingsTests {
    @Test
    public void testDeserialize() {
        ManagedIdentitySettings model =
            BinaryData.fromString("{\"resource\":\"exilzznfqqnvwpmq\"}").toObject(ManagedIdentitySettings.class);
        Assertions.assertEquals("exilzznfqqnvwpmq", model.resource());
    }

    @Test
    public void testSerialize() {
        ManagedIdentitySettings model = new ManagedIdentitySettings().withResource("exilzznfqqnvwpmq");
        model = BinaryData.fromObject(model).toObject(ManagedIdentitySettings.class);
        Assertions.assertEquals("exilzznfqqnvwpmq", model.resource());
    }
}