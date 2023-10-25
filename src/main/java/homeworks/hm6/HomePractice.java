package homeworks.hm6;

public class HomePractice {
    public static void main(String[] args) {
        String[] a = {"Hi", "my", "name", "Max"};
        int n = a.length;
        String temp;
        for (int i = 0; i < n/2; i++){
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
