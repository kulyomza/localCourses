package homeworks.hm7;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        System.out.println(resultOfSum());


    }
    public static boolean resultOfSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sumResult = num1 + num2;

        if(sumResult >= 0){
            return true;
        }else{
            return false;
        }
    }
    }

