package lessons.lesson16.sorting.comparator;

import lessons.lesson16.sorting.comparable.Car;

import java.util.TreeSet;

public class Launcher {
    public static void main(String[] args) {
        CarComparatorByYear carComparatorByYear = new CarComparatorByYear();
        TreeSet<lessons.lesson16.sorting.comparable.Car> carTreeSet = new TreeSet<>();
        carTreeSet.add(new lessons.lesson16.sorting.comparable.Car("BMW", 2020));
        carTreeSet.add(new lessons.lesson16.sorting.comparable.Car("Mercedes", 2016));
        carTreeSet.add(new lessons.lesson16.sorting.comparable.Car("Opel", 2010));
        carTreeSet.add(new lessons.lesson16.sorting.comparable.Car("Volvo", 2005));

        for (Car car : carTreeSet) {
            System.out.println(car);

        }
    }
}
