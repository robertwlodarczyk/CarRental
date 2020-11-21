package pl.sda.menu;

import java.awt.*;


public class Menu {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });

    }
}
