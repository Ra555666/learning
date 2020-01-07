package java8_guide_for_beginners_shildt.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SnowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream outputStream;

        if (args.length !=1){
            System.out.println("Использование: SnowFile имя_файла");
            return;
        }

        try {
            outputStream = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not find.");
            return;
        }

        try{
            do {
                i = outputStream.read();
                if (i!=-1){
                    System.out.println((char)i);
                }
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("Error while read file.");
        }

        try{
            outputStream.close();
        }catch (IOException e){
            System.out.println("Error closing file.");
        }
    }

}
