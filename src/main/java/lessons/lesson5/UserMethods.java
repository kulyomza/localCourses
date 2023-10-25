package lessons.lesson5;

import java.util.Scanner;

public class UserMethods {
    public static void main(String[] args) {
        sayHello();
        getStrAndPrint("Hello world");
        getStrAndPrint("Hello guys");
        System.out.println(sum(5, 5));
        int res = sum(10, 7);
        System.out.println(res);
        plus(5, 6);

        String aboutYou = getNameAndSurname("Ihor", "Kulyomza", 32);
        System.out.println(aboutYou);


        int sumOfOrder = 100;
        int finalSum = sumFromConsole() + sumOfOrder;
        System.out.println(finalSum);

    }
    public static int sumFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1 + num2;
    }
    public static String getNameAndSurname(String name, String surname, int age){
        return name + " " + surname + " " + age;
    }
    public static int plus(int a, int b){

        return (a + b);
    }
    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
    public static void getStrAndPrint(String str){

        System.out.println("You enter " + str);
    }


    public static void sayHello() {
        System.out.println("Hello");
    }
}
