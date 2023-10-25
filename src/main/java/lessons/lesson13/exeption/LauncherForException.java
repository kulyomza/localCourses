package lessons.lesson13.exeption;

public class LauncherForException {
    public static void main(String[] args) throws CustomException {
        compute(11);

    }
    public static void compute(int number) throws CustomException {
        System.out.println("compute method is called ");
        if(number > 10){
            throw new CustomException(number, "Some message about exception");
        }
        System.out.println("Normal ending method ");
    }
}
