package lessons.lesson11.fileReader;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/lessons/lessons11/fileWriter/result.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}
