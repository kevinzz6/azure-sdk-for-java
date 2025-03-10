// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureadexternalidentities.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azureadexternalidentities.fluent.models.GuestUsagesResourceInner;
import com.azure.resourcemanager.azureadexternalidentities.models.GuestUsagesResource;
import com.azure.resourcemanager.azureadexternalidentities.models.GuestUsagesResourcePatch;
import java.util.Collections;
import java.util.Map;

public final class GuestUsagesResourceImpl
    implements GuestUsagesResource, GuestUsagesResource.Definition, GuestUsagesResource.Update {
    private GuestUsagesResourceInner innerObject;

    private final com.azure.resourcemanager.azureadexternalidentities.ExternalIdentitiesConfigurationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public GuestUsagesResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azureadexternalidentities.ExternalIdentitiesConfigurationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private GuestUsagesResourcePatch updateResourcePatch;

    public GuestUsagesResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public GuestUsagesResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getGuestUsages()
            .createWithResponse(resourceGroupName, resourceName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public GuestUsagesResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGuestUsages()
            .createWithResponse(resourceGroupName, resourceName, this.innerModel(), context)
            .getValue();
        return this;
    }

    GuestUsagesResourceImpl(String name,
        com.azure.resourcemanager.azureadexternalidentities.ExternalIdentitiesConfigurationManager serviceManager) {
        this.innerObject = new GuestUsagesResourceInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public GuestUsagesResourceImpl update() {
        this.updateResourcePatch = new GuestUsagesResourcePatch();
        return this;
    }

    public GuestUsagesResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getGuestUsages()
            .updateWithResponse(resourceGroupName, resourceName, updateResourcePatch, Context.NONE)
            .getValue();
        return this;
    }

    public GuestUsagesResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGuestUsages()
            .updateWithResponse(resourceGroupName, resourceName, updateResourcePatch, context)
            .getValue();
        return this;
    }

    GuestUsagesResourceImpl(GuestUsagesResourceInner innerObject,
        com.azure.resourcemanager.azureadexternalidentities.ExternalIdentitiesConfigurationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "guestUsages");
    }

    public GuestUsagesResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getGuestUsages()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
            .getValue();
        return this;
    }

    public GuestUsagesResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGuestUsages()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
            .getValue();
        return this;
    }

    public GuestUsagesResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public GuestUsagesResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public GuestUsagesResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateResourcePatch.withTags(tags);
            return this;
        }
    }

    public GuestUsagesResourceImpl withTenantId(String tenantId) {
        this.innerModel().withTenantId(tenantId);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
