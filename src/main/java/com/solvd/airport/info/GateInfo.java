package com.solvd.airport.info;

public class GateInfo {


    public String terminalName;
    private int gateNumber;

    public GateInfo(String terminalName, int gateNumber) {
        this.terminalName = terminalName;
        this.gateNumber = gateNumber;
    }

    public GateInfo() {

    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
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
        return "GateInfo{" + terminalName + " : " + gateNumber + "}";
    }
}
