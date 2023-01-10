// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A2A provider specific settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2ACrossClusterMigration")
@Fluent
public final class A2ACrossClusterMigrationReplicationDetails extends ReplicationProviderSpecificSettings {
    /*
     * The fabric specific object Id of the virtual machine.
     */
    @JsonProperty(value = "fabricObjectId")
    private String fabricObjectId;

    /*
     * Primary fabric location.
     */
    @JsonProperty(value = "primaryFabricLocation")
    private String primaryFabricLocation;

    /*
     * The type of operating system.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /*
     * The protection state for the vm.
     */
    @JsonProperty(value = "vmProtectionState")
    private String vmProtectionState;

    /*
     * The protection state description for the vm.
     */
    @JsonProperty(value = "vmProtectionStateDescription")
    private String vmProtectionStateDescription;

    /*
     * An id associated with the PE that survives actions like switch protection which change the backing PE/CPE
     * objects internally.The lifecycle id gets carried forward to have a link/continuity in being able to have an Id
     * that denotes the "same" protected item even though other internal Ids/ARM Id might be changing.
     */
    @JsonProperty(value = "lifecycleId")
    private String lifecycleId;

    /** Creates an instance of A2ACrossClusterMigrationReplicationDetails class. */
    public A2ACrossClusterMigrationReplicationDetails() {
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
     * @return the A2ACrossClusterMigrationReplicationDetails object itself.
     */
    public A2ACrossClusterMigrationReplicationDetails withFabricObjectId(String fabricObjectId) {
        this.fabricObjectId = fabricObjectId;
        return this;
    }

    /**
     * Get the primaryFabricLocation property: Primary fabric location.
     *
     * @return the primaryFabricLocation value.
     */
    public String primaryFabricLocation() {
        return this.primaryFabricLocation;
    }

    /**
     * Set the primaryFabricLocation property: Primary fabric location.
     *
     * @param primaryFabricLocation the primaryFabricLocation value to set.
     * @return the A2ACrossClusterMigrationReplicationDetails object itself.
     */
    public A2ACrossClusterMigrationReplicationDetails withPrimaryFabricLocation(String primaryFabricLocation) {
        this.primaryFabricLocation = primaryFabricLocation;
        return this;
    }

    /**
     * Get the osType property: The type of operating system.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The type of operating system.
     *
     * @param osType the osType value to set.
     * @return the A2ACrossClusterMigrationReplicationDetails object itself.
     */
    public A2ACrossClusterMigrationReplicationDetails withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the vmProtectionState property: The protection state for the vm.
     *
     * @return the vmProtectionState value.
     */
    public String vmProtectionState() {
        return this.vmProtectionState;
    }

    /**
     * Set the vmProtectionState property: The protection state for the vm.
     *
     * @param vmProtectionState the vmProtectionState value to set.
     * @return the A2ACrossClusterMigrationReplicationDetails object itself.
     */
    public A2ACrossClusterMigrationReplicationDetails withVmProtectionState(String vmProtectionState) {
        this.vmProtectionState = vmProtectionState;
        return this;
    }

    /**
     * Get the vmProtectionStateDescription property: The protection state description for the vm.
     *
     * @return the vmProtectionStateDescription value.
     */
    public String vmProtectionStateDescription() {
        return this.vmProtectionStateDescription;
    }

    /**
     * Set the vmProtectionStateDescription property: The protection state description for the vm.
     *
     * @param vmProtectionStateDescription the vmProtectionStateDescription value to set.
     * @return the A2ACrossClusterMigrationReplicationDetails object itself.
     */
    public A2ACrossClusterMigrationReplicationDetails withVmProtectionStateDescription(
        String vmProtectionStateDescription) {
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        return this;
    }

    /**
     * Get the lifecycleId property: An id associated with the PE that survives actions like switch protection which
     * change the backing PE/CPE objects internally.The lifecycle id gets carried forward to have a link/continuity in
     * being able to have an Id that denotes the "same" protected item even though other internal Ids/ARM Id might be
     * changing.
     *
     * @return the lifecycleId value.
     */
    public String lifecycleId() {
        return this.lifecycleId;
    }

    /**
     * Set the lifecycleId property: An id associated with the PE that survives actions like switch protection which
     * change the backing PE/CPE objects internally.The lifecycle id gets carried forward to have a link/continuity in
     * being able to have an Id that denotes the "same" protected item even though other internal Ids/ARM Id might be
     * changing.
     *
     * @param lifecycleId the lifecycleId value to set.
     * @return the A2ACrossClusterMigrationReplicationDetails object itself.
     */
    public A2ACrossClusterMigrationReplicationDetails withLifecycleId(String lifecycleId) {
        this.lifecycleId = lifecycleId;
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