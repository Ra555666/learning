package epam.tasks.optional;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFileModificationProgram {
    static void modifyFile() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data/Students.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/Students1.txt"))){

            float averageGrade;
            int subjectsCount;
            String resultLine = "";

            ArrayList<String> strings = new ArrayList<>();
            bufferedReader.lines().forEach(strings::add);

            for (String string: strings){
                String[] attributes = string.split("/");
                subjectsCount = attributes.length - 1;
                int sum=0;
                for (int i = 1; i < attributes.length; i++) {
                    sum += Integer.parseInt(attributes[i]);
                }

                averageGrade = (float) sum / subjectsCount;

                if (averageGrade > 7) {
                    attributes[0] = attributes[0].toUpperCase();
                    System.out.println(attributes[0]+ " average grade is "+ averageGrade);
                }

                resultLine = String.join("/", attributes);
                string = resultLine;
            }

            for (String string: strings){
                bufferedWriter.write(string,0,string.length());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        modifyFile();
        System.out.println("done");
    }
}