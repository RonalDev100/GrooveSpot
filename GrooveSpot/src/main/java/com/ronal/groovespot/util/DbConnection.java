package com.ronal.groovespot.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection conn;

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=GrooveSpot;encrypt=false";
    private static final String USER = "sa";
    private static final String PASSWORD = "123";

    private DbConnection() {}

    public static void conectar() {
           try {
               if (conn == null || conn.isClosed()) {
                   conn = DriverManager.getConnection(URL, USER, PASSWORD);
                   System.out.println("✅ Conexión establecida correctamente.");
               }
           } catch (SQLException e) {
               System.err.println("❌ Error al conectar con la base de datos: " + e.getMessage());
           }
       }

       public static Connection getConexion() {
           return conn;
       }

    public static Connection getConn() {
        return conn;
    }
       
       
    }



