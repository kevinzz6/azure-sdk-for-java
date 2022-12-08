// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.Context;

/** Samples for TagRules Delete. */
public final class TagRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/elastic/resource-manager/Microsoft.Elastic/preview/2022-07-01-preview/examples/TagRules_Delete.json
     */
    /**
     * Sample code: TagRules_Delete.
     *
     * @param manager Entry point to ElasticManager.
     */
    public static void tagRulesDelete(com.azure.resourcemanager.elastic.ElasticManager manager) {
        manager.tagRules().delete("myResourceGroup", "myMonitor", "default", Context.NONE);
    }
}