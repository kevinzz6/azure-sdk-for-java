// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.JavaComponent;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JavaComponentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"componentType\":\"JavaComponentProperties\",\"provisioningState\":\"Deleting\",\"configurations\":[{\"propertyName\":\"joxtdahne\",\"value\":\"ovt\"},{\"propertyName\":\"ztivfwjl\",\"value\":\"zekfsrmauklajv\"}],\"scale\":{\"minReplicas\":630907604,\"maxReplicas\":1874917407},\"serviceBinds\":[{\"name\":\"jovtkwxnhwhhn\",\"serviceId\":\"rzaaoee\"},{\"name\":\"mjenvjeatea\",\"serviceId\":\"crxoxdj\"}]},\"id\":\"dnaryyinzk\",\"name\":\"olrndwdb\",\"type\":\"xvzaledoy\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        JavaComponent response = manager.javaComponents()
            .getWithResponse("soy", "yxyj", "cbqp", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("joxtdahne", response.properties().configurations().get(0).propertyName());
        Assertions.assertEquals("ovt", response.properties().configurations().get(0).value());
        Assertions.assertEquals(630907604, response.properties().scale().minReplicas());
        Assertions.assertEquals(1874917407, response.properties().scale().maxReplicas());
        Assertions.assertEquals("jovtkwxnhwhhn", response.properties().serviceBinds().get(0).name());
        Assertions.assertEquals("rzaaoee", response.properties().serviceBinds().get(0).serviceId());
    }
}
