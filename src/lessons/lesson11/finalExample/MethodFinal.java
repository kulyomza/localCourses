package lessons.lesson11.finalExample;

public class MethodFinal {

    final void sayHello(){ //забороняє перезаписування
        System.out.println("Hello");
    }
    public void sayAge(){
        System.out.println("23");
    }
}
