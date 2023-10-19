package lessons.lesson9.override;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Meow Meow");
    }

    public void voice(String str) {
        System.out.println(str);
    }
}

