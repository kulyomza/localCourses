package lessons.lesson9.incapsulation.cars;

import lessons.lesson9.incapsulation.owners.SkodaOwners;

public class Skoda extends SkodaOwners {
    private String fuel = "diesel";

    private  String model = "Octavia";

    public String getModel(){
        return this.model;
    }

    private void aboutCar(){
        System.out.println("It`s Skoda");
        showModel();
    }
    public void showAllInfo(){
        System.out.println("Fuel of Skoda " + fuel);
        aboutCar();

    }
    private void showModel(){
        System.out.println("Our model " + this.model);
    }

}
