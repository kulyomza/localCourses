package homeworks.hm18;

public enum BurgerSize {
    SMALL(5),
    MEDIUM( 6),
    LARGE( 7);

    private int price;


    BurgerSize(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

}
