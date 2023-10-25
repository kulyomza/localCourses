package lessons.lesson4.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        forEachExample();
        forEachExampleWithString();

    }

    public static void forEachExample() {
        int[] arr = {5, 7, 8, 10};
        for(int i : arr){
            System.out.println(i + " ");
        }

    }
    public static void forEachExampleWithString(){
        String[] names = {"Alex", "Igor", "Oleg"};
        for(String name : names){
            System.out.println("Name of employee - " + name);

        }
    }
}
