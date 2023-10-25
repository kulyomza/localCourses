package homeworks.hm6;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        pyramidOfStars();

    }
    public static void pyramidOfStars() {
        int rowForPrint = 6;
        for (int i = 0; i < rowForPrint; i++) {
            for (int j = rowForPrint - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }

