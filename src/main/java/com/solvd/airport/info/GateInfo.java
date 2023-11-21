package com.solvd.airport.info;

public class GateInfo
{
    private String terminalName;
    private int gateNumber;
    public String getTerminalName()
    {
        return terminalName;
    }
    public void setTerminalName(String terminalName)
    {
        this.terminalName = terminalName;
    }
    public int getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }
    @Override
    public String toString() {
        return "GateInfo{"+terminalName+" : "+gateNumber+"}";
    }
}
