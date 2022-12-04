package com.company.Client.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.JOptionPane;

import static com.company.Client.GUI.FileImageResize.resizeFile;

public class GUI extends Frame {

    public GUI() throws IOException {
       

        class WindowClose extends WindowAdapter {

            public void windowClosing(WindowEvent we) {
                setVisible(false);
            }
        }

        setVisible(true);
        setLayout(null);
        setSize(360, 675);
        setTitle("Интернет-Банкинг");
        setBackground(Color.white);

        //------------------------------------------------------------------------------------ТЕКСТА
        Label label1 = new Label(" Authorization ");
        Label label2 = new Label(" INTERNET BANKING ");
        Label label3 = new Label(" BSUIR ");
        Label labellogin = new Label(" Login ");
        Label labelpass = new Label(" Password ");
        Label labelnoacc = new Label("Don't have an account?");
        //------------------------------------------------------------------------------------ПОЛЯ
        TextField textLogin= new TextField();
        TextField textPass= new TextField();
        //------------------------------------------------------------------------------------КНОПКИ
        JButton sing ;
        sing = new JButton("Sign In");
        JButton Reg ;
        Reg = new JButton("Registration");
        //------------------------------------------------------------------------------------КНОПКИ

        add(label1);
        label1.setForeground(new Color(0xFF0424B9));
        label1.setBounds(102, 315, 165, 25);
        label1.setFont(new Font("Montserrat", Font.BOLD, 20));

        add(label2);
        label2.setForeground(new Color(0xFF0424B9));
        label2.setBounds(115, 55, 300, 25);
        label2.setFont(new Font("Montserrat", Font.BOLD, 12));

        add(label3);
        label3.setForeground(new Color(0xFF0424B9));
        label3.setBounds(160, 75, 240, 25);
        label3.setFont(new Font("Montserrat", Font.BOLD, 12));

        add(labellogin);
        labellogin.setForeground(new Color(0xFF0424B9));
        labellogin.setBounds(160, 375, 240, 25);
        labellogin.setFont(new Font("Montserrat", Font.BOLD, 12));

        add(labelpass);
        labelpass.setForeground(new Color(0xFF0424B9));
        labelpass.setBounds(150, 445, 240, 25);
        labelpass.setFont(new Font("Montserrat", Font.BOLD, 12));

        add(labelnoacc);
        labelnoacc.setForeground(new Color(0x504E4E));
        labelnoacc.setBounds(127, 540, 240, 25);
        labelnoacc.setFont(new Font("Montserrat", Font.BOLD, 10));



        resizeFile("/Users/ilexus/IdeaProjects/Bank/src/com/company/Client/GUI/12_100229_1_79523.jpg",
                "/Users/ilexus/IdeaProjects/Bank/src/com/company/Client/GUI/12_100229_1_79523.jpg",
                150, 180);
        JLabel jl3=new JLabel(new ImageIcon("/Users/ilexus/IdeaProjects/Bank/src/com/company/Client/GUI/12_100229_1_79523.jpg"));
        add(jl3);
        jl3.setBounds(105, 115, 150, 180);

        add(textLogin);
        textLogin.setBounds(60, 400, 250, 20);

        add(textPass);
        textPass.setBounds(60, 470, 250, 20);

        add(sing);
        sing.setSize(255, 40);
        sing.setLocation(57, 500);

        add(Reg);
        Reg.setSize(255, 40);
        Reg.setLocation(57, 565);

        //------------------------------------------------------------------------------------НАЧАЛО АВТОРИЗАЦИИ


        //------------------------------------------------------------------------------------ЗАКРЫТИЕ
        addWindowListener(new WindowClose());
    }




    static public void main(String args[]) throws IOException {
        Window MyFrame = new GUI();
        MyFrame.setVisible(true);
    }
}

