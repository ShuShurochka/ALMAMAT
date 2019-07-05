import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("кот, собака или мышь?");
        String string = sc.nextLine();

        if (string.equals("кот")) {
            JFrame frame = new JFrame("FirstForm");
            frame.setContentPane(new FirstForm().panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } else if (string.equals("собака")) {
            JFrame frame = new JFrame("SecondForm");
            frame.setContentPane(new SecondForm().panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }
}