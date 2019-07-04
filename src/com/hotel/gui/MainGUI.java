package com.hotel.gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MainGUI extends JFrame {
    public MainGUI() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        RoomInfoGUI p = new RoomInfoGUI();
        JTabbedPane tabbed = new JTabbedPane();
        tabbed.add("酒店管理", p);
        tabbed.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JTabbedPane tb = (JTabbedPane) e.getSource();
                ((RefreshPal) tb.getSelectedComponent()).fresh();
            }
        });
        this.getContentPane().add(tabbed);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 200, 800, 600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}

