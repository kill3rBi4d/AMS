package com.aiens.ai;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginScreenContents extends JPanel {
    private JPanel content, logoHandler, inputHandler, logoUnderLine, inputUnderLine1, inputUnderLine2,nameAndPasswordHandler, btnhandler, btn;
    private JLabel logoTitle, titleBOld, icon, btnText, logoHeader;
    private ImageIcon logo, helpIcon;
    private JTextField nameField;
    private JPasswordField passwordField;

    LoginScreenContents(){
        logo = new ImageIcon("resources/images/logo6.png");
        helpIcon = new ImageIcon("resources/images/helpIcon.png");

        logoHeader = new JLabel(new ImageIcon("resources/images/logoTitle.png"));
        logoHeader.setBounds(50, 160, 290, 50);
//        logoHeader.setOpaque(true);

        icon = new JLabel();
        icon.setIcon(helpIcon);
        icon.setBounds(310, 5, 40, 30);
        icon.setHorizontalAlignment(JLabel.CENTER);
        icon.setVerticalAlignment(JLabel.CENTER);
        icon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        icon.setToolTipText("Get help if you're having problem with signing in.");

        nameField = new JTextField("Name");
        nameField.setBounds(60, 5, 240, 30);
        nameField.setBackground(new Color(0, 0, 0, 0));
        nameField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 0));
        nameField.setFont(new Font("Monospace", Font.PLAIN, 16));
        nameField.setForeground(new Color(255, 255, 255, 150));
        nameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (nameField.getText().equals("Name")){
                    nameField.setText(" ");
                }
            }
        });


        passwordField = new JPasswordField("Password");
        passwordField.setBounds(60, 47, 280, 30);
        passwordField.setBackground(new Color(0, 0, 0, 0));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 0));
        passwordField.setFont(new Font("Monospace", Font.PLAIN, 16));
        passwordField.setForeground(new Color(255, 255, 255, 150));
        passwordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (passwordField.getText().equals("Password")){
                    passwordField.setText(" ");
                }
            }
        });

        btnText = new JLabel("Sign In");
        btnText.setForeground(new Color(255, 255, 255, 160));
        btnText.setFont(new Font("Monospace", Font.BOLD, 16));
        btnText.setHorizontalAlignment(JLabel.CENTER);

        titleBOld = new JLabel("Aiens");
        titleBOld.setFont(new Font("Tahoma", Font.BOLD, 20));
        titleBOld.setForeground(new Color(0xCC6666));

        logoTitle = new JLabel( new ImageIcon());
        logoTitle.setIcon(logo);
        logoTitle.setVerticalTextPosition(JLabel.BOTTOM);
        logoTitle.setHorizontalTextPosition(JLabel.CENTER);
        logoTitle.setIconTextGap(5);
        logoTitle.setFont(new Font("Monospace", Font.BOLD, 20));
        logoTitle.setBackground(new Color(0, 0, 0, 0));
        logoTitle.setForeground(new Color(255, 255, 255, 160));
        logoTitle.setBounds(0, 0, 400, 200);
        logoTitle.add(logoHeader);
        logoTitle.setOpaque(true);
        logoTitle.setLayout(null);
        logoTitle.setHorizontalAlignment(JLabel.CENTER);


        inputUnderLine1 = new JPanel();
        inputUnderLine1.setBounds(60, 35, 280, 1);
        inputUnderLine1.setBackground(new Color(255, 255, 255, 80));

        inputUnderLine2 = new JPanel();
        inputUnderLine2.setBounds(60, 77, 280, 1);
        inputUnderLine2.setBackground(new Color(255, 255, 255, 90));

        logoUnderLine = new JPanel();
        logoUnderLine.setBounds(90, 195, 220, 2);
        logoUnderLine.setBackground(new Color(255, 255, 255, 30));

        nameAndPasswordHandler = new JPanel();
        nameAndPasswordHandler.setPreferredSize(new Dimension(400, 80));
        nameAndPasswordHandler.setBackground(new Color(0, 0, 0, 0));
        nameAndPasswordHandler.add(inputUnderLine1);
        nameAndPasswordHandler.add(inputUnderLine2);
        nameAndPasswordHandler.add(nameField);
        nameAndPasswordHandler.add(new JLabel("Help"));
        nameAndPasswordHandler.add(passwordField);
        nameAndPasswordHandler.add(icon);
        nameAndPasswordHandler.setLayout(null);

        btn = new JPanel();
        btn.setBounds(60, 0 , 280, 40);
        btn.setBackground(new Color(0xCC6666));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setLayout(new BorderLayout());
        btn.add(btnText, BorderLayout.CENTER);
        btn.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 40), 1));
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (btn.getBackground().equals(new Color(0xCC6666))){
                    btn.setBackground(new Color(0xAC6464));
                }else {
                    btn.setBackground(new Color(0xCC6666));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (btn.getBackground().equals(new Color(0xAC6464))){
                    btn.setBackground(new Color(0xCC6666));
                }
            }
        });

        btnhandler = new JPanel();
        btnhandler.setPreferredSize(new Dimension(400, 45));
        btnhandler.setBackground(new Color(0, 0, 0, 0));
        btnhandler.add(btn);
        btnhandler.setLayout(null);


        logoHandler = new JPanel();
        logoHandler.setPreferredSize(new Dimension(400, 200));
        logoHandler.setLayout(null);
        logoHandler.add(logoTitle);
        logoHandler.setBackground(new Color(0, 0, 0, 0));


        inputHandler = new JPanel();
        inputHandler.setPreferredSize(new Dimension(400, 200));
        inputHandler.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        inputHandler.setBackground(new Color(0,0, 0, 0));
        inputHandler.add(nameAndPasswordHandler);
        inputHandler.add(btnhandler);

        content = new JPanel();
        content.setPreferredSize(new Dimension(300, 500));
        content.setBackground(new Color(0, 0, 0, 0));
        content.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        content.add(logoHandler);
        content.add(inputHandler);

        this.setBackground(new Color(0x484163));
        this.setPreferredSize(new Dimension(1280, 600));
        this.add(content);
    }
}
