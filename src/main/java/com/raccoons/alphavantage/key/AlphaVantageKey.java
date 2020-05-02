package com.raccoons.alphavantage.key;

public class AlphaVantageKey {

    private final String apiKey;

    private AlphaVantageKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public static AlphaVantageKey newInstance(final String apiKey) {
        return new AlphaVantageKey(apiKey);
    }

}
