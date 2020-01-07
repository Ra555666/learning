package epam.input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriteMain {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/test_file.txt");
             FileWriter writer = new FileWriter("data/info1.txt")) {
            writer.write("Java");
            int symbol = reader.read();
            System.out.println((char) symbol);
            writer.write(symbol);
            char[] buffer = new char[10];
            int charNum = reader.read(buffer);
            System.out.println("charNum = " + charNum);
            while (charNum != -1) {
                writer.write(buffer, 0, charNum);
                System.out.println("charNum in while = " + charNum);
                charNum = reader.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
