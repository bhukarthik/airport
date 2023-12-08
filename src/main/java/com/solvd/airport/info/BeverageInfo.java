package com.solvd.airport.info;

public enum BeverageInfo {
    WATER("Water", "WAT"),
    TEA("TEA", "TA"),
    SODA("COKE", "SD"),
    COFFEE("coffee Drink", "COF");

    private final String beverageName;
    private final String code;

    BeverageInfo(String beverageName, String code) {
        this.beverageName = beverageName;
        this.code = code;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public String getCode() {
        return code;
    }

}
