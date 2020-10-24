package pl.sda.menu;

import java.awt.*;
import java.util.Scanner;

// Draft console menu


public class Menu {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });

//        int userSelected;
//        do {
//            userSelected = menu();
//            switch (userSelected) {
//                case 1:
//                    System.out.println("Option 1 is selected.");
//                    break;
//                case 2:
//                    System.out.println("Option 2 is selected.");
//                    break;
//                case 3:
//                    System.out.println("Option 3 is selected.");
//                    break;
//                case 4:
//                    System.out.println("Option 4 is selected.");
//                    break;
//                default:
//                    break;
//            }
//
//        } while (userSelected > 5);
//
//    }
//
//    public static int menu() {
//
//        int selection;
//        Scanner input = new Scanner(System.in);
//
//        /***************************************************/
//
//        System.out.println("Select option");
//        System.out.println("-------------------------\n");
//        System.out.println("1 - Logowanie");
//        System.out.println("2 - Wypożycz samochód");
//        System.out.println("3 - Option 3");
//        System.out.println("4 - Option 4");
//
//        selection = input.nextInt();
//        return selection;
    }
}
