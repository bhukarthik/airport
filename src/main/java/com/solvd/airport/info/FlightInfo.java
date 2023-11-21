package com.solvd.airport.info;

public abstract class FlightInfo
{
    private String flightName;
    private int flightNumber;
    private String flightType;

    public FlightInfo(String flightName, int flightNumber)
    {
        this.flightName = flightName;
        this.flightNumber = flightNumber;
    }
    public String getFlightName() {
        return flightName;
    }
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
}
