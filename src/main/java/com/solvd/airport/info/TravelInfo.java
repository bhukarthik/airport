package com.solvd.airport.info;

public class TravelInfo
{
    private String Departure;
    private String Arrival;
    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String departure) {
        this.Departure = departure;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String arrival) {
        this.Arrival = arrival;
    }

    @Override
    public String toString() {
        return "TravelInfo{"+Departure+" : "+Arrival+"}";
    }
}
