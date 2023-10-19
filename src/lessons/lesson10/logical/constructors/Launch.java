package lessons.lesson10.logical.constructors;

public class Launch {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", "6");
        animal.sayAnimalName();
        animal.sayAge();

        Animal animal1 = new Animal("Dog", "16");
        animal1.sayAnimalName();

        Animal animal2 = new Animal();
        animal2.animalCountry();


    }
}
