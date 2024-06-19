package org.hibskyi.archetype;

import junit.framework.TestCase;

import java.util.HashMap;

public class CurrencyConverterTest extends TestCase {
    public void testCurrencyConverter() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("UAH", 1.0);
        map.put("USD", 40.0);
        map.put("EUR", 45.0);
        CurrencyConverter converter = new CurrencyConverter(map);
        assertEquals(converter.convert("UAH", 5), 5.0);
        assertEquals(converter.convert("USD", 10), 400.0);
        assertEquals(converter.convert("EUR", 1), 45.0);
    }
}
