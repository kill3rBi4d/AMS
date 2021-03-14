package com.aiens.ai;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LoginScreenPanel extends JPanel {
    LoginScreenContents loginScreenContents = new LoginScreenContents();
    LoginScreenFooter loginScreenFooter = new LoginScreenFooter();

    LoginScreenPanel(){
        this.setPreferredSize(new Dimension(1290, 690));
        this.setBackground(new Color(0x7469A3));
        this.setLayout(new BorderLayout());
        this.add(loginScreenContents, BorderLayout.NORTH);
        this.add(loginScreenFooter, BorderLayout.SOUTH);

    }
}
