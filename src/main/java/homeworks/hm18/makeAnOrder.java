package homeworks.hm18;

import java.util.ArrayList;
import java.util.List;

public class makeAnOrder {
    public static void main(String[] args){

        System.out.println("Create your Burger: choose size(Small, Medium, Large)");
        BurgerSize userSize = BurgerSize.valueOf(Burger.userSize().toUpperCase());

        System.out.println("Choose type of meet(Chicken, Beef, Fish): ");
        MeatType userTypeOfMeet = MeatType.valueOf(Burger.userTypeOfMeet().toUpperCase());

        List<Ingredient> ingredients = new ArrayList<>();
        String userIngredientInput;
        while (true) {
            System.out.println("Add ingredients(Cheese, Onion, Tomato, Cucumber, Lettuce). If you ready make order write - Done");
            userIngredientInput = Burger.userIngredient().toUpperCase();
            if ("Done".equalsIgnoreCase(userIngredientInput)) {
                break;
            }
            Ingredient userIngredient = Ingredient.valueOf(userIngredientInput);
            ingredients.add(userIngredient);
        }
        OrderCalculator orderBill = new OrderCalculator(userSize, userTypeOfMeet, ingredients);
        Burger order = new Burger(userSize, userTypeOfMeet, ingredients);
        order.burgerInfo();


    }
}
