package com.raccoons.alphavantage.api.series;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TimeSeries {

    private final TimeSeriesMetadata metadata;
    private final Map<String, TimeSeriesElement> elementMap;
    private final List<TimeSeriesElement> elements;

    public TimeSeries(TimeSeriesMetadata metadata, Map<String, TimeSeriesElement> elementMap) {
        this.metadata = metadata;
        this.elementMap = elementMap;
        this.elements = new ArrayList<>(elementMap.values());
    }

    public List<TimeSeriesElement> getElements() {
        return elements;
    }

    public TimeSeriesElement getElement() {
        return elementMap.get(null);
    }

    public TimeSeriesMetadata getMetadata() {
        return metadata;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {

        private TimeSeriesMetadata metadata;
        private Map<String, TimeSeriesElement> elementMap;

        public Builder metadata(TimeSeriesMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder elementMap(Map<String, TimeSeriesElement> elementMap) {
            this.elementMap = elementMap;
            return this;
        }

        public TimeSeries build() {
            return new TimeSeries(metadata, elementMap);
        }

    }
}
