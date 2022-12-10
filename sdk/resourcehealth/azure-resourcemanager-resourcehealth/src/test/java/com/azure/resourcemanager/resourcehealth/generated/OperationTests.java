// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.models.Operation;
import com.azure.resourcemanager.resourcehealth.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationTests {
    @Test
    public void testDeserialize() {
        Operation model =
            BinaryData
                .fromString(
                    "{\"name\":\"qex\",\"display\":{\"provider\":\"c\",\"resource\":\"c\",\"operation\":\"ierhhbcsglummaj\",\"description\":\"aodxo\"}}")
                .toObject(Operation.class);
        Assertions.assertEquals("qex", model.name());
        Assertions.assertEquals("c", model.display().provider());
        Assertions.assertEquals("c", model.display().resource());
        Assertions.assertEquals("ierhhbcsglummaj", model.display().operation());
        Assertions.assertEquals("aodxo", model.display().description());
    }

    @Test
    public void testSerialize() {
        Operation model =
            new Operation()
                .withName("qex")
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("c")
                        .withResource("c")
                        .withOperation("ierhhbcsglummaj")
                        .withDescription("aodxo"));
        model = BinaryData.fromObject(model).toObject(Operation.class);
        Assertions.assertEquals("qex", model.name());
        Assertions.assertEquals("c", model.display().provider());
        Assertions.assertEquals("c", model.display().resource());
        Assertions.assertEquals("ierhhbcsglummaj", model.display().operation());
        Assertions.assertEquals("aodxo", model.display().description());
    }
}