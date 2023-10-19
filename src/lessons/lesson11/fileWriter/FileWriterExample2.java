package lessons.lesson11.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
    public static void main(String[] args) throws IOException {
        int start = 2;
        int finish = 9;
        writeToFile(start, finish);

    }
    public static void writeToFile(int start, int finish) throws IOException {
        FileWriter fileWriter = new FileWriter("src/lessons/lessons11/fileWriter/result.txt");
        for (int i = start; i <= finish; i++) {
            fileWriter.write("This is " + i + " iteration" + "\n");

        }
        fileWriter.close();
    }
}
