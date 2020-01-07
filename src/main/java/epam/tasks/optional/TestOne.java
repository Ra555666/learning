package epam.tasks.optional;

import java.io.*;

public class TestOne {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data/listener.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/listenerCopy"))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                char[] charArr = line.toCharArray();
                bufferedWriter.write(line,0,line.length());
                bufferedWriter.newLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
