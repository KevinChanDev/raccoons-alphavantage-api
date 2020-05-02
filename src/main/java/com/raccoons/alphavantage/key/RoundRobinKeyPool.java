package com.raccoons.alphavantage.key;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class RoundRobinKeyPool implements AlphaVantageKeyPool {

    private Deque<AlphaVantageKey> keyDeque;

    public RoundRobinKeyPool() {
        this.keyDeque = new ConcurrentLinkedDeque<>();
    }

    @Override
    public AlphaVantageKey getKey() {
        if (keyDeque.size() == 0) {
            throw new RuntimeException("There are no AlphaVantageKeys in this instance.");
        }
        final AlphaVantageKey key = keyDeque.poll();
        if (key != null) {
            keyDeque.addLast(key);
            return key;
        } else {
            throw new RuntimeException("There are no AlphaVantageKeys in this instance.");
        }
    }

}
