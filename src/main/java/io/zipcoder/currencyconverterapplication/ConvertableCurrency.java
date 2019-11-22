package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    CurrencyType getCT();

    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getCT().getRate();
    }
}
