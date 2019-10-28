import java.io.IOException;
import java.io.PipedReader;

public class TryCatchTraining {

    void getAllScores() throws IOException, NullPointerException {
        PipedReader file = null;
        file.read();
    }


//    public static void main(String[] args) {
//        TryCatchTraining test = new TryCatchTraining();
//        System.out.println("Score list");
//
//        try {
//            test.getAllScores();
//            System.out.println("nothing");
//        } catch (IOException | NullPointerException e) {
//            e.printStackTrace();
//            System.out.println("Fuck Yeah!");
//        }finally {
//            System.out.println("It's ALIVE!!!");
//        }
//    }
}
