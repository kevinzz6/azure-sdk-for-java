// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class SubvolumeModelPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumeModelProperties model = BinaryData.fromString(
            "{\"path\":\"kh\",\"parentPath\":\"ygo\",\"size\":1410009075037068900,\"bytesUsed\":9221028808795014470,\"permissions\":\"bvleorfmluiqtqzf\",\"creationTimeStamp\":\"2021-05-04T19:19:19Z\",\"accessedTimeStamp\":\"2021-06-05T20:28:23Z\",\"modifiedTimeStamp\":\"2021-03-05T04:35Z\",\"changedTimeStamp\":\"2021-05-23T06:21:06Z\",\"provisioningState\":\"ryeu\"}")
            .toObject(SubvolumeModelProperties.class);
        Assertions.assertEquals("kh", model.path());
        Assertions.assertEquals("ygo", model.parentPath());
        Assertions.assertEquals(1410009075037068900L, model.size());
        Assertions.assertEquals(9221028808795014470L, model.bytesUsed());
        Assertions.assertEquals("bvleorfmluiqtqzf", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-04T19:19:19Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-05T20:28:23Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-05T04:35Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-23T06:21:06Z"), model.changedTimestamp());
        Assertions.assertEquals("ryeu", model.provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumeModelProperties model = new SubvolumeModelProperties().withPath("kh")
            .withParentPath("ygo")
            .withSize(1410009075037068900L)
            .withBytesUsed(9221028808795014470L)
            .withPermissions("bvleorfmluiqtqzf")
            .withCreationTimestamp(OffsetDateTime.parse("2021-05-04T19:19:19Z"))
            .withAccessedTimestamp(OffsetDateTime.parse("2021-06-05T20:28:23Z"))
            .withModifiedTimestamp(OffsetDateTime.parse("2021-03-05T04:35Z"))
            .withChangedTimestamp(OffsetDateTime.parse("2021-05-23T06:21:06Z"))
            .withProvisioningState("ryeu");
        model = BinaryData.fromObject(model).toObject(SubvolumeModelProperties.class);
        Assertions.assertEquals("kh", model.path());
        Assertions.assertEquals("ygo", model.parentPath());
        Assertions.assertEquals(1410009075037068900L, model.size());
        Assertions.assertEquals(9221028808795014470L, model.bytesUsed());
        Assertions.assertEquals("bvleorfmluiqtqzf", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-04T19:19:19Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-05T20:28:23Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-05T04:35Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-23T06:21:06Z"), model.changedTimestamp());
        Assertions.assertEquals("ryeu", model.provisioningState());
    }
}
