package com.solvd.airport.info;

public enum DestinationInfo
{
    RDU("Raleigh/Durham Airport", "RALEIGH", "USA"),
    LHR("London Heathrow", "LONDON", "UK"),
    DBX("Dubai Airport", "DUBAI", "UAE"),
    LAX("Los Angles Airport", "LOS ANGLES", "USA"),
    SLC("Salt Lake City Airport", "SALT LAKE CITY", "USA"),
    MCO("Orlando Airport", "ORLANDO", "USA"),
    IAD("Washington Airport", "WASHINGTON", "USA"),
    SFO("SAN FRANCISCO Airport", "SAN FRANCISCO", "USA"),
    SEA("SEATTLE Airport", "SEATTLE", "USA");

    private final String airportName;
    private final String code;
    private final String countryOfOrigin;

    DestinationInfo(String airportName, String code, String countryOfOrigin)
    {
        this.airportName = airportName;
        this.code = code;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return this.airportName;
    }

    public String getAirportCode(){
        return this.code;
    }

    public String getCountryOfOrigin(){
        return this.countryOfOrigin;
    }
}
