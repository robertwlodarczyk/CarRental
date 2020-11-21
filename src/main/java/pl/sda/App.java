package pl.sda;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class App {
    private JButton buttonMsg;
    private JPanel panelMenu;
    private JButton zwróćButton;
    private JButton listaSamochodówButton;
    private JButton listaKlientówButton;
    private JButton exitButton;

    public App() {
        buttonMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World!");

            }
        });
        zwróćButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listaSamochodówButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listaKlientówButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("MENU");
        JLabel contentPane = new JLabel(new ImageIcon(ImageIO.read(App.class.getClassLoader().getResourceAsStream("background.png"))));
        JPanel panelMenu = new App().panelMenu;
        frame.setContentPane(contentPane);
        frame.add(panelMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
