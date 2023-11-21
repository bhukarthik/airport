package com.solvd.airport.flightservice;

import com.solvd.airport.info.FlightInfo;

public class CargoFlight extends FlightInfo
{
    private String cargoType;
    private String supplierName;
    private double weight;

    public CargoFlight(String flightName, int flightNumber) {
        super(flightName, flightNumber);
    }

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
}
