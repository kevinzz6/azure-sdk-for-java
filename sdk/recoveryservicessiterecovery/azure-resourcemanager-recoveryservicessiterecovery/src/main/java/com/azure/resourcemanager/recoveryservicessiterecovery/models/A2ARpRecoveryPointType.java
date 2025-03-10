// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The recovery point type.
 */
public final class A2ARpRecoveryPointType extends ExpandableStringEnum<A2ARpRecoveryPointType> {
    /**
     * Static value Latest for A2ARpRecoveryPointType.
     */
    public static final A2ARpRecoveryPointType LATEST = fromString("Latest");

    /**
     * Static value LatestApplicationConsistent for A2ARpRecoveryPointType.
     */
    public static final A2ARpRecoveryPointType LATEST_APPLICATION_CONSISTENT
        = fromString("LatestApplicationConsistent");

    /**
     * Static value LatestCrashConsistent for A2ARpRecoveryPointType.
     */
    public static final A2ARpRecoveryPointType LATEST_CRASH_CONSISTENT = fromString("LatestCrashConsistent");

    /**
     * Static value LatestProcessed for A2ARpRecoveryPointType.
     */
    public static final A2ARpRecoveryPointType LATEST_PROCESSED = fromString("LatestProcessed");

    /**
     * Creates a new instance of A2ARpRecoveryPointType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public A2ARpRecoveryPointType() {
    }

    /**
     * Creates or finds a A2ARpRecoveryPointType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding A2ARpRecoveryPointType.
     */
    public static A2ARpRecoveryPointType fromString(String name) {
        return fromString(name, A2ARpRecoveryPointType.class);
    }

    /**
     * Gets known A2ARpRecoveryPointType values.
     * 
     * @return known A2ARpRecoveryPointType values.
     */
    public static Collection<A2ARpRecoveryPointType> values() {
        return values(A2ARpRecoveryPointType.class);
    }
}
