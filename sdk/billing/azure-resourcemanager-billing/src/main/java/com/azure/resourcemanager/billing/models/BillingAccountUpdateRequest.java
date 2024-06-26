// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billing.fluent.models.BillingAccountProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request properties of the billing account that can be updated. */
@Fluent
public final class BillingAccountUpdateRequest {
    /*
     * A billing property.
     */
    @JsonProperty(value = "properties")
    private BillingAccountProperties innerProperties;

    /** Creates an instance of BillingAccountUpdateRequest class. */
    public BillingAccountUpdateRequest() {
    }

    /**
     * Get the innerProperties property: A billing property.
     *
     * @return the innerProperties value.
     */
    private BillingAccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: The billing account name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The billing account name.
     *
     * @param displayName the displayName value to set.
     * @return the BillingAccountUpdateRequest object itself.
     */
    public BillingAccountUpdateRequest withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingAccountProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the soldTo property: The address of the individual or organization that is responsible for the billing
     * account.
     *
     * @return the soldTo value.
     */
    public AddressDetails soldTo() {
        return this.innerProperties() == null ? null : this.innerProperties().soldTo();
    }

    /**
     * Set the soldTo property: The address of the individual or organization that is responsible for the billing
     * account.
     *
     * @param soldTo the soldTo value to set.
     * @return the BillingAccountUpdateRequest object itself.
     */
    public BillingAccountUpdateRequest withSoldTo(AddressDetails soldTo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingAccountProperties();
        }
        this.innerProperties().withSoldTo(soldTo);
        return this;
    }

    /**
     * Get the agreementType property: The type of agreement.
     *
     * @return the agreementType value.
     */
    public AgreementType agreementType() {
        return this.innerProperties() == null ? null : this.innerProperties().agreementType();
    }

    /**
     * Get the accountType property: The type of customer.
     *
     * @return the accountType value.
     */
    public AccountType accountType() {
        return this.innerProperties() == null ? null : this.innerProperties().accountType();
    }

    /**
     * Get the accountStatus property: The current status of the billing account.
     *
     * @return the accountStatus value.
     */
    public AccountStatus accountStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().accountStatus();
    }

    /**
     * Get the billingProfiles property: The billing profiles associated with the billing account. By default this is
     * not populated, unless it's specified in $expand.
     *
     * @return the billingProfiles value.
     */
    public BillingProfilesOnExpand billingProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfiles();
    }

    /**
     * Set the billingProfiles property: The billing profiles associated with the billing account. By default this is
     * not populated, unless it's specified in $expand.
     *
     * @param billingProfiles the billingProfiles value to set.
     * @return the BillingAccountUpdateRequest object itself.
     */
    public BillingAccountUpdateRequest withBillingProfiles(BillingProfilesOnExpand billingProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingAccountProperties();
        }
        this.innerProperties().withBillingProfiles(billingProfiles);
        return this;
    }

    /**
     * Get the enrollmentDetails property: The details about the associated legacy enrollment. By default this is not
     * populated, unless it's specified in $expand.
     *
     * @return the enrollmentDetails value.
     */
    public Enrollment enrollmentDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().enrollmentDetails();
    }

    /**
     * Get the departments property: The departments associated to the enrollment.
     *
     * @return the departments value.
     */
    public List<Department> departments() {
        return this.innerProperties() == null ? null : this.innerProperties().departments();
    }

    /**
     * Set the departments property: The departments associated to the enrollment.
     *
     * @param departments the departments value to set.
     * @return the BillingAccountUpdateRequest object itself.
     */
    public BillingAccountUpdateRequest withDepartments(List<Department> departments) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingAccountProperties();
        }
        this.innerProperties().withDepartments(departments);
        return this;
    }

    /**
     * Get the enrollmentAccounts property: The accounts associated to the enrollment.
     *
     * @return the enrollmentAccounts value.
     */
    public List<EnrollmentAccount> enrollmentAccounts() {
        return this.innerProperties() == null ? null : this.innerProperties().enrollmentAccounts();
    }

    /**
     * Set the enrollmentAccounts property: The accounts associated to the enrollment.
     *
     * @param enrollmentAccounts the enrollmentAccounts value to set.
     * @return the BillingAccountUpdateRequest object itself.
     */
    public BillingAccountUpdateRequest withEnrollmentAccounts(List<EnrollmentAccount> enrollmentAccounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingAccountProperties();
        }
        this.innerProperties().withEnrollmentAccounts(enrollmentAccounts);
        return this;
    }

    /**
     * Get the hasReadAccess property: Indicates whether user has read access to the billing account.
     *
     * @return the hasReadAccess value.
     */
    public Boolean hasReadAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().hasReadAccess();
    }

    /**
     * Get the notificationEmailAddress property: Notification email address, only for legacy accounts.
     *
     * @return the notificationEmailAddress value.
     */
    public String notificationEmailAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().notificationEmailAddress();
    }

    /**
     * Set the notificationEmailAddress property: Notification email address, only for legacy accounts.
     *
     * @param notificationEmailAddress the notificationEmailAddress value to set.
     * @return the BillingAccountUpdateRequest object itself.
     */
    public BillingAccountUpdateRequest withNotificationEmailAddress(String notificationEmailAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingAccountProperties();
        }
        this.innerProperties().withNotificationEmailAddress(notificationEmailAddress);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
