import static java.lang.Integer.*;

public class Positive {
    public static int sum(int[] arr) {
        int sumPositiveNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                sumPositiveNumbers+=0;
            }else {
                sumPositiveNumbers += arr[i];
            }
        }
        return sumPositiveNumbers;
    }
}
