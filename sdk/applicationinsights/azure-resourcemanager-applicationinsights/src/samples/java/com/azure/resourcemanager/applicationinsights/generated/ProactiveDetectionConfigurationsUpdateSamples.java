// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentProactiveDetectionConfigurationInner;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions;
import java.util.Arrays;

/**
 * Samples for ProactiveDetectionConfigurations Update.
 */
public final class ProactiveDetectionConfigurationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2015-05-01/examples/
     * ProactiveDetectionConfigurationUpdate.json
     */
    /**
     * Sample code: ProactiveDetectionConfigurationUpdate.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void proactiveDetectionConfigurationUpdate(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.proactiveDetectionConfigurations()
            .updateWithResponse("my-resource-group", "my-component", "slowpageloadtime",
                new ApplicationInsightsComponentProactiveDetectionConfigurationInner().withName("slowpageloadtime")
                    .withEnabled(true)
                    .withSendEmailsToSubscriptionOwners(true)
                    .withCustomEmails(Arrays.asList("foo@microsoft.com", "foo2@microsoft.com"))
                    .withRuleDefinitions(
                        new ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions()
                            .withName("slowpageloadtime")
                            .withDisplayName("Slow page load time")
                            .withDescription("Smart Detection rules notify you of performance anomaly issues.")
                            .withHelpUrl(
                                "https://docs.microsoft.com/en-us/azure/application-insights/app-insights-proactive-performance-diagnostics")
                            .withIsHidden(false)
                            .withIsEnabledByDefault(true)
                            .withIsInPreview(false)
                            .withSupportsEmailNotifications(true)),
                com.azure.core.util.Context.NONE);
    }
}
