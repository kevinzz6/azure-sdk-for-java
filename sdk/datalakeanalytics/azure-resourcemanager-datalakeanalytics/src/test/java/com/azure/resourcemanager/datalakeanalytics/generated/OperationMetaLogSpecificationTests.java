// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.models.OperationMetaLogSpecification;
import org.junit.jupiter.api.Assertions;

public final class OperationMetaLogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationMetaLogSpecification model
            = BinaryData.fromString("{\"name\":\"vxysl\",\"displayName\":\"hsfxoblytkb\",\"blobDuration\":\"pe\"}")
                .toObject(OperationMetaLogSpecification.class);
        Assertions.assertEquals("vxysl", model.name());
        Assertions.assertEquals("hsfxoblytkb", model.displayName());
        Assertions.assertEquals("pe", model.blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationMetaLogSpecification model = new OperationMetaLogSpecification().withName("vxysl")
            .withDisplayName("hsfxoblytkb")
            .withBlobDuration("pe");
        model = BinaryData.fromObject(model).toObject(OperationMetaLogSpecification.class);
        Assertions.assertEquals("vxysl", model.name());
        Assertions.assertEquals("hsfxoblytkb", model.displayName());
        Assertions.assertEquals("pe", model.blobDuration());
    }
}
