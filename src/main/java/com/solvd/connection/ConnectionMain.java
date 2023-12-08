package com.solvd.connection;

public class ConnectionMain extends Thread {

    private Thread connID;
    private String connName;

    public ConnectionMain(String connName) {
        this.connName = connName;
        System.out.println("Creating Thread:" + connName);
    }

    public void run() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = connectionPool.getConnection();
        int timer = 0;
        while (connection == null && timer < 6000) {
            try {
                Thread.sleep(1000);
                connection = connectionPool.getConnection();
                timer += 1000;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void start() {
        System.out.println("Starting Thread");
        if (connID == null) {
            connID = new Thread(this, connName);
            connID.start();
        }
    }
}
