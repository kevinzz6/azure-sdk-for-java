// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A2A protected disk details. */
@Fluent
public final class A2AProtectedDiskDetails {
    /*
     * The disk uri.
     */
    @JsonProperty(value = "diskUri")
    private String diskUri;

    /*
     * The recovery disk storage account.
     */
    @JsonProperty(value = "recoveryAzureStorageAccountId")
    private String recoveryAzureStorageAccountId;

    /*
     * The primary disk storage account.
     */
    @JsonProperty(value = "primaryDiskAzureStorageAccountId")
    private String primaryDiskAzureStorageAccountId;

    /*
     * Recovery disk uri.
     */
    @JsonProperty(value = "recoveryDiskUri")
    private String recoveryDiskUri;

    /*
     * The disk name.
     */
    @JsonProperty(value = "diskName")
    private String diskName;

    /*
     * The disk capacity in bytes.
     */
    @JsonProperty(value = "diskCapacityInBytes")
    private Long diskCapacityInBytes;

    /*
     * The primary staging storage account.
     */
    @JsonProperty(value = "primaryStagingAzureStorageAccountId")
    private String primaryStagingAzureStorageAccountId;

    /*
     * The type of disk.
     */
    @JsonProperty(value = "diskType")
    private String diskType;

    /*
     * A value indicating whether resync is required for this disk.
     */
    @JsonProperty(value = "resyncRequired")
    private Boolean resyncRequired;

    /*
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     */
    @JsonProperty(value = "monitoringPercentageCompletion")
    private Integer monitoringPercentageCompletion;

    /*
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     */
    @JsonProperty(value = "monitoringJobType")
    private String monitoringJobType;

    /*
     * The data pending for replication in MB at staging account.
     */
    @JsonProperty(value = "dataPendingInStagingStorageAccountInMB")
    private Double dataPendingInStagingStorageAccountInMB;

    /*
     * The data pending at source virtual machine in MB.
     */
    @JsonProperty(value = "dataPendingAtSourceAgentInMB")
    private Double dataPendingAtSourceAgentInMB;

    /*
     * The disk state.
     */
    @JsonProperty(value = "diskState")
    private String diskState;

    /*
     * The disk level operations list.
     */
    @JsonProperty(value = "allowedDiskLevelOperation")
    private List<String> allowedDiskLevelOperation;

    /*
     * A value indicating whether vm has encrypted os disk or not.
     */
    @JsonProperty(value = "isDiskEncrypted")
    private Boolean isDiskEncrypted;

    /*
     * The secret URL / identifier (BEK).
     */
    @JsonProperty(value = "secretIdentifier")
    private String secretIdentifier;

    /*
     * The KeyVault resource id for secret (BEK).
     */
    @JsonProperty(value = "dekKeyVaultArmId")
    private String dekKeyVaultArmId;

    /*
     * A value indicating whether disk key got encrypted or not.
     */
    @JsonProperty(value = "isDiskKeyEncrypted")
    private Boolean isDiskKeyEncrypted;

    /*
     * The key URL / identifier (KEK).
     */
    @JsonProperty(value = "keyIdentifier")
    private String keyIdentifier;

    /*
     * The KeyVault resource id for key (KEK).
     */
    @JsonProperty(value = "kekKeyVaultArmId")
    private String kekKeyVaultArmId;

    /*
     * The failover name for the managed disk.
     */
    @JsonProperty(value = "failoverDiskName")
    private String failoverDiskName;

    /*
     * The test failover name for the managed disk.
     */
    @JsonProperty(value = "tfoDiskName")
    private String tfoDiskName;

    /** Creates an instance of A2AProtectedDiskDetails class. */
    public A2AProtectedDiskDetails() {
    }

    /**
     * Get the diskUri property: The disk uri.
     *
     * @return the diskUri value.
     */
    public String diskUri() {
        return this.diskUri;
    }

    /**
     * Set the diskUri property: The disk uri.
     *
     * @param diskUri the diskUri value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskUri(String diskUri) {
        this.diskUri = diskUri;
        return this;
    }

    /**
     * Get the recoveryAzureStorageAccountId property: The recovery disk storage account.
     *
     * @return the recoveryAzureStorageAccountId value.
     */
    public String recoveryAzureStorageAccountId() {
        return this.recoveryAzureStorageAccountId;
    }

    /**
     * Set the recoveryAzureStorageAccountId property: The recovery disk storage account.
     *
     * @param recoveryAzureStorageAccountId the recoveryAzureStorageAccountId value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withRecoveryAzureStorageAccountId(String recoveryAzureStorageAccountId) {
        this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
        return this;
    }

    /**
     * Get the primaryDiskAzureStorageAccountId property: The primary disk storage account.
     *
     * @return the primaryDiskAzureStorageAccountId value.
     */
    public String primaryDiskAzureStorageAccountId() {
        return this.primaryDiskAzureStorageAccountId;
    }

    /**
     * Set the primaryDiskAzureStorageAccountId property: The primary disk storage account.
     *
     * @param primaryDiskAzureStorageAccountId the primaryDiskAzureStorageAccountId value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withPrimaryDiskAzureStorageAccountId(String primaryDiskAzureStorageAccountId) {
        this.primaryDiskAzureStorageAccountId = primaryDiskAzureStorageAccountId;
        return this;
    }

    /**
     * Get the recoveryDiskUri property: Recovery disk uri.
     *
     * @return the recoveryDiskUri value.
     */
    public String recoveryDiskUri() {
        return this.recoveryDiskUri;
    }

    /**
     * Set the recoveryDiskUri property: Recovery disk uri.
     *
     * @param recoveryDiskUri the recoveryDiskUri value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withRecoveryDiskUri(String recoveryDiskUri) {
        this.recoveryDiskUri = recoveryDiskUri;
        return this;
    }

    /**
     * Get the diskName property: The disk name.
     *
     * @return the diskName value.
     */
    public String diskName() {
        return this.diskName;
    }

    /**
     * Set the diskName property: The disk name.
     *
     * @param diskName the diskName value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * Get the diskCapacityInBytes property: The disk capacity in bytes.
     *
     * @return the diskCapacityInBytes value.
     */
    public Long diskCapacityInBytes() {
        return this.diskCapacityInBytes;
    }

    /**
     * Set the diskCapacityInBytes property: The disk capacity in bytes.
     *
     * @param diskCapacityInBytes the diskCapacityInBytes value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskCapacityInBytes(Long diskCapacityInBytes) {
        this.diskCapacityInBytes = diskCapacityInBytes;
        return this;
    }

    /**
     * Get the primaryStagingAzureStorageAccountId property: The primary staging storage account.
     *
     * @return the primaryStagingAzureStorageAccountId value.
     */
    public String primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId;
    }

    /**
     * Set the primaryStagingAzureStorageAccountId property: The primary staging storage account.
     *
     * @param primaryStagingAzureStorageAccountId the primaryStagingAzureStorageAccountId value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withPrimaryStagingAzureStorageAccountId(String primaryStagingAzureStorageAccountId) {
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        return this;
    }

    /**
     * Get the diskType property: The type of disk.
     *
     * @return the diskType value.
     */
    public String diskType() {
        return this.diskType;
    }

    /**
     * Set the diskType property: The type of disk.
     *
     * @param diskType the diskType value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * Get the resyncRequired property: A value indicating whether resync is required for this disk.
     *
     * @return the resyncRequired value.
     */
    public Boolean resyncRequired() {
        return this.resyncRequired;
    }

    /**
     * Set the resyncRequired property: A value indicating whether resync is required for this disk.
     *
     * @param resyncRequired the resyncRequired value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withResyncRequired(Boolean resyncRequired) {
        this.resyncRequired = resyncRequired;
        return this;
    }

    /**
     * Get the monitoringPercentageCompletion property: The percentage of the monitoring job. The type of the monitoring
     * job is defined by MonitoringJobType property.
     *
     * @return the monitoringPercentageCompletion value.
     */
    public Integer monitoringPercentageCompletion() {
        return this.monitoringPercentageCompletion;
    }

    /**
     * Set the monitoringPercentageCompletion property: The percentage of the monitoring job. The type of the monitoring
     * job is defined by MonitoringJobType property.
     *
     * @param monitoringPercentageCompletion the monitoringPercentageCompletion value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withMonitoringPercentageCompletion(Integer monitoringPercentageCompletion) {
        this.monitoringPercentageCompletion = monitoringPercentageCompletion;
        return this;
    }

    /**
     * Get the monitoringJobType property: The type of the monitoring job. The progress is contained in
     * MonitoringPercentageCompletion property.
     *
     * @return the monitoringJobType value.
     */
    public String monitoringJobType() {
        return this.monitoringJobType;
    }

    /**
     * Set the monitoringJobType property: The type of the monitoring job. The progress is contained in
     * MonitoringPercentageCompletion property.
     *
     * @param monitoringJobType the monitoringJobType value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withMonitoringJobType(String monitoringJobType) {
        this.monitoringJobType = monitoringJobType;
        return this;
    }

    /**
     * Get the dataPendingInStagingStorageAccountInMB property: The data pending for replication in MB at staging
     * account.
     *
     * @return the dataPendingInStagingStorageAccountInMB value.
     */
    public Double dataPendingInStagingStorageAccountInMB() {
        return this.dataPendingInStagingStorageAccountInMB;
    }

    /**
     * Set the dataPendingInStagingStorageAccountInMB property: The data pending for replication in MB at staging
     * account.
     *
     * @param dataPendingInStagingStorageAccountInMB the dataPendingInStagingStorageAccountInMB value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDataPendingInStagingStorageAccountInMB(
        Double dataPendingInStagingStorageAccountInMB) {
        this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
        return this;
    }

    /**
     * Get the dataPendingAtSourceAgentInMB property: The data pending at source virtual machine in MB.
     *
     * @return the dataPendingAtSourceAgentInMB value.
     */
    public Double dataPendingAtSourceAgentInMB() {
        return this.dataPendingAtSourceAgentInMB;
    }

    /**
     * Set the dataPendingAtSourceAgentInMB property: The data pending at source virtual machine in MB.
     *
     * @param dataPendingAtSourceAgentInMB the dataPendingAtSourceAgentInMB value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDataPendingAtSourceAgentInMB(Double dataPendingAtSourceAgentInMB) {
        this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
        return this;
    }

    /**
     * Get the diskState property: The disk state.
     *
     * @return the diskState value.
     */
    public String diskState() {
        return this.diskState;
    }

    /**
     * Set the diskState property: The disk state.
     *
     * @param diskState the diskState value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskState(String diskState) {
        this.diskState = diskState;
        return this;
    }

    /**
     * Get the allowedDiskLevelOperation property: The disk level operations list.
     *
     * @return the allowedDiskLevelOperation value.
     */
    public List<String> allowedDiskLevelOperation() {
        return this.allowedDiskLevelOperation;
    }

    /**
     * Set the allowedDiskLevelOperation property: The disk level operations list.
     *
     * @param allowedDiskLevelOperation the allowedDiskLevelOperation value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withAllowedDiskLevelOperation(List<String> allowedDiskLevelOperation) {
        this.allowedDiskLevelOperation = allowedDiskLevelOperation;
        return this;
    }

    /**
     * Get the isDiskEncrypted property: A value indicating whether vm has encrypted os disk or not.
     *
     * @return the isDiskEncrypted value.
     */
    public Boolean isDiskEncrypted() {
        return this.isDiskEncrypted;
    }

    /**
     * Set the isDiskEncrypted property: A value indicating whether vm has encrypted os disk or not.
     *
     * @param isDiskEncrypted the isDiskEncrypted value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withIsDiskEncrypted(Boolean isDiskEncrypted) {
        this.isDiskEncrypted = isDiskEncrypted;
        return this;
    }

    /**
     * Get the secretIdentifier property: The secret URL / identifier (BEK).
     *
     * @return the secretIdentifier value.
     */
    public String secretIdentifier() {
        return this.secretIdentifier;
    }

    /**
     * Set the secretIdentifier property: The secret URL / identifier (BEK).
     *
     * @param secretIdentifier the secretIdentifier value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withSecretIdentifier(String secretIdentifier) {
        this.secretIdentifier = secretIdentifier;
        return this;
    }

    /**
     * Get the dekKeyVaultArmId property: The KeyVault resource id for secret (BEK).
     *
     * @return the dekKeyVaultArmId value.
     */
    public String dekKeyVaultArmId() {
        return this.dekKeyVaultArmId;
    }

    /**
     * Set the dekKeyVaultArmId property: The KeyVault resource id for secret (BEK).
     *
     * @param dekKeyVaultArmId the dekKeyVaultArmId value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDekKeyVaultArmId(String dekKeyVaultArmId) {
        this.dekKeyVaultArmId = dekKeyVaultArmId;
        return this;
    }

    /**
     * Get the isDiskKeyEncrypted property: A value indicating whether disk key got encrypted or not.
     *
     * @return the isDiskKeyEncrypted value.
     */
    public Boolean isDiskKeyEncrypted() {
        return this.isDiskKeyEncrypted;
    }

    /**
     * Set the isDiskKeyEncrypted property: A value indicating whether disk key got encrypted or not.
     *
     * @param isDiskKeyEncrypted the isDiskKeyEncrypted value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withIsDiskKeyEncrypted(Boolean isDiskKeyEncrypted) {
        this.isDiskKeyEncrypted = isDiskKeyEncrypted;
        return this;
    }

    /**
     * Get the keyIdentifier property: The key URL / identifier (KEK).
     *
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: The key URL / identifier (KEK).
     *
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the kekKeyVaultArmId property: The KeyVault resource id for key (KEK).
     *
     * @return the kekKeyVaultArmId value.
     */
    public String kekKeyVaultArmId() {
        return this.kekKeyVaultArmId;
    }

    /**
     * Set the kekKeyVaultArmId property: The KeyVault resource id for key (KEK).
     *
     * @param kekKeyVaultArmId the kekKeyVaultArmId value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withKekKeyVaultArmId(String kekKeyVaultArmId) {
        this.kekKeyVaultArmId = kekKeyVaultArmId;
        return this;
    }

    /**
     * Get the failoverDiskName property: The failover name for the managed disk.
     *
     * @return the failoverDiskName value.
     */
    public String failoverDiskName() {
        return this.failoverDiskName;
    }

    /**
     * Set the failoverDiskName property: The failover name for the managed disk.
     *
     * @param failoverDiskName the failoverDiskName value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withFailoverDiskName(String failoverDiskName) {
        this.failoverDiskName = failoverDiskName;
        return this;
    }

    /**
     * Get the tfoDiskName property: The test failover name for the managed disk.
     *
     * @return the tfoDiskName value.
     */
    public String tfoDiskName() {
        return this.tfoDiskName;
    }

    /**
     * Set the tfoDiskName property: The test failover name for the managed disk.
     *
     * @param tfoDiskName the tfoDiskName value to set.
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withTfoDiskName(String tfoDiskName) {
        this.tfoDiskName = tfoDiskName;
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