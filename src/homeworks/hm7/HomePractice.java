package homeworks.hm7;

import java.util.Arrays;

public class HomePractice {
    public static void main(String[] args) {
        //arrayOfRandomNumbers();
        randomArray();
    }

    public static void arrayOfRandomNumbers() {
        int[] randomArrayElements = new int[8];
        int maxRandomElement = randomArrayElements[0];
        for (int i = 0; i < randomArrayElements.length; i++) {
            randomArrayElements[i] = (int) (Math.random() * 101);
            System.out.print(randomArrayElements[i] + " ");
            if (randomArrayElements[i] > maxRandomElement) {
                maxRandomElement = randomArrayElements[i];
                System.out.println("Max element of array is: " + maxRandomElement);
            }

        }


    }

    public static void randomArray() {
        int[] randomArray = new int[8];
        for (int element = 0; element < randomArray.length; element++) {
            randomArray[element] = (int) (Math.random() * 100);
            System.out.print(randomArray[element] + " ");

        }
        System.out.println();
        int maxElement = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > maxElement) {
                maxElement = randomArray[i];
            }
        }
        System.out.println("Max element of array is: " + maxElement);
    }
}




