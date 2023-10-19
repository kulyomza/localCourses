package lessons.lesson4.loops;

public class WhileLoop {
    public static void main(String[] args) {
whileExample();
whileReverse();
doWhileExample();
    }

    public static void whileExample() {
        int i = 1;
        while (i < 8){
            System.out.println(i + " ");
            i++;
        }

    }

    public static void whileReverse() {
        int i = 100;
        while (i >= 10){
            System.out.println("Reverse " + i);
            i -= 10;
        }

    }

    public static void doWhileExample() {
        int i = 1;
        do{
            System.out.println("Выполнюсь " + i + " раз");
            i++;
        } while (i < 0);

    }
}
