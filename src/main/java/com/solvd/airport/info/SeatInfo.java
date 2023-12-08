package com.solvd.airport.info;

public abstract class SeatInfo {
    private String seatRow;
    private int seatNumber;

    public SeatInfo(String seatRow, int seatNumber) {
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
    }

    public String getSeatRow() {
        return this.seatRow;
    }

    public void setSeatRow(String SeatRow) {
        this.seatRow = SeatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "SeatInfo{" + seatRow + " : " + seatNumber + "}";
    }
}