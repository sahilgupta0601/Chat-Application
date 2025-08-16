package com.example.chat;

import java.awt.*;

import javax.swing.*;

public class Server extends JFrame {
    Server(){
        setLayout(null);

        

        setSize(450, 700);
        setLocation(200, 50);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Server();
    }
}
