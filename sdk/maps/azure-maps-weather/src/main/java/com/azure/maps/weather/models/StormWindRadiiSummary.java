// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.models.GeoPolygon;
import com.azure.maps.weather.implementation.helpers.Utility;
import com.azure.maps.weather.implementation.models.GeoJsonGeometry;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Displayed when details=true or radiiGeometry=true in the request. */
@Fluent
public final class StormWindRadiiSummary {
    /*
     * DateTime for which the wind radii summary data is valid, displayed in ISO8601 format.
     */
    @JsonProperty(value = "dateTime")
    private String timestamp;

    /*
     * Wind speed associated with the radiusSectorData.
     */
    @JsonProperty(value = "windSpeed")
    private WeatherUnitDetails windSpeed;

    /*
     * Contains the information needed to plot wind radius quadrants. Bearing 0–90 = NE quadrant; 90–180 = SE quadrant;
     * 180–270 = SW quadrant; 270–360 = NW quadrant.
     */
    @JsonProperty(value = "radiusSectorData")
    private List<RadiusSector> radiusSectorData;

    /*
     * GeoJSON object. Displayed when radiiGeometry=true in request. Describes the outline of the wind radius
     * quadrants.
     */
    @JsonProperty(value = "radiiGeometry")
    private GeoJsonGeometry radiiGeometry;

    /** Set default StormWindRadiiSummary constructor to private */
    private StormWindRadiiSummary() {}

    /**
     * Get the timestamp property: DateTime for which the wind radii summary data is valid, displayed in ISO8601 format.
     *
     * @return the timestamp value.
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the windSpeed property: Wind speed associated with the radiusSectorData.
     *
     * @return the windSpeed value.
     */
    public WeatherUnitDetails getWindSpeed() {
        return this.windSpeed;
    }

    /**
     * Get the radiusSectorData property: Contains the information needed to plot wind radius quadrants. Bearing 0–90 =
     * NE quadrant; 90–180 = SE quadrant; 180–270 = SW quadrant; 270–360 = NW quadrant.
     *
     * @return the radiusSectorData value.
     */
    public List<RadiusSector> getRadiusSectorData() {
        return this.radiusSectorData;
    }

    /**
     * Return GeoPolygon
     *
     * @return Returns a {@link GeoPolygon} for this weather window
     */
    public GeoPolygon getPolygon() {
        return Utility.toGeoPolygon(this.radiiGeometry);
    }
}
