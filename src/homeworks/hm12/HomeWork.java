package homeworks.hm12;

public class HomeWork {
    public static void main(String[] args) {
        luckyNumber();


    }

    public static void luckyNumber() {
        int[] numberDiapason = new int[10];
        for (int i = 0; i < 11; i++) {
            numberDiapason[i] += i;
            System.out.println(numberDiapason[i] + " ");
            if(numberDiapason[i] == 3){
                break;
            }
        }
        System.out.println("It's the lucky number!");
    }

}



