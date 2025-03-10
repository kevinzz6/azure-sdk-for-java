// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the policy to apply to events that arrive out of order in the input event stream.
 */
public final class EventsOutOfOrderPolicy extends ExpandableStringEnum<EventsOutOfOrderPolicy> {
    /**
     * Static value Adjust for EventsOutOfOrderPolicy.
     */
    public static final EventsOutOfOrderPolicy ADJUST = fromString("Adjust");

    /**
     * Static value Drop for EventsOutOfOrderPolicy.
     */
    public static final EventsOutOfOrderPolicy DROP = fromString("Drop");

    /**
     * Creates a new instance of EventsOutOfOrderPolicy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EventsOutOfOrderPolicy() {
    }

    /**
     * Creates or finds a EventsOutOfOrderPolicy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EventsOutOfOrderPolicy.
     */
    public static EventsOutOfOrderPolicy fromString(String name) {
        return fromString(name, EventsOutOfOrderPolicy.class);
    }

    /**
     * Gets known EventsOutOfOrderPolicy values.
     * 
     * @return known EventsOutOfOrderPolicy values.
     */
    public static Collection<EventsOutOfOrderPolicy> values() {
        return values(EventsOutOfOrderPolicy.class);
    }
}
