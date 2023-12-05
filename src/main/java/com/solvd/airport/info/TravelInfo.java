package com.solvd.airport.info;

public class TravelInfo
{
    private String departure;
    private DestinationInfo destinationInfo;
    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public DestinationInfo getArrival() {
        return destinationInfo;
    }

    public void setDestinationInfo(DestinationInfo arrival)
    {
        this.destinationInfo = arrival;
    }

    @Override
    public String toString() {
        return "TravelInfo{"+departure+" : "+destinationInfo+"}";
    }
}
