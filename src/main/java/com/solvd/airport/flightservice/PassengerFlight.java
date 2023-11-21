package com.solvd.airport.flightservice;

import com.solvd.airport.info.FlightInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class PassengerFlight extends FlightInfo
{
    private static final Logger LOGGER = (Logger) LogManager.getLogger(PassengerFlight.class);
    private String seatType;
    public PassengerFlight(String flightName, int flightNumber) {
        super(flightName, flightNumber);
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

}
