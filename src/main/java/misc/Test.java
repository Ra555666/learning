package misc;

import java.util.Arrays;

public class Test {

    public static String bmi(double weight, double height) {
        double bmi =weight / (height*height);
        if (bmi <= 18.5) return "Underweight";
        if (bmi <= 25.0) return "Normal";
        if (bmi <= 30.0) return "Overweight";
        return "Obese";
        }

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String test = s[0].toUpperCase();
        return String.join("***",test.split(""));
    }

//    public static void main(String[] args) {
//        Test test = new Test();
//        String[] testString = {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
//        System.out.println(test.twoSort(testString));
//        System.out.println( test.bmi(105.0,1.80));
//
//    }
}
