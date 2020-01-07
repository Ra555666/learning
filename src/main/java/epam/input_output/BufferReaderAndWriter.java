package epam.input_output;

import java.io.*;

public class BufferReaderAndWriter {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/source.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/fromSource.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line, 0, line.length());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
