// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the virtual network resource.
 */
@Fluent
public final class VirtualNetworkProperties implements JsonSerializable<VirtualNetworkProperties> {
    /*
     * The infraVnetProfile property.
     */
    private VirtualNetworkPropertiesInfraVnetProfile infraVnetProfile;

    /*
     * Range of IP Addresses for Kubernetes API Server and services if using HA Proxy load balancer
     */
    private List<VirtualNetworkPropertiesVipPoolItem> vipPool;

    /*
     * Range of IP Addresses for Kubernetes node VMs
     */
    private List<VirtualNetworkPropertiesVmipPoolItem> vmipPool;

    /*
     * List of DNS server IP Addresses associated with the network
     */
    private List<String> dnsServers;

    /*
     * IP Address of the Gateway associated with the network
     */
    private String gateway;

    /*
     * IP Address Prefix of the network
     */
    private String ipAddressPrefix;

    /*
     * VLAN Id used by the network
     */
    private Integer vlanId;

    /*
     * The provisioningState property.
     */
    private ProvisioningState provisioningState;

    /*
     * Status of the virtual network resource
     */
    private VirtualNetworkPropertiesStatus status;

    /**
     * Creates an instance of VirtualNetworkProperties class.
     */
    public VirtualNetworkProperties() {
    }

    /**
     * Get the infraVnetProfile property: The infraVnetProfile property.
     * 
     * @return the infraVnetProfile value.
     */
    public VirtualNetworkPropertiesInfraVnetProfile infraVnetProfile() {
        return this.infraVnetProfile;
    }

    /**
     * Set the infraVnetProfile property: The infraVnetProfile property.
     * 
     * @param infraVnetProfile the infraVnetProfile value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withInfraVnetProfile(VirtualNetworkPropertiesInfraVnetProfile infraVnetProfile) {
        this.infraVnetProfile = infraVnetProfile;
        return this;
    }

    /**
     * Get the vipPool property: Range of IP Addresses for Kubernetes API Server and services if using HA Proxy load
     * balancer.
     * 
     * @return the vipPool value.
     */
    public List<VirtualNetworkPropertiesVipPoolItem> vipPool() {
        return this.vipPool;
    }

    /**
     * Set the vipPool property: Range of IP Addresses for Kubernetes API Server and services if using HA Proxy load
     * balancer.
     * 
     * @param vipPool the vipPool value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withVipPool(List<VirtualNetworkPropertiesVipPoolItem> vipPool) {
        this.vipPool = vipPool;
        return this;
    }

    /**
     * Get the vmipPool property: Range of IP Addresses for Kubernetes node VMs.
     * 
     * @return the vmipPool value.
     */
    public List<VirtualNetworkPropertiesVmipPoolItem> vmipPool() {
        return this.vmipPool;
    }

    /**
     * Set the vmipPool property: Range of IP Addresses for Kubernetes node VMs.
     * 
     * @param vmipPool the vmipPool value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withVmipPool(List<VirtualNetworkPropertiesVmipPoolItem> vmipPool) {
        this.vmipPool = vmipPool;
        return this;
    }

    /**
     * Get the dnsServers property: List of DNS server IP Addresses associated with the network.
     * 
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: List of DNS server IP Addresses associated with the network.
     * 
     * @param dnsServers the dnsServers value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the gateway property: IP Address of the Gateway associated with the network.
     * 
     * @return the gateway value.
     */
    public String gateway() {
        return this.gateway;
    }

    /**
     * Set the gateway property: IP Address of the Gateway associated with the network.
     * 
     * @param gateway the gateway value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Get the ipAddressPrefix property: IP Address Prefix of the network.
     * 
     * @return the ipAddressPrefix value.
     */
    public String ipAddressPrefix() {
        return this.ipAddressPrefix;
    }

    /**
     * Set the ipAddressPrefix property: IP Address Prefix of the network.
     * 
     * @param ipAddressPrefix the ipAddressPrefix value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withIpAddressPrefix(String ipAddressPrefix) {
        this.ipAddressPrefix = ipAddressPrefix;
        return this;
    }

    /**
     * Get the vlanId property: VLAN Id used by the network.
     * 
     * @return the vlanId value.
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: VLAN Id used by the network.
     * 
     * @param vlanId the vlanId value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Status of the virtual network resource.
     * 
     * @return the status value.
     */
    public VirtualNetworkPropertiesStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (infraVnetProfile() != null) {
            infraVnetProfile().validate();
        }
        if (vipPool() != null) {
            vipPool().forEach(e -> e.validate());
        }
        if (vmipPool() != null) {
            vmipPool().forEach(e -> e.validate());
        }
        if (status() != null) {
            status().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("infraVnetProfile", this.infraVnetProfile);
        jsonWriter.writeArrayField("vipPool", this.vipPool, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("vmipPool", this.vmipPool, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("dnsServers", this.dnsServers, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("gateway", this.gateway);
        jsonWriter.writeStringField("ipAddressPrefix", this.ipAddressPrefix);
        jsonWriter.writeNumberField("vlanID", this.vlanId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualNetworkProperties.
     */
    public static VirtualNetworkProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkProperties deserializedVirtualNetworkProperties = new VirtualNetworkProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("infraVnetProfile".equals(fieldName)) {
                    deserializedVirtualNetworkProperties.infraVnetProfile
                        = VirtualNetworkPropertiesInfraVnetProfile.fromJson(reader);
                } else if ("vipPool".equals(fieldName)) {
                    List<VirtualNetworkPropertiesVipPoolItem> vipPool
                        = reader.readArray(reader1 -> VirtualNetworkPropertiesVipPoolItem.fromJson(reader1));
                    deserializedVirtualNetworkProperties.vipPool = vipPool;
                } else if ("vmipPool".equals(fieldName)) {
                    List<VirtualNetworkPropertiesVmipPoolItem> vmipPool
                        = reader.readArray(reader1 -> VirtualNetworkPropertiesVmipPoolItem.fromJson(reader1));
                    deserializedVirtualNetworkProperties.vmipPool = vmipPool;
                } else if ("dnsServers".equals(fieldName)) {
                    List<String> dnsServers = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualNetworkProperties.dnsServers = dnsServers;
                } else if ("gateway".equals(fieldName)) {
                    deserializedVirtualNetworkProperties.gateway = reader.getString();
                } else if ("ipAddressPrefix".equals(fieldName)) {
                    deserializedVirtualNetworkProperties.ipAddressPrefix = reader.getString();
                } else if ("vlanID".equals(fieldName)) {
                    deserializedVirtualNetworkProperties.vlanId = reader.getNullable(JsonReader::getInt);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVirtualNetworkProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedVirtualNetworkProperties.status = VirtualNetworkPropertiesStatus.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkProperties;
        });
    }
}
