package lessons.lesson9.incapsulation.cars;

public class Opel {

    private String fuel = "petrol";

    private String model = "Astra";

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void showAllInfo() {
        System.out.println("Fuel of Opel is " + fuel);
        showModel();


    }

    private void showModel() {
        System.out.println("Our model is " + this.model);


    }

}
