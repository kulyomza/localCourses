package homeworks.hm4;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        multiplicationTable();

    }

    public static void multiplicationTable() {
        int multiplier = 3;
        for ( int number = 1; number <= 10; number++){
            int result = multiplier * number;
            System.out.println(multiplier + " * " + number + " = " + result);

        }


    }
}
