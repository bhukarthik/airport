package com.solvd.airport.flightservice;

import com.solvd.airport.info.SeatInfo;

public class FirstClassSeat extends SeatInfo
{
    private String MealType;
    private String BeverageType;
    private int NoOfLuggages;
    private double Weight;
    public FirstClassSeat(String seatRow, int seatNumber)
    {
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
    public int getNoOfLuggages() {
        return NoOfLuggages;
    }

    public void setNoOfLuggages(int noOfLuggages) {
        NoOfLuggages = noOfLuggages;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "LuggageInfo{"+NoOfLuggages+" : "+Weight+"}";
    }

}
