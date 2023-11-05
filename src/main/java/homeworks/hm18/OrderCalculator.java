package homeworks.hm18;

import java.util.List;

public class OrderCalculator {
    private static int basePrice = 1;
    private BurgerSize sizePrice;
    private MeatType meatPrice;
    private List<Ingredient> ingredient;


    public OrderCalculator(BurgerSize sizePrice, MeatType meatPrice, List<Ingredient> ingredient) {
        this.sizePrice = sizePrice;
        this.meatPrice = meatPrice;
        this.ingredient = ingredient;
    }
    public int totalPrice(){
        int totalPrice = basePrice + sizePrice.getPrice() + meatPrice.getPrice();
        for (Ingredient ingredients : ingredient) {
            totalPrice += ingredients.getPrice();

        }
        return totalPrice;
    }
}
