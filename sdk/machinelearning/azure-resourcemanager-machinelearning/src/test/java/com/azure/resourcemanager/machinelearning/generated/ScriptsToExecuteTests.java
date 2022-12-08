// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ScriptReference;
import com.azure.resourcemanager.machinelearning.models.ScriptsToExecute;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ScriptsToExecuteTests {
    @Test
    public void testDeserialize() {
        ScriptsToExecute model =
            BinaryData
                .fromString(
                    "{\"startupScript\":{\"scriptSource\":\"rvkmjcwmjvlgfggc\",\"scriptData\":\"yylizrz\",\"scriptArguments\":\"psfxsf\",\"timeout\":\"tl\"},\"creationScript\":{\"scriptSource\":\"vagbwidqlvhukove\",\"scriptData\":\"i\",\"scriptArguments\":\"vjfn\",\"timeout\":\"mvl\"}}")
                .toObject(ScriptsToExecute.class);
        Assertions.assertEquals("rvkmjcwmjvlgfggc", model.startupScript().scriptSource());
        Assertions.assertEquals("yylizrz", model.startupScript().scriptData());
        Assertions.assertEquals("psfxsf", model.startupScript().scriptArguments());
        Assertions.assertEquals("tl", model.startupScript().timeout());
        Assertions.assertEquals("vagbwidqlvhukove", model.creationScript().scriptSource());
        Assertions.assertEquals("i", model.creationScript().scriptData());
        Assertions.assertEquals("vjfn", model.creationScript().scriptArguments());
        Assertions.assertEquals("mvl", model.creationScript().timeout());
    }

    @Test
    public void testSerialize() {
        ScriptsToExecute model =
            new ScriptsToExecute()
                .withStartupScript(
                    new ScriptReference()
                        .withScriptSource("rvkmjcwmjvlgfggc")
                        .withScriptData("yylizrz")
                        .withScriptArguments("psfxsf")
                        .withTimeout("tl"))
                .withCreationScript(
                    new ScriptReference()
                        .withScriptSource("vagbwidqlvhukove")
                        .withScriptData("i")
                        .withScriptArguments("vjfn")
                        .withTimeout("mvl"));
        model = BinaryData.fromObject(model).toObject(ScriptsToExecute.class);
        Assertions.assertEquals("rvkmjcwmjvlgfggc", model.startupScript().scriptSource());
        Assertions.assertEquals("yylizrz", model.startupScript().scriptData());
        Assertions.assertEquals("psfxsf", model.startupScript().scriptArguments());
        Assertions.assertEquals("tl", model.startupScript().timeout());
        Assertions.assertEquals("vagbwidqlvhukove", model.creationScript().scriptSource());
        Assertions.assertEquals("i", model.creationScript().scriptData());
        Assertions.assertEquals("vjfn", model.creationScript().scriptArguments());
        Assertions.assertEquals("mvl", model.creationScript().timeout());
    }
}