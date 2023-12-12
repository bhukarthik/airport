package com.solvd.connection;

import com.solvd.airport.Airport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ConnectionPool {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(ConnectionPool.class);
    private static ConnectionPool connectionPool = null;
    private List<Connection> connections = new ArrayList<>();
    private int checkOut;

    private ConnectionPool() {
        IntStream.range(0, 4).forEach(i -> {
            Connection connection = new Connection();
            connection.setName("Connection " + i);
            connections.add(connection);
        });
    }

    public static ConnectionPool getInstance() {

        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
        }
        return connectionPool;
    }
    public synchronized Connection getConnection()
    {
        if(!connections.isEmpty()){
            Connection con = connections.remove(connections.size() -1);
            connections.add(con);
            LOGGER.info("connections available!! "+connections.size());
            return con;
        }
        else {
            LOGGER.info("All connections are used!!");
            return null;

        }
    }
    public synchronized void releaseConnection(Connection connection) {
        connections.remove(connection);
        notifyAll();
    }
}
