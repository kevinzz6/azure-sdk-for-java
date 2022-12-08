// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointConnection;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"m\",\"subnetArmId\":\"wrjlvzkl\"},\"privateLinkServiceConnectionState\":{\"status\":\"Timeout\",\"description\":\"ikyjtkakvlb\",\"actionsRequired\":\"hjvpzaptu\"},\"provisioningState\":\"Deleting\"},\"identity\":{\"principalId\":\"ad37b336-1fa7-4cf9-a9fe-91774cd71a48\",\"tenantId\":\"5e50acdd-a680-428a-98a7-445ef67259fb\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"wfgcdiykkcxwn\",\"tags\":{\"qohhihra\":\"qynvavitmdm\",\"rhlhpvzadbwenni\":\"quddrwjclj\",\"viqlluk\":\"afhxrzfrmvztiuc\"},\"sku\":{\"name\":\"rcqxgcbvzarmqc\",\"tier\":\"Premium\",\"size\":\"stsinvag\",\"family\":\"jyhdrxb\",\"capacity\":1587779031},\"id\":\"ehqwhitxnmxgn\",\"name\":\"guzbuw\",\"type\":\"orbalkj\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateEndpointConnection> response =
            manager.privateEndpointConnections().list("ti", "zkaugpucdocfqpl", Context.NONE);

        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("wfgcdiykkcxwn", response.iterator().next().location());
        Assertions.assertEquals("qynvavitmdm", response.iterator().next().tags().get("qohhihra"));
        Assertions.assertEquals("rcqxgcbvzarmqc", response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.iterator().next().sku().tier());
        Assertions.assertEquals("stsinvag", response.iterator().next().sku().size());
        Assertions.assertEquals("jyhdrxb", response.iterator().next().sku().family());
        Assertions.assertEquals(1587779031, response.iterator().next().sku().capacity());
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.TIMEOUT,
                response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions
            .assertEquals("ikyjtkakvlb", response.iterator().next().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals(
                "hjvpzaptu", response.iterator().next().privateLinkServiceConnectionState().actionsRequired());
    }
}