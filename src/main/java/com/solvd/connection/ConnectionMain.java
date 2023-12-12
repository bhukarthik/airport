package com.solvd.connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ConnectionMain extends Thread {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(ConnectionMain.class);

    private String connName;

    public ConnectionMain(String connName) {
        this.connName = connName;
        LOGGER.info("Creating Thread:" + connName);
    }

    public void run() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = connectionPool.getConnection();
        int timer = 1000;
        while (!connection.getName().isEmpty() && timer <4000) {
            try {
                Thread.sleep(1000);
                connectionPool.releaseConnection(connection);
                timer += 1000;
                LOGGER.info("Release Connection "+connection.getName());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                connection = connectionPool.getConnection();
                LOGGER.info("Create Connection "+connection.getName());
            }
        }
    }
}
