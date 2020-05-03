package com.raccoons.alphavantage.net;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface AlphaVantageHttpClient {

    CompletableFuture<AlphaVantageHttpResponse> get(String uri, Map<String, String> headers);

}
