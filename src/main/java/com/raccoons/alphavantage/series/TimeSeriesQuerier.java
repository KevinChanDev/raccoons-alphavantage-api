package com.raccoons.alphavantage.series;

import com.raccoons.alphavantage.api.series.TimeSeries;
import com.raccoons.alphavantage.api.series.TimeSeriesElement;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Methods that allow for the filtering of existing TimeSeries instances into TimeSeriesElements
 */
public class TimeSeriesQuerier {

    public static Map<String, TimeSeriesElement> query(final TimeSeries timeSeries, final String pattern) {
        return new LinkedHashMap<>();
    }

}
