package epam.input_output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data/out.dat"))) {
            StudentForSerialization student = new StudentForSerialization("Kola",555666,"64998654ff");
            outputStream.writeObject(student);
            //here are need two catch?
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
