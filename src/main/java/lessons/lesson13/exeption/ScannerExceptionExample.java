package lessons.lesson13.exeption;

import java.util.Scanner;

public class ScannerExceptionExample {
    public static void main(String[] args) {
        example();
        example2();
        example3();

    }

    public static void example() {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {

            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("So many elements");
        } catch (ArithmeticException a) {
            System.err.println("Cann't division by zero ");
        }
        System.out.println("Program is going ");
    }

    public static void example2() {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {

            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Somethings went wrong");
        }

        System.out.println("Program is going ");
    }

    public static void example3() {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {

            System.out.println(arr[in] / 0);
        } catch (Exception e) {
            System.out.println("Somethings went wrong");
        }

        System.out.println("Program is going ");
    }

}
