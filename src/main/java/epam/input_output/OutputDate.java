package epam.input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDate {
    public static void main(String[] args) {
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream("data/test_file.txt",true);
            outputStream.write((char)48);
//            byte[] value = {65,67,100};
//            outputStream.write(value);
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File append new data");

    }

}
