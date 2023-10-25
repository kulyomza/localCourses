package lessons.lesson4;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        switchCondition();

    }

    public static void switchCondition() {
        System.out.println("Enter number from 1 to 3");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("You entered number 1");
                break;
            case 2:
                System.out.println("You entered number 2");
                break;
            case 3:
                System.out.println("You entered number 3");
                break;
            default:
                System.out.println("You not entered one of numbers 1, 2, 3");
        }

    }

}
