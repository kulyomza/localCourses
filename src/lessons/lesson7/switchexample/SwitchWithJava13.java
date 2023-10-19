package lessons.lesson7.switchexample;

public class SwitchWithJava13 {
    public static void main(String[] args) {
        String month = SwitchWithString(2);
        System.out.println(month);
    }

    public static String SwitchWithString(int month){
        return switch (month){
            case 1:
                yield "January";
            case 2:
                yield "February";
            case 3, 4:
                yield  " March";
            default:
                yield  "Unnamed month";
        };
    }
}

