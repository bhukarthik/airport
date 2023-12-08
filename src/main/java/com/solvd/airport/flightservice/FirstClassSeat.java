package com.solvd.airport.flightservice;

import com.solvd.airport.info.SeatInfo;

public class FirstClassSeat extends SeatInfo {
    private String mealType;
    private String beverageType;
    private int noOfLuggages;
    private double Weight;

    public FirstClassSeat(String seatRow, int seatNumber) {
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

    public int getNoOfLuggages() {
        return noOfLuggages;
    }

    public void setNoOfLuggages(int noOfLuggages) {
        noOfLuggages = noOfLuggages;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "LuggageInfo{" + noOfLuggages + " : " + Weight + "}";
    }

}
