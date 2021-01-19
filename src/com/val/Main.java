package com.val;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run(){
                //JFrame frame = new JFrame("Hello World");
                JFrame frame = new MainFrame();
            }
        });
    }
}
