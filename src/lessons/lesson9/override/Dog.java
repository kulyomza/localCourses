package lessons.lesson9.override;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("gay gay");
    }
    public void aboutDog(){
        eat();
    }
}

