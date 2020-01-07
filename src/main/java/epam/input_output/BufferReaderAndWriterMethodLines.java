package epam.input_output;

import java.io.*;
import java.util.ArrayList;

public class BufferReaderAndWriterMethodLines {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data/source.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/rhyme.txt"))){

            ArrayList<String> strings = new ArrayList<>();

            bufferedReader.lines().forEach(strings::add);



//            bufferedWriter.write(strings.toString());
            /*ArrayList<String> strings = new ArrayList<>();
            bufferedReader.lines().forEach(strings::add);
            System.out.println(strings);//save to array*/
//            bufferedReader.lines().forEach(System.out::println);// Input to console
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
