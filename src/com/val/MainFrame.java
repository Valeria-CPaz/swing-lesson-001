package com.val;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton btn, btnClear;
    private Integer counter = 0;

    public MainFrame() {
        super("Border Layout Demonstration");

        setSize(600, 500);

        setLayout(new BorderLayout());

        textArea = new JTextArea("Sentence ONE");
        btn = new JButton("Click ME");
        btnClear = new JButton("Clear text");

        btn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        textArea.append("Sentence TWO");
                        counter++;
                        textArea.setText(Integer.toString(counter));

                    }
                }

        );

        btnClear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter = 0;
                        textArea.setText(Integer.toString(counter));

                    }
                }
        );

        add(textArea, BorderLayout.WEST);
        add(btn, BorderLayout.SOUTH);
        add(btnClear, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
