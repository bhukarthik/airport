package com.solvd.airport.info;

public class GateInfo
{
    private String TerminalName;
    private int GateNumber;

    public String getTerminalName() {
        return TerminalName;
    }
    public void setTerminalName(String terminalName) {
        TerminalName = terminalName;
    }
    public int getGateNumber() {
        return GateNumber;
    }
    public  void setGateNumber(int gateNumber) {
        GateNumber = gateNumber;
    }

    @Override
    public String toString() {
        return "GateInfo{"+TerminalName+" : "+GateNumber+"}";
    }
}
