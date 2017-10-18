package com.java.my2048;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model());
        JFrame jFrame = new JFrame();
        jFrame.setTitle("2048");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(450, 500);
        jFrame.setResizable(false);
        jFrame.add(controller.getView());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
