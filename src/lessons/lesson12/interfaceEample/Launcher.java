package lessons.lesson12.interfaceEample;

public class Launcher {
    public static void main(String[] args) {
        ICar bmw = new Bmw();
        aboutCar(bmw);
        bmw.getFuel(ICar.OTHER_TYPE_FUEL);
        bmw.partsPrice(25);
        bmw.otherMethod();




    }
    static void aboutCar(ICar car){
        System.out.println("Max speed of car is " + car.maxSpeed());
        car.drive();
        car.brake();

    }
}
