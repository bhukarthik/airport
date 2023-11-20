package com.solvd.airport.flightservice;

import com.solvd.airport.info.FlightInfo;

public class CargoFlight extends FlightInfo
{
    private String FlightName;
    private int FlightNumber;
    private String cargoType;
    private String supplierName;
    private double weight;
    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getFlightName() {
        return FlightName;
    }

    public void setFlightName(String flightName) {
        FlightName = flightName;
    }

    public int getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        FlightNumber = flightNumber;
    }
    @Override
    public void FlightType()
    {
        final String flight;
        flight = "Cargo";
    }
}
