package net.therap.javafest.currencyconverter.service;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
public class CurrencyConverterService {

    private static final double EXCHANGE_RATE = 80;

    public double bdtToUsd(double amountInBdt) {
        return amountInBdt / EXCHANGE_RATE;
    }
}
