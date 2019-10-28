import java.lang.reflect.Array;
import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] numbersArray = numbers.split(" ");
        int[] sortArray = new int[numbersArray.length];
        for (int i = 0; i<numbersArray.length;i++ ) {
            sortArray[i] = Integer.parseInt(numbersArray[i]);
            System.out.println(sortArray[i]);
        }
        Arrays.sort(sortArray);
        String resultHighAndLow = Integer.toString(sortArray[sortArray.length-1]) + " " + Integer.toString(sortArray[0]);
        return resultHighAndLow;
    }

    public static void main(String[] args) {
        System.out.println( highAndLow("0 -9 4 7 4 -4"));

    }
}
