package com.raccoons.alphavantage.api.series;

public class TimeSeriesMetadata {

    private final TimeSeriesType type;
    private final String symbol;
    private final TimeSeriesResolution resolution;
    private final boolean adjusted;

    public TimeSeriesMetadata(TimeSeriesType type, String symbol, TimeSeriesResolution resolution, boolean adjusted) {
        this.type = type;
        this.symbol = symbol;
        this.resolution = resolution;
        this.adjusted = adjusted;
    }

    public TimeSeriesType getType() {
        return type;
    }

    public String getSymbol() {
        return symbol;
    }

    public TimeSeriesResolution getResolution() {
        return resolution;
    }

    public boolean isAdjusted() {
        return adjusted;
    }

    public static final class Builder {

        private TimeSeriesType type;
        private String symbol;
        private boolean adjusted;
        private TimeSeriesResolution resolution;

        public Builder type(TimeSeriesType type) {
            this.type = type;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder adjusted(boolean adjusted) {
            this.adjusted = adjusted;
            return this;
        }

        public Builder resolution(TimeSeriesResolution resolution) {
            this.resolution = resolution;
            return this;
        }

        public TimeSeriesMetadata build() {
            return new TimeSeriesMetadata(type, symbol, resolution, adjusted);
        }

    }
}
