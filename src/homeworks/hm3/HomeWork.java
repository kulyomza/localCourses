package homeworks.hm3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number == 1){
            System.out.println("You entered number 1");
        } else if(number == 2){
            System.out.println("You entered number 2");
        }else if(number == 3){
            System.out.println("You entered number 3");
        }else {
            System.out.println("You not entered one of numbers 1, 2, 3");
        }
    }
}
