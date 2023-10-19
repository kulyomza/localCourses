package lessons.lesson12.abstractExample;

public class Bmw extends Car{
    public Bmw(String typeFuel) {
        super(typeFuel);
    }

    @Override
    String maxSpeed() {
        return "200";
    }

    @Override
    void drive() {
        System.out.println("BMW drive");

    }

    @Override
    void brake() {
        System.out.println("BMW brake");

    }
}
