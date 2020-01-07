package epam.input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputNameOne {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("data/test_file.txt");
            int code = inputStream.read();
            System.out.println(code + " char = " + (char)code);
            byte[] arr = new byte[17];
            int num = inputStream.read(arr);//inputStream.read считывает значения из файла в созданный массив и возвращает значение количества считанных байтов
            System.out.println("num = " + num);
            System.out.println(Arrays.toString(arr));
            for (byte by: arr){
                System.out.print((char)by);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(inputStream!=null){
                    inputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
