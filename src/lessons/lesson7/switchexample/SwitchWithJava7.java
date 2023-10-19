package lessons.lesson7.switchexample;

public class SwitchWithJava7 {
    public static void main(String[] args) {
        String month = SwitchWithString(2);
        System.out.println(month);
    }

    public static String SwitchWithString(int month){
        String monthChoose;
        switch (month){
            case 1:
                monthChoose = "January";
                break;
            case 2:
                monthChoose = "February";
                break;
            case 3:
                monthChoose = " March";
                break;
            default:
                monthChoose = "Unnamed month";
        }
        return monthChoose;
    }
}
