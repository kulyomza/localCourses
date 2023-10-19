package homeworks.hm9;

public class ReplaceEvenNumbers {
    public static void main(String[] args) {
        replaceNumbersInArray();
        classExample();

    }

    public static void replaceNumbersInArray() {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;

        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                myArray[i] = 'Y';
            }

            System.out.print(myArray[i] + " ");

        }
    }

    public static void classExample() {
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(array[i]);
            if(number % 2 == 0){
                array[i] = "Y";
            }

        }
        System.out.println();
        for (String str: array) {
            System.out.print(str + " ");
        }
    }

}
