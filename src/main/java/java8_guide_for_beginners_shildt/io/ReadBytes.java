package java8_guide_for_beginners_shildt.io;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) {
        byte[] data = new byte[10];//create byte array with size 10
        System.out.println("Input symbols.");
        try {
            System.in.read(data);//accept user input from console
            System.out.println("You are input: ");
            for (int i = 0; i<data.length;i++ ){
                System.out.print(data[i]);//output arrays content into console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
