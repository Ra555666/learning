package epam.tasks.optional;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ChangeToUpperCase {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data/Source.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/fromSource.txt"))) {

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrayLine = line.split(" ");
                for (int i = 0; i < arrayLine.length; i++) {
                    if (arrayLine[i].length() > 2) {
                        arrayLine[i] = arrayLine[i].toUpperCase();
                    }
                }

                String resultLine = String.join(" ", arrayLine);
                bufferedWriter.write(resultLine,0,resultLine.length());
                bufferedWriter.newLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
