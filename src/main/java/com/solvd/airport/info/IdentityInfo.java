package com.solvd.airport.info;

public abstract class IdentityInfo {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public IdentityInfo(int id) {
        this.id = id;
    }
}
