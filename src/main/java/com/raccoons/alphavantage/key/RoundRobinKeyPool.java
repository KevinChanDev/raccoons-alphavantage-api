package com.raccoons.alphavantage.key;

import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class RoundRobinKeyPool implements AlphaVantageKeyPool {

    private final Deque<AlphaVantageKey> keyDeque;

    public RoundRobinKeyPool(Collection<AlphaVantageKey> alphaVantageKeys) {
        this.keyDeque = new ConcurrentLinkedDeque<>(alphaVantageKeys);
    }

    @Override
    public AlphaVantageKey getKey() {
        final int size = keyDeque.size();
        if (size == 0) {
            throw new RuntimeException("There are no AlphaVantageKeys in this instance.");
        } else if (size == 1) {
            return keyDeque.peekFirst();
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
