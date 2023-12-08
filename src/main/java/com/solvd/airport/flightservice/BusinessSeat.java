package com.solvd.airport.flightservice;

import com.solvd.airport.info.BeverageInfo;
import com.solvd.airport.info.MealInfo;
import com.solvd.airport.info.SeatInfo;

public class BusinessSeat extends SeatInfo {
    private String mealType;
    private String beverageType;
    private MealInfo mealInfo;
    private BeverageInfo beverageInfo;

    public BusinessSeat(String seatRow, int seatNumber) {
        super(seatRow, seatNumber);
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(MealInfo mealInfo) {
        this.mealInfo = mealInfo;
    }

    public String getBeverageType() {
        return beverageType;
    }

    public void setBeverageType(BeverageInfo beverageInfo) {
        this.beverageInfo = beverageInfo;
    }

    @Override
    public String toString() {
        return "MealInfo{" + mealType + " : " + beverageType + "}";
    }
}
