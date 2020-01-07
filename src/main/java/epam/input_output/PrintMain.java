package epam.input_output;

import java.io.*;
import java.util.Random;

public class PrintMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] values = new int[20];
        for (int value: values){
            value = rand.nextInt(100);
            System.out.println(value);
        }
        try(PrintStream stream = new PrintStream(new FileOutputStream("data/res.txt"))) {
            for (int value:values){
                stream.print(value);
                stream.println();
//                System.setOut(stream);
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
//            new PrintWriter(new PrintStream(new FileOutputStream(file)));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
