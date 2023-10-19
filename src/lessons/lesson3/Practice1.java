package lessons.lesson3;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        int number2 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner2.nextLine();
        int result = number1 + number2;
        System.out.println(name +" " + result);


    }
}
