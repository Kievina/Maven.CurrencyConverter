package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    public CurrencyType getCT() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
//    public Double getExchangeRate(CurrencyType sourceCurrency) {
//        return CurrencyType.AUSTRALIAN_DOLLAR.getRate() / sourceCurrency.getRate();
//    }
}
