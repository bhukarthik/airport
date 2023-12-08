package com.solvd.connection;

public class Main {
    public static void main(String args[]){
        ConnectionMain connectionMain = new ConnectionMain("Connection-1");
        connectionMain.start();

        ConnectionMain connectionMain2 = new ConnectionMain("Connection-1");
        connectionMain2.start();
    }
}
