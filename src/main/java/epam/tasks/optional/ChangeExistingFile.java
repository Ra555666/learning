package epam.tasks.optional;

import java.io.*;
import java.util.Scanner;

public class ChangeExistingFile {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data/Students.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/Students1.txt"))) {
            int sum = 0;
            int subjectsCount = 0;
            float averageGrade = 0;
            String resultLine = "";
            String student = null;

            while ((student = bufferedReader.readLine()) != null) {
                String[] attributes = student.split("/");
                subjectsCount = attributes.length - 1;
                for (int i = 1; i < attributes.length; i++) {
                    sum += Integer.parseInt(attributes[i]);
                }
                averageGrade = (float) sum / subjectsCount;
                System.out.println(attributes[0]+ " average grade is "+ averageGrade);
                if (averageGrade > 7) {
                    attributes[0] = attributes[0].toUpperCase();
                }
//                result.append(resultLine);
//                bufferedWriter.write(result,0,result.length());
                resultLine = String.join("/", attributes);
            }
            bufferedWriter.write(resultLine);
            bufferedWriter.newLine();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
