// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Identity provider details. */
@Fluent
public final class IdentityProviderDetails {
    /*
     * The tenant Id for the service principal with which the on-premise management/data plane components would
     * communicate with our Azure services.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The application/client Id for the service principal with which the on-premise management/data plane components
     * would communicate with our Azure services.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /*
     * The object Id of the service principal with which the on-premise management/data plane components would
     * communicate with our Azure services.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /*
     * The intended Audience of the service principal with which the on-premise management/data plane components would
     * communicate with our Azure services.
     */
    @JsonProperty(value = "audience")
    private String audience;

    /*
     * The base authority for Azure Active Directory authentication.
     */
    @JsonProperty(value = "aadAuthority")
    private String aadAuthority;

    /** Creates an instance of IdentityProviderDetails class. */
    public IdentityProviderDetails() {
    }

    /**
     * Get the tenantId property: The tenant Id for the service principal with which the on-premise management/data
     * plane components would communicate with our Azure services.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant Id for the service principal with which the on-premise management/data
     * plane components would communicate with our Azure services.
     *
     * @param tenantId the tenantId value to set.
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the applicationId property: The application/client Id for the service principal with which the on-premise
     * management/data plane components would communicate with our Azure services.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The application/client Id for the service principal with which the on-premise
     * management/data plane components would communicate with our Azure services.
     *
     * @param applicationId the applicationId value to set.
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the objectId property: The object Id of the service principal with which the on-premise management/data plane
     * components would communicate with our Azure services.
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: The object Id of the service principal with which the on-premise management/data plane
     * components would communicate with our Azure services.
     *
     * @param objectId the objectId value to set.
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the audience property: The intended Audience of the service principal with which the on-premise
     * management/data plane components would communicate with our Azure services.
     *
     * @return the audience value.
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set the audience property: The intended Audience of the service principal with which the on-premise
     * management/data plane components would communicate with our Azure services.
     *
     * @param audience the audience value to set.
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Get the aadAuthority property: The base authority for Azure Active Directory authentication.
     *
     * @return the aadAuthority value.
     */
    public String aadAuthority() {
        return this.aadAuthority;
    }

    /**
     * Set the aadAuthority property: The base authority for Azure Active Directory authentication.
     *
     * @param aadAuthority the aadAuthority value to set.
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withAadAuthority(String aadAuthority) {
        this.aadAuthority = aadAuthority;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}