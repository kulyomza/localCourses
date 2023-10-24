package lessons.lesson16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilMethodsForCollections {
    public static void main(String[] args) {
        sortMethod();
        shuffleMethod();
        frequencyMethod();
        minMaxMethod();

    }
    public static void frequencyMethod(){
        List<Integer> numberList = Arrays.asList(12, 34, 45, 55, 3, 4, 7, 9, 5, 5, 5, 5, 5, 6);
        System.out.println(Collections.frequency(numberList, 5));
    }
    public static void minMaxMethod(){
        List<Integer> numberList = Arrays.asList(12, 34, 45, 55, 3, 4, 7, 9);
        System.out.println(Collections.max(numberList));
        System.out.println(Collections.min(numberList));
    }
    public static void shuffleMethod(){
        List<String> colorList = Arrays.asList("Yellow", "Red", "Blue");
        Collections.shuffle(colorList);
        System.out.println("Collections after sorting " + colorList);
    }
    public  static void sortMethod(){
        List<String> colorList = Arrays.asList("Yellow", "Red", "Blue");
        System.out.println("Collection before sorting " + colorList);
        Collections.sort(colorList);
        System.out.println("Collections after sorting " + colorList);

        colorList.sort(Collections.reverseOrder());

        System.out.println("Collections after reverseOrder " + colorList);

        Collections.reverse(colorList);
        System.out.println("Collections after reverse " + colorList);
    }
    public static void asListMethod(){
        String [] arr = {"foo", "baa", "bez"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
