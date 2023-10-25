package lessons.lesson16.sorting.comparator;

import java.time.Year;
import java.util.Comparator;

public class Car{
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

    public int getYear() {
        return year;
    }
}
