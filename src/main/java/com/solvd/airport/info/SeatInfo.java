package com.solvd.airport.info;

public abstract class SeatInfo
{
    private String SeatRow;
    private int SeatNumber;

    public SeatInfo(String seatRow, int seatNumber)
    {
        this.SeatRow=seatRow;
        this.SeatNumber=seatNumber;
    }

    public String getSeatRow() {
        return this.SeatRow;
    }

    public void setSeatRow(String SeatRow) {
        this.SeatRow = SeatRow;
    }

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        SeatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "SeatInfo{"+SeatRow+" : "+SeatNumber+"}";
    }
}