package io.zipcoder.currencyconverterapplication;

import java.util.HashMap;
import java.util.Map;

public enum CurrencyType {// implements ConvertableCurrency {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        Map<String, CurrencyType> map = new HashMap<>();
        CurrencyType result = null;
        String[] currencyTypes = {"AustralianDollar", "CanadianDollar", "ChineseYR", "Euro", "Franc", "Pound",
                "Ringgit", "Rupee", "SingaporeDollar", "UniversalCurrency", "USDollar", "Yen"};
        CurrencyType[] enumTypes = {AUSTRALIAN_DOLLAR, CANADIAN_DOLLAR, CHINESE_YR, EURO, FRANC, POUND,
                RINGGIT, RUPEE, SINGAPORE_DOLLAR, UNIVERSAL_CURRENCY, US_DOLLAR, YEN};
        for (int i = 0; i < currencyTypes.length; i++) {
            map.put(currencyTypes[i], enumTypes[i]);
        }
        if (map.keySet().contains(currency.getClass().getSimpleName()))
            result = map.get(currency.getClass().getSimpleName());
        return result;
    }
}
