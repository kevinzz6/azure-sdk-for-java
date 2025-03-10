// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeMonitoringData;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimesGetMonitoringDataWithResponseMockTests {
    @Test
    public void testGetMonitoringDataWithResponse() throws Exception {
        String responseStr
            = "{\"name\":\"pkskbidmzzjp\",\"nodes\":[{\"nodeName\":\"esbteqfenhli\",\"availableMemoryInMB\":346827501,\"cpuUtilization\":981268010,\"concurrentJobsLimit\":855967901,\"concurrentJobsRunning\":1611200927,\"maxConcurrentJobs\":2069802386,\"sentBytes\":88.11751,\"receivedBytes\":6.6926837,\"\":{\"rjkinofwzci\":\"datadhxamjhpqfjpef\",\"qesyifdrbkprblw\":\"datal\",\"qqts\":\"databjse\"}},{\"nodeName\":\"pogtrwkuwna\",\"availableMemoryInMB\":560037150,\"cpuUtilization\":692226376,\"concurrentJobsLimit\":34678653,\"concurrentJobsRunning\":1020953911,\"maxConcurrentJobs\":142241566,\"sentBytes\":79.9216,\"receivedBytes\":71.34564,\"\":{\"tsgovnr\":\"dataovgipq\",\"tcrxcnuyfvri\":\"datayb\",\"onnvay\":\"datazqoi\"}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IntegrationRuntimeMonitoringData response = manager.integrationRuntimes()
            .getMonitoringDataWithResponse("owvjupxibu", "gtrnjzbvbwabily", "mfaxepuvwahfnlks",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("pkskbidmzzjp", response.name());
    }
}
