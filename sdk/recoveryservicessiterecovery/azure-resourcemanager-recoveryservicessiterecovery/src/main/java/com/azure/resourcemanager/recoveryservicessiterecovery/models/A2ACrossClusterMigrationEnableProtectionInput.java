// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A2A Cross-Cluster Migration enable protection input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2ACrossClusterMigration")
@Fluent
public final class A2ACrossClusterMigrationEnableProtectionInput extends EnableProtectionProviderSpecificInput {
    /*
     * The fabric specific object Id of the virtual machine.
     */
    @JsonProperty(value = "fabricObjectId")
    private String fabricObjectId;

    /*
     * The recovery container Id.
     */
    @JsonProperty(value = "recoveryContainerId")
    private String recoveryContainerId;

    /** Creates an instance of A2ACrossClusterMigrationEnableProtectionInput class. */
    public A2ACrossClusterMigrationEnableProtectionInput() {
    }

    /**
     * Get the fabricObjectId property: The fabric specific object Id of the virtual machine.
     *
     * @return the fabricObjectId value.
     */
    public String fabricObjectId() {
        return this.fabricObjectId;
    }

    /**
     * Set the fabricObjectId property: The fabric specific object Id of the virtual machine.
     *
     * @param fabricObjectId the fabricObjectId value to set.
     * @return the A2ACrossClusterMigrationEnableProtectionInput object itself.
     */
    public A2ACrossClusterMigrationEnableProtectionInput withFabricObjectId(String fabricObjectId) {
        this.fabricObjectId = fabricObjectId;
        return this;
    }

    /**
     * Get the recoveryContainerId property: The recovery container Id.
     *
     * @return the recoveryContainerId value.
     */
    public String recoveryContainerId() {
        return this.recoveryContainerId;
    }

    /**
     * Set the recoveryContainerId property: The recovery container Id.
     *
     * @param recoveryContainerId the recoveryContainerId value to set.
     * @return the A2ACrossClusterMigrationEnableProtectionInput object itself.
     */
    public A2ACrossClusterMigrationEnableProtectionInput withRecoveryContainerId(String recoveryContainerId) {
        this.recoveryContainerId = recoveryContainerId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}