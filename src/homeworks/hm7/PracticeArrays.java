package homeworks.hm7;

public class PracticeArrays {
    public static void main(String[] args) {
        int[][] twoDimArray = {{5, 3, 4, 11}, {2, 7, 9, 24}, {9, 8, 33, 55}};
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++){
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
