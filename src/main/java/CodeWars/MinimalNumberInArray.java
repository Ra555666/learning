package CodeWars;

import java.util.Arrays;

public class MinimalNumberInArray {
    public static int minimalNumber(int[] args){
        Arrays.sort(args);
        return args[0];
//        int min = numArr[0];
//        for (int i : numArr){
//            if (i<min){
//                min = i;
//            }
//        }
//        return min;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
