package lessons.lesson6;

public class StringMethods {
    public static void main(String[] args) {
        equalsIgnoreCaseMethods();
        lastIndexOfMethods();
        valueOfMethods();

    }


    public static void valueOfMethods(){
        int num = 528642;
        String numStr = String.valueOf(num);
        System.out.println(numStr);
    }

    public static void lastIndexOfMethods() {
        String str = "Hello, My name is Alex";
        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));

    }
    public static void equalsIgnoreCaseMethods(){
        String str = "Hello, my name is Alex";

        if(str.equals("Hello, my name is ALEX")){
            System.out.println("OK");
        }else {
            System.out.println("Fail");
        }

        if(str.equalsIgnoreCase("Hello, my name is ALEX")){
            System.out.println("OK with ignore case");
        }else {
            System.out.println("Fail");
        }
    }
}
