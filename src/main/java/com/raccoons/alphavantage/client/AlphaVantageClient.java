package com.raccoons.alphavantage.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.raccoons.alphavantage.net.AlphaVantageHttpClient;

public class AlphaVantageClient {

    private AlphaVantageHttpClient alphaVantageHttpClient;
    private ObjectMapper objectMapper;

    public AlphaVantageClient(AlphaVantageHttpClient alphaVantageHttpClient) {
        this.alphaVantageHttpClient = alphaVantageHttpClient;
        this.objectMapper = new ObjectMapper();
    }

    public AlphaVantageClient(AlphaVantageHttpClient alphaVantageHttpClient, ObjectMapper objectMapper) {
        this.alphaVantageHttpClient = alphaVantageHttpClient;
        this.objectMapper = objectMapper;
    }


}
