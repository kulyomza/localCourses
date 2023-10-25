package lessons.lesson7;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Random {
    public static void main(String[] args) {
        randomDefault();
        randomCustom1();
        randomCustom2();

        IntStream a = new java.util.Random().ints(0, 5);
        System.out.println(a);

    }
    public static void randomCustom2() {
        //(Math.random() * (b - a)) + a;
        //[0;3) - (Math.random() * (3 - 0)) +0;
        // int [0, 2]
        int a = (int) (Math.random() * 3);
        System.out.println(a);

    }
    public static void randomCustom1(){
        //(Math.random() * (b - a)) + a;
        //[2;3) - (Math.random() * (3 - 2)) +2; -> (Math.random() * 1) + 2;
        double a = Math.random() * 3;
        System.out.println(a);

    }
    public static void randomCustom(){
        //(Math.random() * (b - a)) + a;
        //[0;3) - (Math.random() * (3 - 0)) +0;
        double a = Math.random() * 3;
        System.out.println(a);
    }

    public static void randomDefault(){
        double a = Math.random();
        System.out.println(a);
    }
}
