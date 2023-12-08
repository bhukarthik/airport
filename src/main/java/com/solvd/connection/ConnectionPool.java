package com.solvd.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ConnectionPool {
    private static ConnectionPool connectionPool = null;
    private List<Connection> connections = new ArrayList<>();
    private int checkOut;

    private ConnectionPool() {
        IntStream.range(0, 4).forEach(checkOut -> {
            Connection connection = new Connection();
            connection.setName("Connection " + checkOut);
            connections.add(connection);
        });
    }

    public static ConnectionPool getInstance() {

        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
        }
        return connectionPool;
    }

    public synchronized Connection getConnection() {
       return null;

    }

    public synchronized void releaseConnection(Connection connection) {
        connections.add(connection);
        checkOut--;
        notifyAll();
    }
}
