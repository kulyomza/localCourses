package lessons.lesson13.exeption;

public class UncheckedExample {
    public static void main(String[] args) {
        divisionOnNull();

    }
    public static void divisionOnNull(){
        try{
            int a = 4;
            System.out.println(a / 0);
        }catch (ArithmeticException e){
            System.err.println("Canon`t division on null");
        }
        System.out.println("Program is going work");
    }
}
