package com.solvd.airport.flightservice;

import com.solvd.airport.info.SeatInfo;

public class BusinessSeat extends SeatInfo
{
    private String mealType;
    private String beverageType;

    public BusinessSeat(String seatRow, int seatNumber) {
        super(seatRow, seatNumber);
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getBeverageType() {
        return beverageType;
    }

    public void setBeverageType(String beverageType) {
        this.beverageType = beverageType;
    }

    @Override
    public String toString() {
        return "MealInfo{"+mealType+" : "+beverageType+"}";
    }
}
