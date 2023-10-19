package homeworks.hm5;

public class HomeWorkTask1 {
    public static void main(String[] args) {

        int result = returnSmallerNumber(7, 3);
        System.out.println(result);

    }
    public static int returnSmallerNumber(int num1, int num2){
        if( num1 < num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
