package homeworks.hm18;


import java.util.List;
import java.util.Scanner;

public class Burger {
    private BurgerSize userSize;
    private MeatType userTypeOfMeet;
    private List<Ingredient> userIngredient;
    private OrderCalculator totalPrice;


    public Burger(BurgerSize userSize, MeatType userTypeOfMeet, List<Ingredient> userIngredient, OrderCalculator totalPrice) {
        this.userSize = userSize;
        this.userTypeOfMeet = userTypeOfMeet;
        this.userIngredient = userIngredient;
        this.totalPrice = totalPrice;

    }


    public static String userIngredient() {
        Scanner scanner = new Scanner(System.in);
        String userIngredient = scanner.nextLine();
        if(userIngredient.equalsIgnoreCase("cheese") || userIngredient.equalsIgnoreCase("tomato") || userIngredient.equalsIgnoreCase("onion") || userIngredient.equalsIgnoreCase("lettuce") || userIngredient.equalsIgnoreCase("cucumber") || userIngredient.equalsIgnoreCase("done")){
            return userIngredient;
        }else {
            System.out.println("Choose correct ingredient");
            userIngredient = userIngredient();
        }
        return userIngredient;
    }

    public static String userTypeOfMeet() {
        Scanner scanner = new Scanner(System.in);
        String userTypeOfMeet = scanner.nextLine();
        if(userTypeOfMeet.equalsIgnoreCase("chicken") || userTypeOfMeet.equalsIgnoreCase("beef") || userTypeOfMeet.equalsIgnoreCase("fish")){
            return userTypeOfMeet;
        }else {
            System.out.println("Choose correct type of meet");
            userTypeOfMeet = userTypeOfMeet();
        }

        return userTypeOfMeet;
    }

    public static String userSize() {
        Scanner scanner = new Scanner(System.in);
        String userSize = scanner.nextLine();
        if(userSize.equalsIgnoreCase("small") || userSize.equalsIgnoreCase("medium") || userSize.equalsIgnoreCase("large")){
            return userSize;
        }else {
            System.out.println("Choose correct size");
            userSize = userSize();
        }
        return userSize;
    }

    public void burgerInfo(){
        System.out.println("Your order is: ");
        System.out.println("Burger size: " + userSize);
        System.out.println("Type of meet: " + userTypeOfMeet);
        System.out.println("Ingredients: " );
        for (Ingredient ingredients : userIngredient) {
            System.out.println(ingredients + " ");
        }
        System.out.println("Total price is: " + totalPrice.totalPrice());

    }

}
