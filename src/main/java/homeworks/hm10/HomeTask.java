package homeworks.hm10;

import java.util.Scanner;
import java.util.SortedMap;

public class HomeTask {
    public static void main(String[] args) {
        authorization();

    }
    public static void authorization(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Knock, Knock!!!");
        System.out.println("Who is there?");
        String login = scanner.nextLine();
        if(login.equals("Admin")){
            System.out.println("Please, enter your password or enter cancel");
            String password = scanner.nextLine();
            if(password.equals("I am charge")){
                System.out.println("Welcome");
            }else if(password.equalsIgnoreCase("cancel")){
                System.out.println("Cancel");
            }else{
                System.out.println("Wrong password");
            }

        }else if(login.equalsIgnoreCase("cancel")){
            System.out.println("Cancel");
        }else{
            System.out.println("I don't know you");
        }


    }
}
