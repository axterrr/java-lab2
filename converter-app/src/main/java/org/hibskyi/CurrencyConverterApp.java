package org.hibskyi;

import java.util.Map;
import java.util.Scanner;

public class CurrencyConverterApp {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("What currency you want to get? ");
            String toCurrency = scan.next().toUpperCase();
            System.out.print("What currency you want to exchange? ");
            String fromCurrency = scan.next().toUpperCase();
            System.out.print("How much? ");
            int amount = Integer.parseInt(scan.next());

            Map<String, Double> rates = ExchangeRateLoader.loadRates(fromCurrency);
            CurrencyConverter converter = new CurrencyConverter(rates);
            double result = converter.convert(toCurrency, amount);
            System.out.printf("You get %.2f " + toCurrency, result);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
