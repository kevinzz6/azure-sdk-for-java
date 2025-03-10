// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.SourceControlInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of SourceControl.
 */
public interface SourceControl {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the repoUrl property: The repo url of the source control.
     * 
     * @return the repoUrl value.
     */
    String repoUrl();

    /**
     * Gets the branch property: The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
     * @return the branch value.
     */
    String branch();

    /**
     * Gets the folderPath property: The folder path of the source control.
     * 
     * @return the folderPath value.
     */
    String folderPath();

    /**
     * Gets the autoSync property: The auto sync of the source control. Default is false.
     * 
     * @return the autoSync value.
     */
    Boolean autoSync();

    /**
     * Gets the publishRunbook property: The auto publish of the source control. Default is true.
     * 
     * @return the publishRunbook value.
     */
    Boolean publishRunbook();

    /**
     * Gets the sourceType property: The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     * 
     * @return the sourceType value.
     */
    SourceType sourceType();

    /**
     * Gets the description property: The description.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the creationTime property: The creation time.
     * 
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the lastModifiedTime property: The last modified time.
     * 
     * @return the lastModifiedTime value.
     */
    OffsetDateTime lastModifiedTime();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.SourceControlInner object.
     * 
     * @return the inner object.
     */
    SourceControlInner innerModel();

    /**
     * The entirety of the SourceControl definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The SourceControl definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the SourceControl definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the SourceControl definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, automationAccountName.
             * 
             * @param resourceGroupName Name of an Azure Resource group.
             * @param automationAccountName The name of the automation account.
             * @return the next definition stage.
             */
            WithCreate withExistingAutomationAccount(String resourceGroupName, String automationAccountName);
        }

        /**
         * The stage of the SourceControl definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithRepoUrl, DefinitionStages.WithBranch,
            DefinitionStages.WithFolderPath, DefinitionStages.WithAutoSync, DefinitionStages.WithPublishRunbook,
            DefinitionStages.WithSourceType, DefinitionStages.WithSecurityToken, DefinitionStages.WithDescription {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            SourceControl create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SourceControl create(Context context);
        }

        /**
         * The stage of the SourceControl definition allowing to specify repoUrl.
         */
        interface WithRepoUrl {
            /**
             * Specifies the repoUrl property: The repo url of the source control..
             * 
             * @param repoUrl The repo url of the source control.
             * @return the next definition stage.
             */
            WithCreate withRepoUrl(String repoUrl);
        }

        /**
         * The stage of the SourceControl definition allowing to specify branch.
         */
        interface WithBranch {
            /**
             * Specifies the branch property: The repo branch of the source control. Include branch as empty string for
             * VsoTfvc..
             * 
             * @param branch The repo branch of the source control. Include branch as empty string for VsoTfvc.
             * @return the next definition stage.
             */
            WithCreate withBranch(String branch);
        }

        /**
         * The stage of the SourceControl definition allowing to specify folderPath.
         */
        interface WithFolderPath {
            /**
             * Specifies the folderPath property: The folder path of the source control. Path must be relative..
             * 
             * @param folderPath The folder path of the source control. Path must be relative.
             * @return the next definition stage.
             */
            WithCreate withFolderPath(String folderPath);
        }

        /**
         * The stage of the SourceControl definition allowing to specify autoSync.
         */
        interface WithAutoSync {
            /**
             * Specifies the autoSync property: The auto async of the source control. Default is false..
             * 
             * @param autoSync The auto async of the source control. Default is false.
             * @return the next definition stage.
             */
            WithCreate withAutoSync(Boolean autoSync);
        }

        /**
         * The stage of the SourceControl definition allowing to specify publishRunbook.
         */
        interface WithPublishRunbook {
            /**
             * Specifies the publishRunbook property: The auto publish of the source control. Default is true..
             * 
             * @param publishRunbook The auto publish of the source control. Default is true.
             * @return the next definition stage.
             */
            WithCreate withPublishRunbook(Boolean publishRunbook);
        }

        /**
         * The stage of the SourceControl definition allowing to specify sourceType.
         */
        interface WithSourceType {
            /**
             * Specifies the sourceType property: The source type. Must be one of VsoGit, VsoTfvc, GitHub, case
             * sensitive..
             * 
             * @param sourceType The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
             * @return the next definition stage.
             */
            WithCreate withSourceType(SourceType sourceType);
        }

        /**
         * The stage of the SourceControl definition allowing to specify securityToken.
         */
        interface WithSecurityToken {
            /**
             * Specifies the securityToken property: The authorization token for the repo of the source control..
             * 
             * @param securityToken The authorization token for the repo of the source control.
             * @return the next definition stage.
             */
            WithCreate withSecurityToken(SourceControlSecurityTokenProperties securityToken);
        }

        /**
         * The stage of the SourceControl definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: The user description of the source control..
             * 
             * @param description The user description of the source control.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
    }

    /**
     * Begins update for the SourceControl resource.
     * 
     * @return the stage of resource update.
     */
    SourceControl.Update update();

    /**
     * The template for SourceControl update.
     */
    interface Update extends UpdateStages.WithBranch, UpdateStages.WithFolderPath, UpdateStages.WithAutoSync,
        UpdateStages.WithPublishRunbook, UpdateStages.WithSecurityToken, UpdateStages.WithDescription {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        SourceControl apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SourceControl apply(Context context);
    }

    /**
     * The SourceControl update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the SourceControl update allowing to specify branch.
         */
        interface WithBranch {
            /**
             * Specifies the branch property: The repo branch of the source control..
             * 
             * @param branch The repo branch of the source control.
             * @return the next definition stage.
             */
            Update withBranch(String branch);
        }

        /**
         * The stage of the SourceControl update allowing to specify folderPath.
         */
        interface WithFolderPath {
            /**
             * Specifies the folderPath property: The folder path of the source control. Path must be relative..
             * 
             * @param folderPath The folder path of the source control. Path must be relative.
             * @return the next definition stage.
             */
            Update withFolderPath(String folderPath);
        }

        /**
         * The stage of the SourceControl update allowing to specify autoSync.
         */
        interface WithAutoSync {
            /**
             * Specifies the autoSync property: The auto sync of the source control. Default is false..
             * 
             * @param autoSync The auto sync of the source control. Default is false.
             * @return the next definition stage.
             */
            Update withAutoSync(Boolean autoSync);
        }

        /**
         * The stage of the SourceControl update allowing to specify publishRunbook.
         */
        interface WithPublishRunbook {
            /**
             * Specifies the publishRunbook property: The auto publish of the source control. Default is true..
             * 
             * @param publishRunbook The auto publish of the source control. Default is true.
             * @return the next definition stage.
             */
            Update withPublishRunbook(Boolean publishRunbook);
        }

        /**
         * The stage of the SourceControl update allowing to specify securityToken.
         */
        interface WithSecurityToken {
            /**
             * Specifies the securityToken property: The authorization token for the repo of the source control..
             * 
             * @param securityToken The authorization token for the repo of the source control.
             * @return the next definition stage.
             */
            Update withSecurityToken(SourceControlSecurityTokenProperties securityToken);
        }

        /**
         * The stage of the SourceControl update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: The user description of the source control..
             * 
             * @param description The user description of the source control.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    SourceControl refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SourceControl refresh(Context context);
}
