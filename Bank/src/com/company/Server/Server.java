package com.company.Server;

import java.sql.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final static int Port = 8999;
    public static void main(String[] args) {
        try (ServerSocket ServerSocket = new ServerSocket(Port)) {
            System.out.println("Сервер запущен");
            String ch="";
            dbWorker worker = new dbWorker();

            while (!ServerSocket.isClosed()) {
                Socket Client = ServerSocket.accept();

                DataOutputStream Writer = new DataOutputStream(Client.getOutputStream());
                DataInputStream Reader = new DataInputStream(Client.getInputStream());
                String message_ch = Reader.readUTF();

                switch (message_ch) {
                    case "1":{

                        break;}

                    default:{break;}
                }




                    Writer.writeUTF("3");
                    Writer.flush();
                }
            } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
}