// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager;
import com.azure.resourcemanager.appcomplianceautomation.models.SnapshotResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SnapshotOperationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"id\":\"ixhnrztf\",\"snapshotName\":\"hb\",\"createdAt\":\"2021-09-08T07:53:31Z\",\"provisioningState\":\"Creating\",\"reportProperties\":{\"id\":\"ulppggdtpnapnyir\",\"status\":\"Disabled\",\"tenantId\":\"pigvpgylgqgitx\",\"reportName\":\"djvcsl\",\"offerGuid\":\"qwwncw\",\"timeZone\":\"zhxgktrmgucn\",\"triggerTime\":\"2021-01-11T08:35:46Z\",\"nextTriggerTime\":\"2021-09-22T11:03:56Z\",\"lastTriggerTime\":\"2021-10-09T08:24:24Z\",\"subscriptions\":[],\"resources\":[],\"provisioningState\":\"Failed\"},\"complianceResults\":[]},\"id\":\"ygpfqb\",\"name\":\"ac\",\"type\":\"op\"}";

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

        AppComplianceAutomationManager manager =
            AppComplianceAutomationManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SnapshotResource response =
            manager.snapshotOperations().getWithResponse("oyaqcslyjpkiid", "yexz", Context.NONE).getValue();
    }
}