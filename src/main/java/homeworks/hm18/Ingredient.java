package homeworks.hm18;

public enum Ingredient {
    CHEESE(1),
    TOMATO(1),
    LETTUCE(1),
    ONION(1),
    CUCUMBER(1);

    private int price;

    Ingredient(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
