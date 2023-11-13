package homeworks.hm18;

public enum MeatType {
    BEEF(2),
    CHICKEN(1),
    FISH(3);

    private int price;

    MeatType(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
