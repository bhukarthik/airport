package com.solvd.connection;

public class Main {
    public static void main(String args[])
    {
        ConnectionMain connectionMain = new ConnectionMain("Connection-1");
        connectionMain.start();

        ConnectionMain connectionMain2 = new ConnectionMain("Connection-2");
        connectionMain2.start();

        ConnectionMain connectionMain3 = new ConnectionMain("Connection-3");
        connectionMain3.start();

        ConnectionMain connectionMain4 = new ConnectionMain("Connection-4");
        connectionMain4.start();

        ConnectionMain connectionMain5 = new ConnectionMain("Connection-5");
        connectionMain5.start();
    }
}
