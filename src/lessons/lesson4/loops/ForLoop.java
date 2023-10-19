package lessons.lesson4.loops;

public class ForLoop {
    public static void main(String[] args) {
        //forLoopExample();
        //forReverseExample();
        usingForWithArray();

    }

    public static void forLoopExample() {
        for (int i = 1; i <= 5; i++){
            System.out.println("Hi, i am Maks");
        }

    }

    public static void forReverseExample() {
        for (int i = 3; i >= -3; i--){
            System.out.println(i + " ");
        }

    }

    public static void usingForWithArray() {
        int[] arr = {5, 7, 8, 10};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
