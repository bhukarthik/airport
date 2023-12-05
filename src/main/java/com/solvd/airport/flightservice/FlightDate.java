package com.solvd.airport.flightservice;

import com.solvd.airport.info.DateInfo;

import java.util.Calendar;
import java.util.Date;

public class FlightDate extends DateInfo
{
    private Date depatureDate;
    private Date arrivalDate;

    public Date getDepatureDate() {
        return depatureDate;
    }

    public void setDepatureDate(Date depatureDate) {
        this.depatureDate = depatureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Override
    public Date currentDate(Date date) {
        return date;
    }
}
