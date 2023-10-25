package homeworks.hm11;


public class HomeWork {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6};

        int [] newArray = someMethod(a, 18);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }


    }
    public static int[] someMethod(int[] arr, int number){
        int [] a = {1, 2, 3, 4, 5, 6};
        int[] newArray = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[newArray.length - 1] = number;

        return newArray;

    }

}
