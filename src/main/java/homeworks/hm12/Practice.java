package homeworks.hm12;

public class Practice {
    public static void main(String[] args) {
        int a = 16;
        int b = 3;
        b += ++a;
        System.out.println(b++);

        int c = 2;
        int j = 3;
        if (c++ > j && ++b > 0) {
            System.out.println(1);
        } else {
            System.out.println(c + "" + j);
        }
        int num = 2;
        do {
            System.out.println(num);
        } while (num < 0);

        int x = 4;
        int y = 2;
        System.out.println(x % y);

        int n = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(n + 1);
        }
        System.out.println();

        String text = "LoveJava";
        System.out.println(text.indexOf("L"));
        System.out.println(text.indexOf("j"));

        int[] m = {1, 2, 3, 4, 5, 6};
        int l = m.length -1;
        while (l >= 0){
            System.out.println(m[l]);
            l--;
        }

        int w = 5;
        switch (w){
            case 1:
                ++w;
            case 5:
                ++w;
            default:
                ++w;
        }
        System.out.println(++w);
        System.out.println(--w);
    }
}
