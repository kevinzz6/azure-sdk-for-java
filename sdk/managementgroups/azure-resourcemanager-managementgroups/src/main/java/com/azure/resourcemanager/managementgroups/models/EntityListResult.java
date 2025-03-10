// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.managementgroups.fluent.models.EntityInfoInner;
import java.io.IOException;
import java.util.List;

/**
 * Describes the result of the request to view entities.
 */
@Fluent
public final class EntityListResult implements JsonSerializable<EntityListResult> {
    /*
     * The list of entities.
     */
    private List<EntityInfoInner> value;

    /*
     * Total count of records that match the filter
     */
    private Integer count;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of EntityListResult class.
     */
    public EntityListResult() {
    }

    /**
     * Get the value property: The list of entities.
     * 
     * @return the value value.
     */
    public List<EntityInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of entities.
     * 
     * @param value the value value to set.
     * @return the EntityListResult object itself.
     */
    public EntityListResult withValue(List<EntityInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total count of records that match the filter.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EntityListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EntityListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EntityListResult.
     */
    public static EntityListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EntityListResult deserializedEntityListResult = new EntityListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<EntityInfoInner> value = reader.readArray(reader1 -> EntityInfoInner.fromJson(reader1));
                    deserializedEntityListResult.value = value;
                } else if ("count".equals(fieldName)) {
                    deserializedEntityListResult.count = reader.getNullable(JsonReader::getInt);
                } else if ("nextLink".equals(fieldName)) {
                    deserializedEntityListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEntityListResult;
        });
    }
}
