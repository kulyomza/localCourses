package lessons.lesson12.interfaceEample;

public interface ICar extends IParts, IOther{

    final static String OTHER_TYPE_FUEL = "Diesel";
    String maxSpeed();
    void drive();
    void brake();

    default void getFuel(String typeFuel){
        System.out.println(typeFuel);
    }

    private void utilMethod(){
        // method only for interface use
    }


}
