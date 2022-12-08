// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.ResourceLogCategory;
import com.azure.resourcemanager.webpubsub.models.ResourceLogConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceLogConfigurationTests {
    @Test
    public void testDeserialize() {
        ResourceLogConfiguration model =
            BinaryData
                .fromString(
                    "{\"categories\":[{\"name\":\"qmhjjdhtld\",\"enabled\":\"yzxuutkncw\"},{\"name\":\"wsvlxotogtwrupqs\",\"enabled\":\"nmic\"},{\"name\":\"vce\",\"enabled\":\"eil\"},{\"name\":\"notyfjfcnjbkcn\",\"enabled\":\"hbttkphyw\"}]}")
                .toObject(ResourceLogConfiguration.class);
        Assertions.assertEquals("qmhjjdhtld", model.categories().get(0).name());
        Assertions.assertEquals("yzxuutkncw", model.categories().get(0).enabled());
    }

    @Test
    public void testSerialize() {
        ResourceLogConfiguration model =
            new ResourceLogConfiguration()
                .withCategories(
                    Arrays
                        .asList(
                            new ResourceLogCategory().withName("qmhjjdhtld").withEnabled("yzxuutkncw"),
                            new ResourceLogCategory().withName("wsvlxotogtwrupqs").withEnabled("nmic"),
                            new ResourceLogCategory().withName("vce").withEnabled("eil"),
                            new ResourceLogCategory().withName("notyfjfcnjbkcn").withEnabled("hbttkphyw")));
        model = BinaryData.fromObject(model).toObject(ResourceLogConfiguration.class);
        Assertions.assertEquals("qmhjjdhtld", model.categories().get(0).name());
        Assertions.assertEquals("yzxuutkncw", model.categories().get(0).enabled());
    }
}