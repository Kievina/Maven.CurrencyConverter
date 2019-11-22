package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
//        return Double.MAX_VALUE;
        return currencyType.getRate() / this.getCT().getRate();

    }
    CurrencyType getCT();
}
