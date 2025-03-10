// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for SqlFciState.
 */
public final class SqlFciState extends ExpandableStringEnum<SqlFciState> {
    /**
     * Static value Unknown for SqlFciState.
     */
    public static final SqlFciState UNKNOWN = fromString("Unknown");

    /**
     * Static value Active for SqlFciState.
     */
    public static final SqlFciState ACTIVE = fromString("Active");

    /**
     * Static value Passive for SqlFciState.
     */
    public static final SqlFciState PASSIVE = fromString("Passive");

    /**
     * Static value NotApplicable for SqlFciState.
     */
    public static final SqlFciState NOT_APPLICABLE = fromString("NotApplicable");

    /**
     * Creates a new instance of SqlFciState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SqlFciState() {
    }

    /**
     * Creates or finds a SqlFciState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SqlFciState.
     */
    public static SqlFciState fromString(String name) {
        return fromString(name, SqlFciState.class);
    }

    /**
     * Gets known SqlFciState values.
     * 
     * @return known SqlFciState values.
     */
    public static Collection<SqlFciState> values() {
        return values(SqlFciState.class);
    }
}
