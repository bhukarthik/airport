package com.solvd.airport.info;

public class TravelInfo
{
    private String departure;
    private String arrival;
    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "TravelInfo{"+departure+" : "+arrival+"}";
    }
}
