// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentTierListResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CommitmentTierListResultTests {
    @Test
    public void testDeserialize() {
        CommitmentTierListResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"cnjbkcnxdhbt\",\"value\":[{\"kind\":\"ywpnvjt\",\"skuName\":\"nermcl\",\"hostingModel\":\"ConnectedContainer\",\"planType\":\"hoxus\",\"tier\":\"pabgyeps\",\"maxCount\":1974668378,\"quota\":{\"quantity\":8786442375186160656,\"unit\":\"xywpmueefjzwfqkq\"},\"cost\":{\"commitmentMeterId\":\"dsuyonobgla\",\"overageMeterId\":\"qxtccmgyudx\"}},{\"kind\":\"lmoyrx\",\"skuName\":\"fudwpznt\",\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"hl\",\"tier\":\"jbhckfrlhr\",\"maxCount\":1228255689,\"quota\":{\"quantity\":1967797899884280622,\"unit\":\"ca\"},\"cost\":{\"commitmentMeterId\":\"bpzkafkuwbc\",\"overageMeterId\":\"wbme\"}}]}")
                .toObject(CommitmentTierListResult.class);
        Assertions.assertEquals("cnjbkcnxdhbt", model.nextLink());
    }

    @Test
    public void testSerialize() {
        CommitmentTierListResult model = new CommitmentTierListResult().withNextLink("cnjbkcnxdhbt");
        model = BinaryData.fromObject(model).toObject(CommitmentTierListResult.class);
        Assertions.assertEquals("cnjbkcnxdhbt", model.nextLink());
    }
}