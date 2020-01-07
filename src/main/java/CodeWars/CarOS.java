package CodeWars;

public class CarOS {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (int)distanceToPump==(int)(mpg*fuelLeft);
    }
}
