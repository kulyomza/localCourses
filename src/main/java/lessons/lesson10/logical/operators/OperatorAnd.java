package lessons.lesson10.logical.operators;

public class OperatorAnd {
    public static void main(String[] args) {
        exampleWithOneAmpersant();
        exampleWithTwoAmpersant();

    }


    public static void exampleWithOneAmpersant() {
        int mouse = 5;
        int weight = 45;
        if (mouse != 0 & weight < 100) {
            System.out.println("Можем кормить кота!");

        }

    }

    public static void exampleWithTwoAmpersant() {
        int a = 10;
        if (++a == 10 && ++a == 12) {
            ++a;
        }
        System.out.println(a);

    }
}