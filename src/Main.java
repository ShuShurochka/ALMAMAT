import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        System.out.println(name+", твои глаза как два океана безбрежного счастья. Я тебя люблю!");
        System.out.println("А ты меня?");
        sc.nextLine();
    }
}