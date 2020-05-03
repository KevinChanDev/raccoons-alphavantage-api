package com.raccoons.alphavantage.api.series;

public class TimeSeriesElement {

    private final double open;
    private final double high;
    private final double low;
    private final double close;
    private final long volume;

    public TimeSeriesElement(double open, double high, double low, double close, long volume) {
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
    }

    public double getOpen() {
        return open;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public double getClose() {
        return close;
    }

    public long getVolume() {
        return volume;
    }
}
