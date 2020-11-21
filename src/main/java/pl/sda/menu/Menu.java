package pl.sda.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public JButton rentButton;
    public JPanel panelMenu;
    public JButton returnButton;
    public JButton carListButton;
    public JButton clientListButton;
    public JButton exitButton;


    public Menu() {
        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Wypożycz - Menu");
                RentMenu rentMenu = new RentMenu();
                frame.setContentPane(new RentMenu().panel1);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);


            }
        });
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pracujemy nad tym! ;) ");

            }
        });
        carListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pracujemy nad tym! ;) ");

            }
        });
        clientListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pracujemy nad tym! ;) ");

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame frame = new JFrame("FrameExit");

                if (JOptionPane.showConfirmDialog(frame, "Czy na pewno chcesz opuścić aplikację?  ", "SDA_CAR.PL",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
    }


}

