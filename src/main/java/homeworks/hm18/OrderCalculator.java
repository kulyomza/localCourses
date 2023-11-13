package homeworks.hm18;

import java.util.List;

public class OrderCalculator {
    private static int basePrice = 1;
    private static BurgerSize sizePrice;
    private static MeatType meatPrice;
    private static List<Ingredient> ingredient;


    public OrderCalculator(BurgerSize sizePrice, MeatType meatPrice, List<Ingredient> ingredient) {
        this.sizePrice = sizePrice;
        this.meatPrice = meatPrice;
        this.ingredient = ingredient;
    }
    public static int totalPrice(){
        int totalPrice = basePrice + sizePrice.getPrice() + meatPrice.getPrice();
        for (Ingredient ingredients : ingredient) {
            totalPrice += ingredients.getPrice();

        }
        return totalPrice;
    }
}
