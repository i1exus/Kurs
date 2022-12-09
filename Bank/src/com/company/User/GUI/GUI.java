package com.company.User.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import static com.company.User.GUI.FileImageResize.resizeFile;

public class GUI extends Frame {
    //------------------------------------------------------------------------------------ПОЛЯ
    TextField textLogin = new TextField();
    TextField textPass = new TextField();
    TextField textLoginReg = new TextField();
    TextField textPassReg = new TextField();
    TextField textGroupReg = new TextField();
    TextField textPassReg2 = new TextField();
    TextField textSurname = new TextField();
    TextField textName = new TextField();
    TextField textPatr = new TextField();
    TextField textCardNum = new TextField();

    TextField textCardCVV = new TextField();
    //------------------------------------------------------------------------------------ТЕКСТА
    Label textloginacc = new Label("07360012@bsuir.by");
    Label textgroupacc = new Label("073601");
    Label textspec = new Label("ISIT(L)");
    Label textyear = new Label("2020");
    Label label1 = new Label(" Authorization ");
    Label label2 = new Label(" INTERNET BANKING ");
    Label label3 = new Label(" BSUIR ");
    Label labellogin = new Label(" Login ");
    Label labelpass = new Label(" Password ");
    Label labelnoacc = new Label("Don't have an account?");
    JLabel jl3 = new JLabel(new ImageIcon("/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/12_100229_1_79523.jpg"));
    Label label4 = new Label ("Registration");
    Label labelloginReg = new Label("Enter Login:");
    Label labelpassReg = new Label("Enter Password:");
    Label labelpassReg2 = new Label("Repeat Password:");
    Label labelgroup = new Label("Enter group:");
    Label labelprofile = new Label("PROFILE");
    Label labelprofilelogin = new Label("ACCOUNT: ");
    Label labelprofilegroup = new Label("GROUP: ");
    Label labelprofilespeciality = new Label("SPECIALITY: ");
    Label labelprofileyear = new Label("YEAR OF ADMISSION: ");
    Label menu = new Label("           IBB MENU");
    JLabel jlprofile = new JLabel(new ImageIcon("/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/ава.png"));
    Label labellogqr = new Label("07360012@bsuir.by");
    JLabel jlqr = new JLabel(new ImageIcon("/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/Unknown.jpeg"));
    Label labelnotifzero = new Label("No notifications");
    Label labelsurname = new Label("Surname:");
    Label labelname = new Label("Name:");
    Label labelpatronymic = new Label("Patronymic:");
    Label labelcardnum = new Label("Card Number:");
    Label labelcarddate  =new Label("Card Date:");
    Label labelcardcvv  =new Label("Card CVV:");
    Label labeldatebr  =new Label("Date of Birth:");
    //------------------------------------------------------------------------------------КНОПКИ
    JButton sing = new JButton("Sign In");;
    JButton Reg = new JButton("Registration");
    JButton RegAcc = new JButton("Registration account");;
    JButton backauth = new JButton("Go Back");;
    JButton exit = new JButton("Exit");;
    JButton ERIP = new JButton("USIS Payments");;
    JButton accountsettings = new JButton("Account Settings");;
    JButton paysettings = new JButton("Payment Settings");;
    JButton extract = new JButton("Extract");
    JButton bsuir_payments = new JButton("BSUIR Payments");
    JButton faq = new JButton("FAQ");
    JRadioButton flag1 = new JRadioButton("I agree to the processing of personal data");
    JButton notification = new JButton("Notifications");
    JButton backtoprofile = new JButton("Go Back");
    JButton backsaveaccset = new JButton("Save");
    JComboBox<String> box_1, box_2, box_3,box1card,box2card;
    static String[] box1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    static String[] box2 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static String[] box3 = new String[45];
    static String[] box1_card = {"22", "23", "24", "25", "26"};
    static String[] box2_card = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};


    //------------------------------------------------------------------------------------КНОПКИ
    public GUI(){
        class WindowClose extends WindowAdapter {

            public void windowClosing(WindowEvent we) {
                setVisible(false);
            }
        }
        setVisible(true);
        setLayout(null);
        setSize(360, 675);
        setTitle("IBB");
        setBackground(Color.white);
        addWindowListener(new WindowClose());
        sing.addActionListener(new ButtonSign());
        Reg.addActionListener(new ButtonReg());
        backauth.addActionListener(new ButtonBackToAuth());
        exit.addActionListener(new ButtonExit());
        faq.addActionListener(new Buttonfaq());
        bsuir_payments.addActionListener(new ButtonBsuirPay());
        backtoprofile.addActionListener(new ButtonBackP());
        notification.addActionListener(new ButtonNotif());
        accountsettings.addActionListener(new ButtonAccSet());
        backsaveaccset.addActionListener(new ButtonSaveAccSet());
        box1card = new JComboBox<>(box1_card);
        box2card = new JComboBox<>(box2_card);
        for (int year = 1960, i = 0; year <= 2004; year++, i++) {
            box3[i] = String.valueOf(year);
        }
        box_1 = new JComboBox<>(box1);
        box_2 = new JComboBox<>(box2);
        box_3 = new JComboBox<>(box3);
    }

    public void GUI_AUTH() throws IOException {

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
        labelpass.setBounds(150, 430, 240, 25);
        labelpass.setFont(new Font("Montserrat", Font.BOLD, 12));

        add(labelnoacc);
        labelnoacc.setForeground(new Color(0x504E4E));
        labelnoacc.setBounds(127, 540, 240, 25);
        labelnoacc.setFont(new Font("Montserrat", Font.BOLD, 10));


        resizeFile("/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/12_100229_1_79523.jpg",
                "/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/12_100229_1_79523.jpg",
                150, 180);
        add(jl3);
        jl3.setBounds(105, 115, 150, 180);

        add(textLogin);
        textLogin.setBounds(60, 400, 250, 20);

        add(textPass);
        textPass.setBounds(60, 460, 250, 20);

        add(sing);
        sing.setSize(255, 40);
        sing.setLocation(57, 500);

        add(Reg);
        Reg.setSize(255, 40);
        Reg.setLocation(57, 565);

        //------------------------------------------------------------------------------------НАЧАЛО АВТОРИЗАЦИИ


        //------------------------------------------------------------------------------------ЗАКРЫТИЕ

    }

    class ButtonSign implements ActionListener  {
        String l;
        String p;

        public void actionPerformed(ActionEvent event)  {
            if (true) {
                JOptionPane.showMessageDialog(null, "Signed In");
                label1.setVisible(false);
                labellogin.setVisible(false);
                labelpass.setVisible(false);
                labelnoacc.setVisible(false);
                jl3.setVisible(false);
                textLogin.setVisible(false);
                textPass.setVisible(false);
                sing.setVisible(false);
                Reg.setVisible(false);
                add(label2);
                label2.setForeground(new Color(0xFF0424B9));
                label2.setBounds(115, 55, 300, 25);
                label2.setFont(new Font("Montserrat", Font.BOLD, 12));
                label2.setVisible(true);
                add(label3);
                label3.setForeground(new Color(0xFF0424B9));
                label3.setBounds(160, 75, 240, 25);
                label3.setFont(new Font("Montserrat", Font.BOLD, 12));
                label3.setVisible(true);
                add(labelprofile);
                labelprofile.setForeground(new Color(0xFF0424B9));
                labelprofile.setBounds(157, 95, 240, 25);
                labelprofile.setFont(new Font("Montserrat", Font.BOLD, 12));
                labelprofile.setVisible(true);

                add(textloginacc);
                textloginacc.setForeground(new Color(0x504E4E));
                textloginacc.setBounds(240, 150, 100, 12);
                textloginacc.setFont(new Font("Montserrat", 0, 10));
                textloginacc.setVisible(true);

                add(textgroupacc);
                textgroupacc.setForeground(new Color(0x504E4E));
                textgroupacc.setBounds(220, 170, 100, 12);
                textgroupacc.setFont(new Font("Montserrat", 0, 10));
                textgroupacc.setVisible(true);

                add(textspec);
                textspec.setForeground(new Color(0x504E4E));
                textspec.setBounds(245, 190, 100, 12);
                textspec.setFont(new Font("Montserrat", 0, 10));
                textspec.setVisible(true);

                add(textyear);
                textyear.setForeground(new Color(0x504E4E));
                textyear.setBounds(300, 210, 100, 12);
                textyear.setFont(new Font("Montserrat", 0, 10));
                textyear.setVisible(true);

                try {
                    resizeFile("/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/ава.png",
                            "/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/ава.png",
                            115, 115);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                add(jlprofile);
                jlprofile.setBounds(35, 145, 115, 115);
                jlprofile.setVisible(true);


                add(labelprofilelogin);
                labelprofilelogin.setForeground(new Color(0xFF0424B9));
                labelprofilelogin.setBounds(165, 150, 70, 13);
                labelprofilelogin.setFont(new Font("Montserrat", Font.BOLD, 12));
                labelprofilelogin.setVisible(true);

                add(labelprofilegroup);
                labelprofilegroup.setForeground(new Color(0xFF0424B9));
                labelprofilegroup.setBounds(165, 170, 50, 13);
                labelprofilegroup.setFont(new Font("Montserrat", Font.BOLD, 12));
                labelprofilegroup.setVisible(true);

                add(labelprofilespeciality);
                labelprofilespeciality.setForeground(new Color(0xFF0424B9));
                labelprofilespeciality.setBounds(165, 190, 240, 13);
                labelprofilespeciality.setFont(new Font("Montserrat", Font.BOLD, 12));
                labelprofilespeciality.setVisible(true);

                add(labelprofileyear);
                labelprofileyear.setForeground(new Color(0xFF0424B9));
                labelprofileyear.setBounds(165, 210, 240, 13);
                labelprofileyear.setFont(new Font("Montserrat", Font.BOLD, 12));
                labelprofileyear.setVisible(true);

                add(notification);
                notification.setSize(170, 40);
                notification.setLocation(162, 223);
                notification.setVisible(true);

                add(faq);
                faq.setSize(255, 35);
                faq.setLocation(57, 560);
                faq.setVisible(true);

                add(accountsettings);
                accountsettings.setSize(255, 35);
                accountsettings.setLocation(57, 520);
                accountsettings.setVisible(true);

                add(paysettings);
                paysettings.setSize(255, 35);
                paysettings.setLocation(57, 480);
                paysettings.setVisible(true);

                add(extract);
                extract.setSize(255, 35);
                extract.setLocation(57, 440);
                extract.setVisible(true);

                add(ERIP);
                ERIP.setSize(255, 35);
                ERIP.setLocation(57, 400);
                ERIP.setVisible(true);

                add(bsuir_payments);
                bsuir_payments.setSize(255, 35);
                bsuir_payments.setLocation(57, 360);
                bsuir_payments.setVisible(true);

                add(exit);
                exit.setSize(255, 35);
                exit.setLocation(57, 600);
                exit.setVisible(true);

                add(menu);
                menu.setForeground(new Color(0xFFFFFF));
                menu.setBounds(35, 300, 295, 28);
                menu.setFont(new Font("Montserrat", Font.BOLD, 24));
                menu.setBackground(new Color(0xFF0424B9));
                menu.setVisible(true);
            }
            else {JOptionPane.showMessageDialog(null, "Wrong login or password");}

            textLogin.setText("");
            textPass.setText("");

        }
    }

    class ButtonReg implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label1.setVisible(false);
            label2.setVisible(true);
            label3.setVisible(true);
            labellogin.setVisible(false);
            labelpass.setVisible(false);
            labelnoacc.setVisible(false);
            jl3.setVisible(true);
            textLogin.setVisible(false);
            textPass.setVisible(false);
            sing.setVisible(false);
            Reg.setVisible(false);
            add(label4);
            label4.setForeground(new Color(0xFF0424B9));
            label4.setBounds(116, 315, 165, 25);
            label4.setFont(new Font("Montserrat", Font.BOLD, 20));
            label4.setVisible(true);
            add(RegAcc);
            RegAcc.setSize(255, 35);
            RegAcc.setLocation(57, 555);
            RegAcc.setVisible(true);
            add(backauth);
            backauth.setSize(255, 35);
            backauth.setLocation(57, 595);
            backauth.setVisible(true);

            add(textLoginReg);
            textLoginReg.setBounds(125, 403, 195, 20);
            textLoginReg.setVisible(true);

            add(textPassReg);
            textPassReg.setBounds(125, 431, 195, 20);
            textPassReg.setVisible(true);

            add(textPassReg2);
            textPassReg2.setBounds(125, 459, 195, 20);
            textPassReg2.setVisible(true);

            add(textGroupReg);
            textGroupReg.setBounds(125, 487, 195, 20);
            textGroupReg.setVisible(true);

            add(labelloginReg);
            labelloginReg.setForeground(new Color(0xFF0424B9));
            labelloginReg.setBounds(30, 403, 95, 20);
            labelloginReg.setFont(new Font("Montserrat", Font.BOLD, 10));
            labelloginReg.setVisible(true);

            add(labelpassReg);
            labelpassReg.setForeground(new Color(0xFF0424B9));
            labelpassReg.setBounds(30, 431, 95, 20);
            labelpassReg.setFont(new Font("Montserrat", Font.BOLD, 10));
            labelpassReg.setVisible(true);

            add(labelpassReg2);
            labelpassReg2.setForeground(new Color(0xFF0424B9));
            labelpassReg2.setBounds(30, 459, 95, 20);
            labelpassReg2.setFont(new Font("Montserrat", Font.BOLD, 10));
            labelpassReg2.setVisible(true);

            add(labelgroup);
            labelgroup.setForeground(new Color(0xFF0424B9));
            labelgroup.setBounds(30, 487, 95, 20);
            labelgroup.setFont(new Font("Montserrat", Font.BOLD, 10));
            labelgroup.setVisible(true);

            add(flag1);
            flag1.setSize(300, 20);
            flag1.setLocation(23, 520);
            flag1.setVisible(true);
        }
    }

    class ButtonBackToAuth implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            labellogin.setVisible(true);
            labelpass.setVisible(true);
            labelnoacc.setVisible(true);
            jl3.setVisible(true);
            textLogin.setVisible(true);
            textPass.setVisible(true);
            sing.setVisible(true);
            Reg.setVisible(true);
            label4.setVisible(false);
            RegAcc.setVisible(false);
            backauth.setVisible(false);
            textLoginReg.setVisible(false);
            textPassReg.setVisible(false);
            textPassReg2.setVisible(false);
            textGroupReg.setVisible(false);
            labelloginReg.setVisible(false);
            labelloginReg.setVisible(false);
            labelpassReg.setVisible(false);
            labelpassReg2.setVisible(false);
            labelgroup.setVisible(false);
            flag1.setVisible(false);
            textLoginReg.setText("");
            textPassReg.setText("");
            textPassReg2.setText("");
            textGroupReg.setText("");
            flag1.setSelected(false);
        }
    }
    class ButtonExit implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            textloginacc.setVisible(false);
            textgroupacc.setVisible(false);
            textspec.setVisible(false);
            textyear.setVisible(false);
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            labellogin.setVisible(true);
            labelpass.setVisible(true);
            labelnoacc.setVisible(true);
            jl3.setVisible(true);
            textLogin.setVisible(true);
            textPass.setVisible(true);
            sing.setVisible(true);
            Reg.setVisible(true);
            label4.setVisible(false);
            RegAcc.setVisible(false);
            backauth.setVisible(false);
            textLoginReg.setVisible(false);
            textPassReg.setVisible(false);
            textPassReg2.setVisible(false);
            textGroupReg.setVisible(false);
            labelloginReg.setVisible(false);
            labelloginReg.setVisible(false);
            labelpassReg.setVisible(false);
            labelpassReg2.setVisible(false);
            labelgroup.setVisible(false);
            flag1.setVisible(false);
            exit.setVisible(false);
            labelprofile.setVisible(false);
            labelprofile.setVisible(false);
            jlprofile.setVisible(false);
            labelprofilelogin.setVisible(false);
            labelprofilegroup.setVisible(false);
            labelprofilespeciality.setVisible(false);
            labelprofileyear.setVisible(false);
            notification.setVisible(false);
            faq.setVisible(false);
            accountsettings.setVisible(false);
            paysettings.setVisible(false);
            extract.setVisible(false);
            ERIP.setVisible(false);
            bsuir_payments.setVisible(false);
            exit.setVisible(false);
            menu.setVisible(false);
        }
    }
    class Buttonfaq implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, "For all questions, write to @iLexusss");
        }
    }
    class ButtonSaveAccSet implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, "Changes saved");
        }
    }

    class ButtonAccSet implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            notification.setVisible(false);
            faq.setVisible(false);
            accountsettings.setVisible(false);
            paysettings.setVisible(false);
            extract.setVisible(false);
            ERIP.setVisible(false);
            bsuir_payments.setVisible(false);
            exit.setVisible(false);
            add(label2);
            label2.setForeground(new Color(0xFF0424B9));
            label2.setBounds(115, 55, 300, 25);
            label2.setFont(new Font("Montserrat", Font.BOLD, 12));
            label2.setVisible(true);
            add(label3);
            label3.setForeground(new Color(0xFF0424B9));
            label3.setBounds(160, 75, 240, 25);
            label3.setFont(new Font("Montserrat", Font.BOLD, 12));
            label3.setVisible(true);
            add(labelprofile);
            labelprofile.setForeground(new Color(0xFF0424B9));
            labelprofile.setBounds(157, 95, 240, 25);
            labelprofile.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofile.setVisible(true);

            try {
                resizeFile("/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/ава.png",
                        "/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/ава.png",
                        115, 115);
            } catch (IOException e) {
                e.printStackTrace();
            }
            add(jlprofile);
            jlprofile.setBounds(35, 145, 115, 115);
            jlprofile.setVisible(true);

            add(labelprofilelogin);
            labelprofilelogin.setForeground(new Color(0xFF0424B9));
            labelprofilelogin.setBounds(165, 150, 70, 13);
            labelprofilelogin.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofilelogin.setVisible(true);

            add(labelprofilegroup);
            labelprofilegroup.setForeground(new Color(0xFF0424B9));
            labelprofilegroup.setBounds(165, 170, 50, 13);
            labelprofilegroup.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofilegroup.setVisible(true);

            add(labelprofilespeciality);
            labelprofilespeciality.setForeground(new Color(0xFF0424B9));
            labelprofilespeciality.setBounds(165, 190, 240, 13);
            labelprofilespeciality.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofilespeciality.setVisible(true);

            add(labelprofileyear);
            labelprofileyear.setForeground(new Color(0xFF0424B9));
            labelprofileyear.setBounds(165, 210, 240, 13);
            labelprofileyear.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofileyear.setVisible(true);

            add(labelsurname);
            labelsurname.setForeground(new Color(0xFF0424B9));
            labelsurname.setBounds(35, 340, 80, 16);
            labelsurname.setFont(new Font("Montserrat", Font.BOLD, 14));
            labelsurname.setVisible(true);

            add(textSurname);
            textSurname.setBounds(140, 340, 190, 20);
            textSurname.setVisible(true);

            add(labelname);
            labelname.setForeground(new Color(0xFF0424B9));
            labelname.setBounds(35, 365, 55, 16);
            labelname.setFont(new Font("Montserrat", Font.BOLD, 14));
            labelname.setVisible(true);

            add(textName);
            textName.setBounds(140, 365, 190, 20);
            textName.setVisible(true);

            add(labelpatronymic);
            labelpatronymic.setForeground(new Color(0xFF0424B9));
            labelpatronymic.setBounds(35, 390, 90, 16);
            labelpatronymic.setFont(new Font("Montserrat", Font.BOLD, 14));
            labelpatronymic.setVisible(true);

            add(textPatr);
            textPatr.setBounds(140, 390, 190, 20);
            textPatr.setVisible(true);

            add(labelcardnum);
            labelcardnum.setForeground(new Color(0xFF0424B9));
            labelcardnum.setBounds(35, 415, 100, 16);
            labelcardnum.setFont(new Font("Montserrat", Font.BOLD, 14));
            labelcardnum.setVisible(true);

            add(textCardNum);
            textCardNum.setBounds(140, 415, 190, 20);
            textCardNum.setVisible(true);

            add(labelcarddate);
            labelcarddate.setForeground(new Color(0xFF0424B9));
            labelcarddate.setBounds(35, 440, 85, 16);
            labelcarddate.setFont(new Font("Montserrat", Font.BOLD, 14));
            labelcarddate.setVisible(true);


            add(box1card);
            box1card.setSize(100, 22);
            box1card.setLocation(235, 440);
            add(box2card);
            box2card.setSize(100, 22);
            box2card.setLocation(135, 440);
            box1card.setVisible(true);
            box2card.setVisible(true);

            add(labelcardcvv);
            labelcardcvv.setForeground(new Color(0xFF0424B9));
            labelcardcvv.setBounds(35, 465, 100, 16);
            labelcardcvv.setFont(new Font("Montserrat", Font.BOLD, 14));
            labelcardcvv.setVisible(true);

            add(textCardCVV);
            textCardCVV.setBounds(140, 465, 190, 20);
            textCardCVV.setVisible(true);

            add(labeldatebr);
            labeldatebr.setForeground(new Color(0xFF0424B9));
            labeldatebr.setBounds(35, 490, 100, 16);
            labeldatebr.setFont(new Font("Montserrat", Font.BOLD, 14));
            labeldatebr.setVisible(true);


            add(box_1);
            box_1.setSize(75, 25);
            box_1.setLocation(35, 515);
            add(box_2);
            box_2.setSize(115, 25);
            box_2.setLocation(115, 515);
            add(box_3);
            box_3.setSize(100, 25);
            box_3.setLocation(230, 515);
            box_1.setVisible(true);
            box_2.setVisible(true);
            box_3.setVisible(true);

            add(backsaveaccset);
            backsaveaccset.setSize(255, 35);
            backsaveaccset.setLocation(57, 560);
            backsaveaccset.setVisible(true);

            add(backtoprofile);
            backtoprofile.setSize(255, 35);
            backtoprofile.setLocation(57, 600);
            backtoprofile.setVisible(true);
        }
    }

    class ButtonNotif implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            labellogin.setVisible(false);
            labelpass.setVisible(false);
            labelnoacc.setVisible(false);
            jl3.setVisible(false);
            textLogin.setVisible(false);
            textPass.setVisible(false);
            sing.setVisible(false);
            Reg.setVisible(false);
            label4.setVisible(false);
            RegAcc.setVisible(false);
            backauth.setVisible(false);
            textLoginReg.setVisible(false);
            textPassReg.setVisible(false);
            textPassReg2.setVisible(false);
            textGroupReg.setVisible(false);
            labelloginReg.setVisible(false);
            labelloginReg.setVisible(false);
            labelpassReg.setVisible(false);
            labelpassReg2.setVisible(false);
            labelgroup.setVisible(false);
            flag1.setVisible(false);
            exit.setVisible(false);
            labelprofile.setVisible(false);
            labelprofile.setVisible(false);
            jlprofile.setVisible(false);
            labelprofilelogin.setVisible(false);
            labelprofilegroup.setVisible(false);
            labelprofilespeciality.setVisible(false);
            labelprofileyear.setVisible(false);
            notification.setVisible(false);
            faq.setVisible(false);
            accountsettings.setVisible(false);
            paysettings.setVisible(false);
            extract.setVisible(false);
            ERIP.setVisible(false);
            bsuir_payments.setVisible(false);
            exit.setVisible(false);
            menu.setVisible(false);
            textloginacc.setVisible(false);
            textgroupacc.setVisible(false);
            textspec.setVisible(false);
            textyear.setVisible(false);
            add(labelnotifzero);
            labelnotifzero.setForeground(new Color(0x504E4E));
            labelnotifzero.setBounds(120, 320, 150, 20);
            labelnotifzero.setFont(new Font("Montserrat", Font.BOLD, 16));
            labelnotifzero.setVisible(true);

            add(backtoprofile);
            backtoprofile.setSize(255, 35);
            backtoprofile.setLocation(57, 600);
            backtoprofile.setVisible(true);
        }
    }

    class ButtonBsuirPay implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            textloginacc.setVisible(false);
            textgroupacc.setVisible(false);
            textspec.setVisible(false);
            textyear.setVisible(false);
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            labellogin.setVisible(false);
            labelpass.setVisible(false);
            labelnoacc.setVisible(false);
            jl3.setVisible(false);
            textLogin.setVisible(false);
            textPass.setVisible(false);
            sing.setVisible(false);
            Reg.setVisible(false);
            label4.setVisible(false);
            RegAcc.setVisible(false);
            backauth.setVisible(false);
            textLoginReg.setVisible(false);
            textPassReg.setVisible(false);
            textPassReg2.setVisible(false);
            textGroupReg.setVisible(false);
            labelloginReg.setVisible(false);
            labelloginReg.setVisible(false);
            labelpassReg.setVisible(false);
            labelpassReg2.setVisible(false);
            labelgroup.setVisible(false);
            flag1.setVisible(false);
            exit.setVisible(false);
            labelprofile.setVisible(false);
            labelprofile.setVisible(false);
            jlprofile.setVisible(false);
            labelprofilelogin.setVisible(false);
            labelprofilegroup.setVisible(false);
            labelprofilespeciality.setVisible(false);
            labelprofileyear.setVisible(false);
            notification.setVisible(false);
            faq.setVisible(false);
            accountsettings.setVisible(false);
            paysettings.setVisible(false);
            extract.setVisible(false);
            ERIP.setVisible(false);
            bsuir_payments.setVisible(false);
            exit.setVisible(false);
            menu.setVisible(false);

            textloginacc.setVisible(false);
            textgroupacc.setVisible(false);
            textspec.setVisible(false);
            textyear.setVisible(false);
            try {
                resizeFile("/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/Unknown.jpeg",
                        "/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/Unknown.jpeg",
                        300, 300);
            } catch (IOException e) {
                e.printStackTrace();
            }
            add(jlqr);
            jlqr.setBounds(30,170 , 300, 300);
            jlqr.setVisible(true);
            add(labellogqr);
            labellogqr.setForeground(new Color(0xFFFFFF));
            labellogqr.setBounds(82, 485, 190, 20);
            labellogqr.setFont(new Font("Montserrat", Font.BOLD, 18));
            labellogqr.setBackground(new Color(0x000000));
            labellogqr.setVisible(true);

            add(backtoprofile);
            backtoprofile.setSize(255, 35);
            backtoprofile.setLocation(57, 600);
            backtoprofile.setVisible(true);
        }
    }

    class ButtonBackP implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            textSurname.setVisible(false);
            textName.setVisible(false);
            box1card.setVisible(false);
            box2card.setVisible(false);
            textPatr.setVisible(false);
            textCardCVV.setVisible(false);
            textCardNum.setVisible(false);
            backsaveaccset.setVisible(false);
            box_1.setVisible(false);
            box_2.setVisible(false);
            box_3.setVisible(false);
            labelcardcvv.setVisible(false);
            labelcarddate.setVisible(false);
            labelcardnum.setVisible(false);
            labeldatebr.setVisible(false);
            labelpatronymic.setVisible(false);
            labelname.setVisible(false);
            labelsurname.setVisible(false);
            labelnotifzero.setVisible(false);
            label1.setVisible(false);
            labellogin.setVisible(false);
            labelpass.setVisible(false);
            labelnoacc.setVisible(false);
            jl3.setVisible(false);
            textLogin.setVisible(false);
            textPass.setVisible(false);
            sing.setVisible(false);
            Reg.setVisible(false);
            add(label2);
            label2.setForeground(new Color(0xFF0424B9));
            label2.setBounds(115, 55, 300, 25);
            label2.setFont(new Font("Montserrat", Font.BOLD, 12));
            label2.setVisible(true);
            add(label3);
            label3.setForeground(new Color(0xFF0424B9));
            label3.setBounds(160, 75, 240, 25);
            label3.setFont(new Font("Montserrat", Font.BOLD, 12));
            label3.setVisible(true);
            add(labelprofile);
            labelprofile.setForeground(new Color(0xFF0424B9));
            labelprofile.setBounds(157, 95, 240, 25);
            labelprofile.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofile.setVisible(true);
            add(textloginacc);
            textloginacc.setForeground(new Color(0x504E4E));
            textloginacc.setBounds(240, 150, 100, 12);
            textloginacc.setFont(new Font("Montserrat", 0, 10));
            textloginacc.setVisible(true);

            add(textgroupacc);
            textgroupacc.setForeground(new Color(0x504E4E));
            textgroupacc.setBounds(220, 170, 100, 12);
            textgroupacc.setFont(new Font("Montserrat", 0, 10));
            textgroupacc.setVisible(true);

            add(textspec);
            textspec.setForeground(new Color(0x504E4E));
            textspec.setBounds(245, 190, 100, 12);
            textspec.setFont(new Font("Montserrat", 0, 10));
            textspec.setVisible(true);

            add(textyear);
            textyear.setForeground(new Color(0x504E4E));
            textyear.setBounds(300, 210, 100, 12);
            textyear.setFont(new Font("Montserrat", 0, 10));
            textyear.setVisible(true);
            try {
                resizeFile("/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/ава.png",
                        "/Users/ilexus/IdeaProjects/Bank/src/com/company/User/GUI/ава.png",
                        115, 115);
            } catch (IOException e) {
                e.printStackTrace();
            }
            add(jlprofile);
            jlprofile.setBounds(35, 145, 115, 115);
            jlprofile.setVisible(true);

            add(labelprofilelogin);
            labelprofilelogin.setForeground(new Color(0xFF0424B9));
            labelprofilelogin.setBounds(165, 150, 70, 13);
            labelprofilelogin.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofilelogin.setVisible(true);

            add(labelprofilegroup);
            labelprofilegroup.setForeground(new Color(0xFF0424B9));
            labelprofilegroup.setBounds(165, 170, 50, 13);
            labelprofilegroup.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofilegroup.setVisible(true);

            add(labelprofilespeciality);
            labelprofilespeciality.setForeground(new Color(0xFF0424B9));
            labelprofilespeciality.setBounds(165, 190, 240, 13);
            labelprofilespeciality.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofilespeciality.setVisible(true);

            add(labelprofileyear);
            labelprofileyear.setForeground(new Color(0xFF0424B9));
            labelprofileyear.setBounds(165, 210, 240, 13);
            labelprofileyear.setFont(new Font("Montserrat", Font.BOLD, 12));
            labelprofileyear.setVisible(true);

            add(notification);
            notification.setSize(170, 40);
            notification.setLocation(162, 223);
            notification.setVisible(true);

            add(faq);
            faq.setSize(255, 35);
            faq.setLocation(57, 560);
            faq.setVisible(true);

            add(accountsettings);
            accountsettings.setSize(255, 35);
            accountsettings.setLocation(57, 520);
            accountsettings.setVisible(true);

            add(paysettings);
            paysettings.setSize(255, 35);
            paysettings.setLocation(57, 480);
            paysettings.setVisible(true);

            add(extract);
            extract.setSize(255, 35);
            extract.setLocation(57, 440);
            extract.setVisible(true);

            add(ERIP);
            ERIP.setSize(255, 35);
            ERIP.setLocation(57, 400);
            ERIP.setVisible(true);

            add(bsuir_payments);
            bsuir_payments.setSize(255, 35);
            bsuir_payments.setLocation(57, 360);
            bsuir_payments.setVisible(true);

            add(exit);
            exit.setSize(255, 35);
            exit.setLocation(57, 600);
            exit.setVisible(true);

            add(menu);
            menu.setForeground(new Color(0xFFFFFF));
            menu.setBounds(35, 300, 295, 28);
            menu.setFont(new Font("Montserrat", Font.BOLD, 24));
            menu.setBackground(new Color(0xFF0424B9));
            menu.setVisible(true);
            backtoprofile.setVisible(false);
            jlqr.setVisible(false);
            labellogqr.setVisible(false);
        }
        }
}

