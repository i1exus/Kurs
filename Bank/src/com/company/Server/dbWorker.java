package com.company.Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbWorker {
    private final String url = "jdbc:mysql://127.0.0.1:3306/?user=root/API";
    private final String username = "root";
    private final String password = "iLexus2002";
    private Connection conn;

    public dbWorker() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                System.out.println("Connection to Store DB succesfull!");


            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
