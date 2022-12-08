// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.LicenseType;
import com.azure.resourcemanager.devcenter.models.LocalAdminStatus;
import com.azure.resourcemanager.devcenter.models.Pool;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PoolsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"TransientFailure\",\"devBoxDefinitionName\":\"ihsasb\",\"networkConnectionName\":\"dyp\",\"licenseType\":\"Windows_Client\",\"localAdministrator\":\"Enabled\"},\"location\":\"slynsqyrpfoo\",\"tags\":{\"qdnfwqzdz\":\"ttymsjny\",\"fhqlyvi\":\"tilaxh\"},\"id\":\"ouwivkxoyzunbixx\",\"name\":\"ti\",\"type\":\"vcpwpgclrc\"}";

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

        DevCenterManager manager =
            DevCenterManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Pool response = manager.pools().getWithResponse("hhzjhfj", "hvvmuvgpmun", "qsxvmhf", Context.NONE).getValue();

        Assertions.assertEquals("slynsqyrpfoo", response.location());
        Assertions.assertEquals("ttymsjny", response.tags().get("qdnfwqzdz"));
        Assertions.assertEquals("ihsasb", response.devBoxDefinitionName());
        Assertions.assertEquals("dyp", response.networkConnectionName());
        Assertions.assertEquals(LicenseType.WINDOWS_CLIENT, response.licenseType());
        Assertions.assertEquals(LocalAdminStatus.ENABLED, response.localAdministrator());
    }
}