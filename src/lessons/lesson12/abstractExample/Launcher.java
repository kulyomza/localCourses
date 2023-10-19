package lessons.lesson12.abstractExample;

import lessons.lesson12.interfaceEample.IParts;

public class Launcher {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Diesel");
        aboutCar(toyota);
        toyota.getFuel("Diesel");
        Car bmw = new Bmw("Petrol");
        aboutCar(bmw);
        Car nissan = new Nissan("Gas");
        aboutCar(nissan);


    }
    static void aboutCar(Car car){
        System.out.println("Max speed of car is " + car.maxSpeed());
        car.drive();
        car.brake();


    }

}
