// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.Autoscale;
import com.azure.resourcemanager.hdinsight.models.AutoscaleCapacity;
import com.azure.resourcemanager.hdinsight.models.AutoscaleRecurrence;
import com.azure.resourcemanager.hdinsight.models.AutoscaleSchedule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AutoscaleTests {
    @Test
    public void testDeserialize() {
        Autoscale model =
            BinaryData
                .fromString(
                    "{\"capacity\":{\"minInstanceCount\":461040275,\"maxInstanceCount\":564452713},\"recurrence\":{\"timeZone\":\"ljfmppee\",\"schedule\":[{\"days\":[]},{\"days\":[]}]}}")
                .toObject(Autoscale.class);
        Assertions.assertEquals(461040275, model.capacity().minInstanceCount());
        Assertions.assertEquals(564452713, model.capacity().maxInstanceCount());
        Assertions.assertEquals("ljfmppee", model.recurrence().timeZone());
    }

    @Test
    public void testSerialize() {
        Autoscale model =
            new Autoscale()
                .withCapacity(new AutoscaleCapacity().withMinInstanceCount(461040275).withMaxInstanceCount(564452713))
                .withRecurrence(
                    new AutoscaleRecurrence()
                        .withTimeZone("ljfmppee")
                        .withSchedule(
                            Arrays
                                .asList(
                                    new AutoscaleSchedule().withDays(Arrays.asList()),
                                    new AutoscaleSchedule().withDays(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(Autoscale.class);
        Assertions.assertEquals(461040275, model.capacity().minInstanceCount());
        Assertions.assertEquals(564452713, model.capacity().maxInstanceCount());
        Assertions.assertEquals("ljfmppee", model.recurrence().timeZone());
    }
}