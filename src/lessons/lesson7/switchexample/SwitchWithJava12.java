package lessons.lesson7.switchexample;

public class SwitchWithJava12 {
    public static void main(String[] args) {
        String month = SwitchWithString(2);
        System.out.println(month);
    }

    public static String SwitchWithString(int month){

        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3, 4 -> " March";
            default -> "Unnamed month";
        };
    }
}

