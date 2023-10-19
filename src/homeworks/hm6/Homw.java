package homeworks.hm6;

public class Homw {
    public static void main(String[] args) {
        tingle();
        piramida();

    }
    public static void tingle(){
        for( int i = 0; i < 4; i++){
            for( int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void piramida(){
        int[][] arr = {{1, 2, 3}, {2, 4, 6, 5, 8}, {1, 2}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <= arr[i].length - 1; j++){
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
