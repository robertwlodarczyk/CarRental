package pl.sda.menu;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("MENU - Wypożyczalnia samochodów");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);
        setLocation(50,50);
        setLayout(new GridBagLayout());




        add(new JButton("Logowanie"));
        add(new JButton("Wypożycz samochód"));
        add(new JButton("Wyloguj"));

        setVisible(true);
    }
}