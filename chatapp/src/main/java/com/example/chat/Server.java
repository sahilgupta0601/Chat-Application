package com.example.chat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Server extends JFrame implements ActionListener{
    Server(){
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        add(p1);


        ImageIcon i1 = new ImageIcon(getClass().getResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);  

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me){
                System.exit(0);
            }
        });

        ImageIcon i4 = new ImageIcon(getClass().getResource("icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);

        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50);
        p1.add(profile);

        ImageIcon i7 = new ImageIcon(getClass().getResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);

        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30);
        p1.add(video);

        ImageIcon i10 = new ImageIcon(getClass().getResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);

        JLabel phone = new JLabel(i12);
        phone.setBounds(360, 20, 30, 30);
        p1.add(phone);

        ImageIcon i13 = new ImageIcon(getClass().getResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);

        JLabel name = new JLabel("Sahil");
        name.setBounds(110, 15, 100, 18);
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setForeground(Color.WHITE);
        p1.add(name);

        JLabel status = new JLabel("Active now");
        status.setBounds(110, 40, 100, 18);
        status.setFont(new Font("Raleway", Font.ITALIC, 14));
        status.setForeground(Color.WHITE);
        p1.add(status);

        JLabel morevert = new JLabel(i15);
        morevert.setBounds(420, 20, 10, 25);
        p1.add(morevert);

        JPanel area = new JPanel();
        area.setBounds(5, 75, 440, 570);
        add(area);

        JTextField message = new JTextField();
        message.setBounds(5, 655, 310, 40);
        message.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(message);

        JButton sent = new JButton("Send");
        sent.setBounds(320, 655, 123, 40);
        sent.setBackground(new Color(7, 94, 84));
        sent.setFont(new Font("Raleway", Font.PLAIN, 18));
        sent.setForeground(Color.WHITE);
        add(sent);

        setSize(450, 700);
        setLocation(200, 50);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true)    ;
        setVisible(true);
    }
    public static void main(String[] args) {
        new Server();
    }

    @Override
    public void actionPerformed(ActionEvent ae){

    }
}
