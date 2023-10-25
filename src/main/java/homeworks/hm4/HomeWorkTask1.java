package homeworks.hm4;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        taskWhile();

    }

    public static void taskWhile() {
        int start = 1;
        while (start <= 512) {
            System.out.print(start + " ");
            start *= 2;
        }

    }

}
