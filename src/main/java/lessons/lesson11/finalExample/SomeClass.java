package lessons.lesson11.finalExample;

public class SomeClass extends MethodFinal {
    public void aboutPerson(){
        sayHello();
        sayAge();
    }

    @Override
    public void sayAge() {
        super.sayAge();
    }
}
