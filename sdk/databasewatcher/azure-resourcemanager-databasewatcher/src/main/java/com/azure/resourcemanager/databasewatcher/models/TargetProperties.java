// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.databasewatcher.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The generic properties of a target.
 */
@Fluent
public class TargetProperties implements JsonSerializable<TargetProperties> {
    /*
     * Discriminator property for TargetProperties.
     */
    private String targetType = "TargetProperties";

    /*
     * The type of authentication to use when connecting to a target.
     */
    private TargetAuthenticationType targetAuthenticationType;

    /*
     * To use SQL authentication when connecting to targets, specify the vault where the login name and password secrets
     * are stored.
     */
    private VaultSecret targetVault;

    /*
     * The FQDN host name of the server to use in the connection string when connecting to a target. For example, for an
     * Azure SQL logical server in the Azure commercial cloud, the value might be
     * 'sql-logical-server-22092780.database.windows.net'; for an Azure SQL managed instance in the Azure commercial
     * cloud, the value might be 'sql-mi-39441134.767d5869f605.database.windows.net'. Port number and instance name must
     * be specified separately.
     */
    private String connectionServerName;

    /*
     * The provisioning state of the resource.
     */
    private ResourceProvisioningState provisioningState;

    /**
     * Creates an instance of TargetProperties class.
     */
    public TargetProperties() {
    }

    /**
     * Get the targetType property: Discriminator property for TargetProperties.
     * 
     * @return the targetType value.
     */
    public String targetType() {
        return this.targetType;
    }

    /**
     * Get the targetAuthenticationType property: The type of authentication to use when connecting to a target.
     * 
     * @return the targetAuthenticationType value.
     */
    public TargetAuthenticationType targetAuthenticationType() {
        return this.targetAuthenticationType;
    }

    /**
     * Set the targetAuthenticationType property: The type of authentication to use when connecting to a target.
     * 
     * @param targetAuthenticationType the targetAuthenticationType value to set.
     * @return the TargetProperties object itself.
     */
    public TargetProperties withTargetAuthenticationType(TargetAuthenticationType targetAuthenticationType) {
        this.targetAuthenticationType = targetAuthenticationType;
        return this;
    }

    /**
     * Get the targetVault property: To use SQL authentication when connecting to targets, specify the vault where the
     * login name and password secrets are stored.
     * 
     * @return the targetVault value.
     */
    public VaultSecret targetVault() {
        return this.targetVault;
    }

    /**
     * Set the targetVault property: To use SQL authentication when connecting to targets, specify the vault where the
     * login name and password secrets are stored.
     * 
     * @param targetVault the targetVault value to set.
     * @return the TargetProperties object itself.
     */
    public TargetProperties withTargetVault(VaultSecret targetVault) {
        this.targetVault = targetVault;
        return this;
    }

    /**
     * Get the connectionServerName property: The FQDN host name of the server to use in the connection string when
     * connecting to a target. For example, for an Azure SQL logical server in the Azure commercial cloud, the value
     * might be 'sql-logical-server-22092780.database.windows.net'; for an Azure SQL managed instance in the Azure
     * commercial cloud, the value might be 'sql-mi-39441134.767d5869f605.database.windows.net'. Port number and
     * instance name must be specified separately.
     * 
     * @return the connectionServerName value.
     */
    public String connectionServerName() {
        return this.connectionServerName;
    }

    /**
     * Set the connectionServerName property: The FQDN host name of the server to use in the connection string when
     * connecting to a target. For example, for an Azure SQL logical server in the Azure commercial cloud, the value
     * might be 'sql-logical-server-22092780.database.windows.net'; for an Azure SQL managed instance in the Azure
     * commercial cloud, the value might be 'sql-mi-39441134.767d5869f605.database.windows.net'. Port number and
     * instance name must be specified separately.
     * 
     * @param connectionServerName the connectionServerName value to set.
     * @return the TargetProperties object itself.
     */
    public TargetProperties withConnectionServerName(String connectionServerName) {
        this.connectionServerName = connectionServerName;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the TargetProperties object itself.
     */
    TargetProperties withProvisioningState(ResourceProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetAuthenticationType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetAuthenticationType in model TargetProperties"));
        }
        if (targetVault() != null) {
            targetVault().validate();
        }
        if (connectionServerName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property connectionServerName in model TargetProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TargetProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetAuthenticationType",
            this.targetAuthenticationType == null ? null : this.targetAuthenticationType.toString());
        jsonWriter.writeStringField("connectionServerName", this.connectionServerName);
        jsonWriter.writeStringField("targetType", this.targetType);
        jsonWriter.writeJsonField("targetVault", this.targetVault);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TargetProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TargetProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TargetProperties.
     */
    public static TargetProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("targetType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("SqlDb".equals(discriminatorValue)) {
                    return SqlDbSingleDatabaseTargetProperties.fromJson(readerToUse.reset());
                } else if ("SqlEp".equals(discriminatorValue)) {
                    return SqlDbElasticPoolTargetProperties.fromJson(readerToUse.reset());
                } else if ("SqlMi".equals(discriminatorValue)) {
                    return SqlMiTargetProperties.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static TargetProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TargetProperties deserializedTargetProperties = new TargetProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetAuthenticationType".equals(fieldName)) {
                    deserializedTargetProperties.targetAuthenticationType
                        = TargetAuthenticationType.fromString(reader.getString());
                } else if ("connectionServerName".equals(fieldName)) {
                    deserializedTargetProperties.connectionServerName = reader.getString();
                } else if ("targetType".equals(fieldName)) {
                    deserializedTargetProperties.targetType = reader.getString();
                } else if ("targetVault".equals(fieldName)) {
                    deserializedTargetProperties.targetVault = VaultSecret.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedTargetProperties.provisioningState
                        = ResourceProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTargetProperties;
        });
    }
}
