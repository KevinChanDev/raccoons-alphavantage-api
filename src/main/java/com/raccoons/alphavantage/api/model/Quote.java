package com.raccoons.alphavantage.api.model;

public class Quote {

    private final String symbol;
    private final double open;
    private final double high;
    private final double low;
    private final double price;
    private final double previousClose;
    private final long volume;
    private final String latestTradingDay;
    private final double change;
    private final double changePercentage;

    public Quote(String symbol, double open, double high, double low, double price, double previousClose,
                 long volume, String latestTradingDay, double change, double changePercentage) {
        this.symbol = symbol;
        this.open = open;
        this.high = high;
        this.low = low;
        this.price = price;
        this.previousClose = previousClose;
        this.volume = volume;
        this.latestTradingDay = latestTradingDay;
        this.change = change;
        this.changePercentage = changePercentage;
    }

    public String getSymbol() {
        return symbol;
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

    public double getPrice() {
        return price;
    }

    public double getPreviousClose() {
        return previousClose;
    }

    public long getVolume() {
        return volume;
    }

    public String getLatestTradingDay() {
        return latestTradingDay;
    }

    public double getChange() {
        return change;
    }

    public double getChangePercentage() {
        return changePercentage;
    }
}
