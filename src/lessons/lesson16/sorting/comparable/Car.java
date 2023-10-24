package lessons.lesson16.sorting.comparable;

import com.sun.source.tree.BreakTree;

public class Car implements Comparable<Car>{
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;

    }
    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    public int compareTo(Car newCar){
        return Integer.compare(newCar.year, this.year);

    }
    //public int compareTo(Car newCar){
       // return this.model.compareTo(newCar.model);
    //}
}
