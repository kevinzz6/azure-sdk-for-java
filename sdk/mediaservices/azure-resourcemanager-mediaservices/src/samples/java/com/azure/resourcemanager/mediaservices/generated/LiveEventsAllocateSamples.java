// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/**
 * Samples for LiveEvents Allocate.
 */
public final class LiveEventsAllocateSamples {
    /*
     * x-ms-original-file:
     * specification/mediaservices/resource-manager/Microsoft.Media/Streaming/stable/2022-11-01/examples/liveevent-
     * allocate.json
     */
    /**
     * Sample code: Allocate a LiveEvent.
     * 
     * @param manager Entry point to MediaServicesManager.
     */
    public static void allocateALiveEvent(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.liveEvents()
            .allocate("mediaresources", "slitestmedia10", "myLiveEvent1", com.azure.core.util.Context.NONE);
    }
}
