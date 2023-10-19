package lessons.lesson6;

public class ArrayReverse {
    public static void main(String[] args) {
        arrRev();

    }

    public static void arrRev() {
        String[] arr = {"Every", "hunter", "want", "to", "know", "where", "is fazan"};
        int arrLen = arr.length;

        String temp;
        //length/2
        //a-i-1

        for(int i = 0; i < arrLen/2; i++){  //3 iteration
        temp = arr[arrLen - i - 1];   //temp = arr[6] = is fazan
        arr[arrLen - i - 1] = arr[i];  // arr[6] = arr[0] is fazan = every
        arr[i] = temp;  // arr[0] = temp
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }

    }
}

