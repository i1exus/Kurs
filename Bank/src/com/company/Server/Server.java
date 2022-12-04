package com.company.Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private final static int Port = 8999;

    public static void main(String[] args) {
        try (ServerSocket ServerSocket = new ServerSocket(Port)) {
            System.out.println("Сервер запущен");

            try {
                String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
                String username = "root";
                String password = "iLexus2002";
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                try (Connection conn = DriverManager.getConnection(url, username, password)) {

                    System.out.println("Connection to Store DB succesfull!");







                }
            } catch (Exception ex) {
                System.out.println("Connection failed...");

                System.out.println(ex);
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.exit(0);
        }
    }
}