package lessons.lesson9.launch;

import lessons.lesson9.incapsulation.cars.*;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.aboutCar();
        System.out.println(bmw.fuel);

        Honda honda = new Honda();
        honda.publicAboutCar();

        Skoda skoda = new Skoda();
        String model = skoda.getModel();
        skoda.showAllInfo();


        Opel opel = new Opel();
        opel.setFuel("Diesel");
        opel.setModel("Omega");
        opel.showAllInfo();


    }
}
