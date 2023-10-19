package homeworks.hm7;

public class HomeWork {
    public static void main(String[] args) {
        randomArray();

    }

    public static void randomArray() {
        int[] randomArray = new int[8];
        for (int element = 0; element < randomArray.length; element++) {
            randomArray[element] = (int) (Math.random() * 101);
            System.out.print(randomArray[element] + " ");
        }
        System.out.println();
        int maxElement = randomArray[0];
        for (int numbersOfRandomArray = 0; numbersOfRandomArray < randomArray.length; numbersOfRandomArray++) {
            if (randomArray[numbersOfRandomArray] > maxElement) {
                maxElement = randomArray[numbersOfRandomArray];
            }
        }
        System.out.println("Max element of array is: " + maxElement);
    }
}



