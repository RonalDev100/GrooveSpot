package com.ronal.groovespot.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection conn;

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=GrooveSpot";
    private static final String USER = "sa";
    private static final String PASSWORD = "1234";

    private DbConnection() {}

    public static Connection getInstance() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return conn;
    }
}
