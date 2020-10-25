package pl.sda.menu;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public MyFrame() {

        JFrame frame = new JFrame("MENU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS);
        frame.setLayout(boxLayout);

        JLabel label = new JLabel("RENTAL CARS by Robert Włodarczyk");
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(label);

        JPanel newPanel = new JPanel(new GridBagLayout());


        newPanel.add(new JButton("Login"));
        newPanel.add(new JButton("Rental"));
        newPanel.add(new JButton("Car availability"));
        newPanel.add(new JButton("Logout"));
        frame.add(newPanel);


        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}