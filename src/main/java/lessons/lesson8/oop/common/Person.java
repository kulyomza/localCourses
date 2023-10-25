package lessons.lesson8.oop.common;

public class Person {
    int year = 1989;
    String name = "Alex";

    public void aboutPerson(){
        System.out.println("Person name " + name + " and year of born " + year);
    }


    public static void sayHello(){
        System.out.println("Hello");
    }
}
