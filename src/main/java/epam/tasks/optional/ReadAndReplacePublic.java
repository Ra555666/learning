package epam.tasks.optional;

import java.io.*;
import java.util.ArrayList;

public class ReadAndReplacePublic {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data/forReplace.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/forReplaceResult.txt"))) {

            ArrayList<String> arrayForWrite = new ArrayList<>();
            bufferedReader.lines().forEach(arrayForWrite::add);

            for (String line: arrayForWrite){
                line = line.replaceAll("\\bpublic\\b", "private");
                bufferedWriter.write(line,0,line.length());
                bufferedWriter.newLine();
            }


//            StringBuilder stringBuilder = new StringBuilder();
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                line.replaceAll("\\bpublic\\b", "private");
//                bufferedWriter.write(line, 0, line.length());
//                bufferedReader.readLine();
//            }
//            bufferedWriter.write(arrayForWrite.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
