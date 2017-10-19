package com.java.my2048;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model());
        controller.startGame();
        JOptionPane.showMessageDialog(null, "Для вызова справки нажмите H");
    }
}
