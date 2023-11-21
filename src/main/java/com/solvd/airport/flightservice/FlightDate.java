package com.solvd.airport.flightservice;

import com.solvd.airport.info.DateInfo;

import java.util.Calendar;
import java.util.Date;

public class FlightDate extends DateInfo {
    @Override
    public Date currentDate()
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.getTime();
    }

    public Date depatureDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.HOUR, 1);
        cal.add(Calendar.MINUTE, 10);
        return cal.getTime();
    }
    public Date arrivalDate()
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.HOUR, 3);
        cal.add(Calendar.MINUTE, 20);
        return cal.getTime();
    }
}
