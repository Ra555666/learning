package misc;

import java.util.Arrays;

public class Recursion {
    public static float factorial(float x) {
        if (x == 1)
            return x;
        return factorial(x - 1) * x;
    }

//    Дано натуральное число n. Выведите все числа от 1 до n.

    public static String rangeNumbers(int x) {
        if (x == 1) {
            return "1"+ " iteration";
        }
        return rangeNumbers(x - 1) + " " + x +" iteration";
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
        System.out.println(rangeNumbers(10));
    }
}
