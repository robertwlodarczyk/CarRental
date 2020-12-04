package pl.sda;

import pl.sda.menu.Menu;
import pl.sda.menu.RentMenu;

import javax.swing.*;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();
        JFrame frame = new JFrame("SDA_CAR.PL - MENU");
        frame.setContentPane(new Menu().panelMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
