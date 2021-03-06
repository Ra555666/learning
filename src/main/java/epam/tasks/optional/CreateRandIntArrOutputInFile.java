package epam.tasks.optional;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CreateRandIntArrOutputInFile {
    public static void main(String[] args) {
        try (BufferedWriter outputWriter = new BufferedWriter(new FileWriter("data/randomNumbers.txt",true))) {
            int[] randomNumbers = new int[20];
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = (int) (Math.random() * 20) + 1;
            }
            Arrays.sort(randomNumbers);
            for (int i = 0; i < randomNumbers.length; i++) {
                if (i==randomNumbers.length-1){
                    outputWriter.write(randomNumbers[i] + "");
                }else {
                    outputWriter.write(randomNumbers[i] + "--");
                }

                // Or:
//                outputWriter.write(Integer.toString(randomNumbers[i]));
//                outputWriter.newLine();
            }
            outputWriter.newLine();
            outputWriter.flush();


//            outputWriter.write(Arrays.toString(randomNumbers));// for int(large numbers) arrays
        } catch (IOException e) {
            e.printStackTrace();
        }



/*
* First version below
* */
//        File file = new File("data/randomNumbers.txt");
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream  = new FileOutputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        int[] randomNumbers = new int[20];
//        for (int i= 0;i<randomNumbers.length;i++){
//            randomNumbers[i] = (int)(Math.random()*20)+1;
//            System.out.println(randomNumbers[i]);
//        }
//        Arrays.sort(randomNumbers);
//        System.out.println(Arrays.toString(randomNumbers));
//        try {
//            fileOutputStream.write(Integer.parseInt(Arrays.toString(randomNumbers)));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}



