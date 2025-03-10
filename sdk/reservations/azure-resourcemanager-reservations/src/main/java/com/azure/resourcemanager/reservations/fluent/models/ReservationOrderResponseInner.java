// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.reservations.models.ProvisioningState;
import com.azure.resourcemanager.reservations.models.ReservationBillingPlan;
import com.azure.resourcemanager.reservations.models.ReservationOrderBillingPlanInformation;
import com.azure.resourcemanager.reservations.models.ReservationTerm;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Details of a reservation order being returned.
 */
@Fluent
public final class ReservationOrderResponseInner extends ProxyResource {
    /*
     * The etag property.
     */
    private Integer etag;

    /*
     * Properties of a reservation order.
     */
    private ReservationOrderProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ReservationOrderResponseInner class.
     */
    public ReservationOrderResponseInner() {
    }

    /**
     * Get the etag property: The etag property.
     * 
     * @return the etag value.
     */
    public Integer etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag property.
     * 
     * @param etag the etag value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withEtag(Integer etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of a reservation order.
     * 
     * @return the innerProperties value.
     */
    private ReservationOrderProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the displayName property: Friendly name for user to easily identified the reservation.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Friendly name for user to easily identified the reservation.
     * 
     * @param displayName the displayName value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the requestDateTime property: This is the DateTime when the reservation was initially requested for purchase.
     * 
     * @return the requestDateTime value.
     */
    public OffsetDateTime requestDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().requestDateTime();
    }

    /**
     * Set the requestDateTime property: This is the DateTime when the reservation was initially requested for purchase.
     * 
     * @param requestDateTime the requestDateTime value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withRequestDateTime(OffsetDateTime requestDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withRequestDateTime(requestDateTime);
        return this;
    }

    /**
     * Get the createdDateTime property: This is the DateTime when the reservation was created.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateTime();
    }

    /**
     * Set the createdDateTime property: This is the DateTime when the reservation was created.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withCreatedDateTime(OffsetDateTime createdDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * Get the expiryDate property: This is the date when the reservation will expire.
     * 
     * @return the expiryDate value.
     */
    public LocalDate expiryDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expiryDate();
    }

    /**
     * Set the expiryDate property: This is the date when the reservation will expire.
     * 
     * @param expiryDate the expiryDate value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withExpiryDate(LocalDate expiryDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withExpiryDate(expiryDate);
        return this;
    }

    /**
     * Get the expiryDateTime property: This is the date-time when the reservation will expire.
     * 
     * @return the expiryDateTime value.
     */
    public OffsetDateTime expiryDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expiryDateTime();
    }

    /**
     * Set the expiryDateTime property: This is the date-time when the reservation will expire.
     * 
     * @param expiryDateTime the expiryDateTime value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withExpiryDateTime(OffsetDateTime expiryDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withExpiryDateTime(expiryDateTime);
        return this;
    }

    /**
     * Get the benefitStartTime property: This is the DateTime when the reservation benefit started.
     * 
     * @return the benefitStartTime value.
     */
    public OffsetDateTime benefitStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().benefitStartTime();
    }

    /**
     * Set the benefitStartTime property: This is the DateTime when the reservation benefit started.
     * 
     * @param benefitStartTime the benefitStartTime value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withBenefitStartTime(OffsetDateTime benefitStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withBenefitStartTime(benefitStartTime);
        return this;
    }

    /**
     * Get the originalQuantity property: Total Quantity of the skus purchased in the reservation.
     * 
     * @return the originalQuantity value.
     */
    public Integer originalQuantity() {
        return this.innerProperties() == null ? null : this.innerProperties().originalQuantity();
    }

    /**
     * Set the originalQuantity property: Total Quantity of the skus purchased in the reservation.
     * 
     * @param originalQuantity the originalQuantity value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withOriginalQuantity(Integer originalQuantity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withOriginalQuantity(originalQuantity);
        return this;
    }

    /**
     * Get the term property: Represent the term of reservation.
     * 
     * @return the term value.
     */
    public ReservationTerm term() {
        return this.innerProperties() == null ? null : this.innerProperties().term();
    }

    /**
     * Set the term property: Represent the term of reservation.
     * 
     * @param term the term value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withTerm(ReservationTerm term) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withTerm(term);
        return this;
    }

    /**
     * Get the provisioningState property: Current state of the reservation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Current state of the reservation.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withProvisioningState(ProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the billingPlan property: Represent the billing plans.
     * 
     * @return the billingPlan value.
     */
    public ReservationBillingPlan billingPlan() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPlan();
    }

    /**
     * Set the billingPlan property: Represent the billing plans.
     * 
     * @param billingPlan the billingPlan value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withBillingPlan(ReservationBillingPlan billingPlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withBillingPlan(billingPlan);
        return this;
    }

    /**
     * Get the planInformation property: Information describing the type of billing plan for this reservation.
     * 
     * @return the planInformation value.
     */
    public ReservationOrderBillingPlanInformation planInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().planInformation();
    }

    /**
     * Set the planInformation property: Information describing the type of billing plan for this reservation.
     * 
     * @param planInformation the planInformation value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withPlanInformation(ReservationOrderBillingPlanInformation planInformation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withPlanInformation(planInformation);
        return this;
    }

    /**
     * Get the reservations property: The reservations property.
     * 
     * @return the reservations value.
     */
    public List<ReservationResponseInner> reservations() {
        return this.innerProperties() == null ? null : this.innerProperties().reservations();
    }

    /**
     * Set the reservations property: The reservations property.
     * 
     * @param reservations the reservations value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withReservations(List<ReservationResponseInner> reservations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withReservations(reservations);
        return this;
    }

    /**
     * Get the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     * 
     * @return the reviewDateTime value.
     */
    public OffsetDateTime reviewDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().reviewDateTime();
    }

    /**
     * Set the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     * 
     * @param reviewDateTime the reviewDateTime value to set.
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withReviewDateTime(OffsetDateTime reviewDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderProperties();
        }
        this.innerProperties().withReviewDateTime(reviewDateTime);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("etag", this.etag);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReservationOrderResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReservationOrderResponseInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ReservationOrderResponseInner.
     */
    public static ReservationOrderResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReservationOrderResponseInner deserializedReservationOrderResponseInner
                = new ReservationOrderResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedReservationOrderResponseInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedReservationOrderResponseInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedReservationOrderResponseInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedReservationOrderResponseInner.etag = reader.getNullable(JsonReader::getInt);
                } else if ("properties".equals(fieldName)) {
                    deserializedReservationOrderResponseInner.innerProperties
                        = ReservationOrderProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedReservationOrderResponseInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReservationOrderResponseInner;
        });
    }
}
