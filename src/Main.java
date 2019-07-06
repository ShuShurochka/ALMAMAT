import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String string = null;
        JFrame frame = null;

        do {
            System.out.println("кот или собака?");
            string = sc.nextLine();

            if (string.equals("кот")) {
                if (frame != null) {
                    frame.setVisible(false);
                    frame.dispose();
                }
                frame = new JFrame("FirstForm");
                frame.setContentPane(new FirstForm().panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
            } else if (string.equals("собака")) {
                if (frame != null) {
                    frame.setVisible(false);
                    frame.dispose();
                }
                frame = new JFrame("SecondForm");
                frame.setContentPane(new SecondForm().panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
            } else if (string.isEmpty()) {
                if (frame != null) {
                    frame.setVisible(false);
                    frame.dispose();
                }
            } else {
                System.out.println("Вы ввели неправильное животное.");
            }
        } while (!string.isEmpty());
    }
}