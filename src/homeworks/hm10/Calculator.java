package homeworks.hm10;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        int enteredNumber1 = getInt();
        System.out.println("Enter operation(+, -, * or /): ");
        char operation = getOperation();
        System.out.println("Enter the second number");
        int enteredNumber2 = getInt();
        int result = calculate(enteredNumber1, operation, enteredNumber2);
        System.out.println("The answer is:" + " " + result);

    }

    private static int getInt() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static char getOperation() {

        Scanner scanner = new Scanner(System.in);
        char operator = scanner.next().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            return operator;
        } else {
            System.out.println("Please, enter one of these operations: +, -, * or /");
            operator = getOperation();
        }

        return operator;
    }

    private static int calculate(int enteredNumber1, char operation, int enteredNumber2) {
        int result = -10;
        switch (operation) {
            case '+':
                result = enteredNumber1 + enteredNumber2;
                break;
            case '-':
                result = enteredNumber1 - enteredNumber2;
                break;
            case '*':
                result = enteredNumber1 * enteredNumber2;
                break;
            case '/':
                if (enteredNumber2 != 0) {
                    result = enteredNumber1 / enteredNumber2;
                } else {
                    System.out.println("Error: You cannot divide by zero");
                }
                break;

            default:
                System.out.println("Something went wrong!");
        }
        return result;


    }


}
