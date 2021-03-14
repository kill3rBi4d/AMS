package com.aiens.ai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Window extends JFrame {
    LoginScreenTopPanel loginScreenTopPanel = new LoginScreenTopPanel();
    LoginScreenPanel loginScreenPanel = new LoginScreenPanel();

    private ImageIcon logo;

    Window(){
        logo = new ImageIcon("resources/images/logo2.png");

        this.setSize(1280, 720);
        this.setUndecorated(true);
        this.setLayout(new BorderLayout());
        this.add(loginScreenPanel, BorderLayout.CENTER);
        this.add(loginScreenTopPanel, BorderLayout.NORTH);
        this.setIconImage(logo.getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
