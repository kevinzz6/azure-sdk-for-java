// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * A file in an HTTP web server.
 */
@Fluent
public class HttpDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "HttpFile";

    /*
     * The relative URL based on the URL in the HttpLinkedService refers to an HTTP file Type: string (or Expression
     * with resultType string).
     */
    private Object relativeUrl;

    /*
     * The HTTP method for the HTTP request. Type: string (or Expression with resultType string).
     */
    private Object requestMethod;

    /*
     * The body for the HTTP request. Type: string (or Expression with resultType string).
     */
    private Object requestBody;

    /*
     * The headers for the HTTP Request. e.g. request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     */
    private Object additionalHeaders;

    /*
     * The format of files.
     */
    private DatasetStorageFormat format;

    /*
     * The data compression method used on files.
     */
    private DatasetCompression compression;

    /**
     * Creates an instance of HttpDataset class.
     */
    public HttpDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the relativeUrl property: The relative URL based on the URL in the HttpLinkedService refers to an HTTP file
     * Type: string (or Expression with resultType string).
     * 
     * @return the relativeUrl value.
     */
    public Object getRelativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relativeUrl property: The relative URL based on the URL in the HttpLinkedService refers to an HTTP file
     * Type: string (or Expression with resultType string).
     * 
     * @param relativeUrl the relativeUrl value to set.
     * @return the HttpDataset object itself.
     */
    public HttpDataset setRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /**
     * Get the requestMethod property: The HTTP method for the HTTP request. Type: string (or Expression with resultType
     * string).
     * 
     * @return the requestMethod value.
     */
    public Object getRequestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method for the HTTP request. Type: string (or Expression with resultType
     * string).
     * 
     * @param requestMethod the requestMethod value to set.
     * @return the HttpDataset object itself.
     */
    public HttpDataset setRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the requestBody property: The body for the HTTP request. Type: string (or Expression with resultType string).
     * 
     * @return the requestBody value.
     */
    public Object getRequestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: The body for the HTTP request. Type: string (or Expression with resultType string).
     * 
     * @param requestBody the requestBody value to set.
     * @return the HttpDataset object itself.
     */
    public HttpDataset setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additionalHeaders property: The headers for the HTTP Request. e.g.
     * request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     * 
     * @return the additionalHeaders value.
     */
    public Object getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The headers for the HTTP Request. e.g.
     * request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     * 
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the HttpDataset object itself.
     */
    public HttpDataset setAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the format property: The format of files.
     * 
     * @return the format value.
     */
    public DatasetStorageFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: The format of files.
     * 
     * @param format the format value to set.
     * @return the HttpDataset object itself.
     */
    public HttpDataset setFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used on files.
     * 
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used on files.
     * 
     * @param compression the compression value to set.
     * @return the HttpDataset object itself.
     */
    public HttpDataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", getLinkedServiceName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeUntypedField("structure", getStructure());
        jsonWriter.writeUntypedField("schema", getSchema());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", getFolder());
        jsonWriter.writeStringField("type", this.type);
        if (relativeUrl != null
            || requestMethod != null
            || requestBody != null
            || additionalHeaders != null
            || format != null
            || compression != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("relativeUrl", this.relativeUrl);
            jsonWriter.writeUntypedField("requestMethod", this.requestMethod);
            jsonWriter.writeUntypedField("requestBody", this.requestBody);
            jsonWriter.writeUntypedField("additionalHeaders", this.additionalHeaders);
            jsonWriter.writeJsonField("format", this.format);
            jsonWriter.writeJsonField("compression", this.compression);
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HttpDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HttpDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HttpDataset.
     */
    public static HttpDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HttpDataset deserializedHttpDataset = new HttpDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedHttpDataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedHttpDataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedHttpDataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedHttpDataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedHttpDataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedHttpDataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedHttpDataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedHttpDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("relativeUrl".equals(fieldName)) {
                            deserializedHttpDataset.relativeUrl = reader.readUntyped();
                        } else if ("requestMethod".equals(fieldName)) {
                            deserializedHttpDataset.requestMethod = reader.readUntyped();
                        } else if ("requestBody".equals(fieldName)) {
                            deserializedHttpDataset.requestBody = reader.readUntyped();
                        } else if ("additionalHeaders".equals(fieldName)) {
                            deserializedHttpDataset.additionalHeaders = reader.readUntyped();
                        } else if ("format".equals(fieldName)) {
                            deserializedHttpDataset.format = DatasetStorageFormat.fromJson(reader);
                        } else if ("compression".equals(fieldName)) {
                            deserializedHttpDataset.compression = DatasetCompression.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedHttpDataset.setAdditionalProperties(additionalProperties);

            return deserializedHttpDataset;
        });
    }
}
