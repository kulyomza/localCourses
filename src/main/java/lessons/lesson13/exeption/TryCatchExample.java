package lessons.lesson13.exeption;


import java.io.FileWriter;
import java.io.IOException;

public class TryCatchExample {
    public static void main(String[] args){
        writeSomething();

    }
    public static void writeSomething() {
        try {
            FileWriter fileWriter = new FileWriter("somefile.txt");
            fileWriter.close();
            fileWriter.write("some");
        }catch (IOException e){
            System.err.println("Dude, open flow");
        }finally {
            System.out.println("I do always");
        }
        System.out.println("Program is going");
    }
    public static void writeSomethingWithThrows() throws IOException{
        FileWriter fileWriter = new FileWriter("somefile.txt");
        fileWriter.close();
        fileWriter.write("some");
        System.out.println("Program is going");

    }
}
