package com.solvd.airport.flightservice;

import com.solvd.airport.Airport;
import com.solvd.airport.info.FlightInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.HashMap;
import java.util.Map;

public class PassengerFlight extends FlightInfo
{
    private static final Logger LOGGER = (Logger) LogManager.getLogger(PassengerFlight.class);
    private String FlightName;
    private int FlightNumber;

    private String seatType;

    @Override
    public void FlightType()
    {
        final String flight;
        flight = "Passenger";
    }

    @Override
    public String toString() {
        return "FlightInfo{ " + "FlightName= "+FlightName+", FlightNumber= "+FlightNumber+"}";
    }

    public String getFlightName()
    {
        return FlightName;
    }

    public void setFlightName(String flightNameInput)
    {
        FlightName = flightNameInput;
    }

    public int getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        FlightNumber = flightNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

}
