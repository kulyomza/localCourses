package homeworks.hm8;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        randomArray();

    }
    public static void randomArray() {
        int[] randomArray = new int[10];
        double count = 10.0;
        double sum = 0.0;
        double average = 0.0;

        for (int element = 0; element < randomArray.length; element++) {
            randomArray[element] = (int) ((Math.random() * 11) + 10);
            System.out.print(randomArray[element] + " ");

            sum += randomArray[element];
        }
        System.out.println();
        average = sum / count;
        System.out.println("Average is " + average);
    }
}

