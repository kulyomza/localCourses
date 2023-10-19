package homeworks.hm5;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        twoDimCharArray();

    }
    public static void twoDimCharArray( ){
        char [][] twoDimArray = {{'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}};
            for( char arrayString = 0; arrayString < twoDimArray.length; arrayString++){
                for(char arrayColumn = 0; arrayColumn < twoDimArray[arrayString].length; arrayColumn++){
                    System.out.print( " " + twoDimArray[arrayString][arrayColumn] + " ");
                }
                System.out.println();
        }

    }
}
