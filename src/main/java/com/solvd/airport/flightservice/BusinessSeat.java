package com.solvd.airport.flightservice;

import com.solvd.airport.info.SeatInfo;

public class BusinessSeat extends SeatInfo
{
    private String MealType;
    private String BeverageType;

    public BusinessSeat(String seatRow, int seatNumber) {
        super(seatRow, seatNumber);
    }

    public String getMealType() {
        return MealType;
    }

    public void setMealType(String mealType) {
        this.MealType = mealType;
    }

    public String getBeverageType() {
        return BeverageType;
    }

    public void setBeverageType(String beverageType) {
        BeverageType = beverageType;
    }

    @Override
    public String toString() {
        return "MealInfo{"+MealType+" : "+BeverageType+"}";
    }
}
