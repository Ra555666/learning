package CodeWars;

import java.util.Arrays;
import java.util.Collections;

public class ZyWoo {
    public static int sumOfDifferences(int[] arr) {
//        Arrays.sort(arr);
//        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];

        int sum = 0;
        Arrays.sort(arr);
        int x = 0;
        int j = arr.length - 1;
        int tmp;
        while (j > x) {
            tmp = arr[j];
            arr[j] = arr[x];
            arr[x] = tmp;
            j--;
            x++;
        }
        System.out.println();
        for (int i = 0; i<arr.length; i++){
            if(i==arr.length-1){
                return sum;
            }else {
                sum += arr[i] - arr[i+1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10,1,2};
//        System.out.println(Arrays.toString(arr));
        System.out.println(sumOfDifferences(arr));
    }
}
