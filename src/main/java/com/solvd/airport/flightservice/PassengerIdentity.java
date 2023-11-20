package com.solvd.airport.flightservice;

import com.solvd.airport.info.IdentityInfo;

public class PassengerIdentity extends IdentityInfo
{
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    private int id;
    public PassengerIdentity(int id) {
        super(id);
    }

}
