package CodeWars;

import java.text.DecimalFormat;

public class AreaSmallSquare {
    public static double squareArea(double A){
        double circumference = A*4;
        double circleDiameter = circumference/Math.PI;
        return Math.round((circleDiameter/2)*(circleDiameter/2) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        for(int i = 9;i>5;i--){
            System.out.println(i);
        }
    }
}
