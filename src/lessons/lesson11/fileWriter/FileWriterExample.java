package lessons.lesson11.fileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/lessons/lessons11/fileWriter/result.txt");
        fileWriter.write("Hello world");
        fileWriter.write(" Hello Anna");
        fileWriter.close();
    }
}
