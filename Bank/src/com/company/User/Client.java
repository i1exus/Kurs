package com.company.User;

import com.company.User.GUI.GUI;

import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private final static int Port = 8999;
    private final static String Host = "localhost";

    static public void main(String args[]) throws IOException {

        try (Socket socket = new Socket(Host, Port)) {
            DataOutputStream Writer = new DataOutputStream(socket.getOutputStream());
            DataInputStream Reader = new DataInputStream(socket.getInputStream());

            Window MyFrame = new GUI();
            ((GUI) MyFrame).GUI_AUTH();
            MyFrame.setVisible(true);


            while (socket.isConnected()) {

            }
            Writer.close();
            Reader.close();

        } catch (UnknownHostException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException e) {
            System.out.println("Сервер не запущен");
        } finally {
            System.exit(0);
        }


    }
}
