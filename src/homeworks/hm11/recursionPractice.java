package homeworks.hm11;

public class recursionPractice {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int result1 = value(5, 10);
        System.out.println(result1);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int value(int start, int end) {

        if (end > start) {
            return end + value(start, end - 1);
        } else {
            return 0;
        }
    }
}
