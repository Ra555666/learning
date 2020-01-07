package epam.input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderOne {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("data/info.txt")) {
            int symbol = fileReader.read();
            System.out.println(symbol);
            char[] buffer = new char[8];
            fileReader.skip(3);
            fileReader.read(buffer);
            System.out.println(Arrays.toString(buffer));
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
