package pl.sda.menu;

import javax.swing.*;
import java.awt.*;


public class NewMenu {
    private static Container layoutComponents(String title, float alignment) {
        String labels[] = {"LOGIN", "RENTAL", "CAR AVAILABILITY", "LOGOUT"};

        JPanel container = new JPanel();
        container.setBorder(BorderFactory.createTitledBorder(title));
        BoxLayout layout = new BoxLayout(container, BoxLayout.PAGE_AXIS);
        container.setLayout(layout);

        for (int i = 0, n = labels.length; i < n; i++) {
            JButton button = new JButton(labels[i]);
            button.setAlignmentX(alignment);
            container.add(button);
        }
        return container;
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("MENU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container panel = layoutComponents("RENTAL CARS", Component.CENTER_ALIGNMENT);

        frame.setLayout(new FlowLayout());

        frame.add(panel);


        frame.pack();
        frame.setVisible(true);
    }
}