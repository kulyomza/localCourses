package lessons.lesson12.abstractExample;

abstract class  Car {
    private String typeFuel;
    public Car(String typeFuel){
        this.typeFuel = typeFuel;
    }


    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    void getFuel(String typeFuel){
        System.out.println(this.typeFuel);
    }
}
