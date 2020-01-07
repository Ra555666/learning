package epam.tasks.optional;

import java.io.*;
import java.util.ArrayList;

public class ReadAndReverseStrings {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data/forReplaceResult.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("data/forReplaceResultReverse"))) {

            ArrayList<String> arrayForWrite = new ArrayList<>();
            reader.lines().forEach(arrayForWrite::add);

            for (String line : arrayForWrite) {
                line = new StringBuilder(line).reverse().toString();
                writer.write(line, 0, line.length());
                writer.newLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
