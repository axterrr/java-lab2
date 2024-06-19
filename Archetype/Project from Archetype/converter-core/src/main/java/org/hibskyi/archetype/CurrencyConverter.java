package org.hibskyi.archetype;

import java.util.Map;

public class CurrencyConverter {

    private Map<String, Double> exchangeRates;

    public CurrencyConverter(Map<String, Double> rates) {
        exchangeRates = rates;
    }

    public double convert(String toCurrency, double amount) {
        if (!exchangeRates.containsKey(toCurrency))
            throw new IllegalArgumentException("Unknown currency");
        return amount * exchangeRates.get(toCurrency);
    }
}
