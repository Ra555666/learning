package CodeWars;

public class TestClass {
    long sq = 121;

    public static long findNextSquare(long sq) {
        if ((long)(Math.sqrt(sq)) < Math.sqrt(sq) || (long)(Math.sqrt(sq)) > Math.sqrt(sq)) {
            return -1;
        } else {
            long sqrtSq = (long) Math.sqrt(sq);
            long nextStep = (sqrtSq * 2) + 1;
            long nextSquare = nextStep + sq;
            return nextSquare;
        }
    }

//    public static void main(String[] args) {
//        CodeWars.TestClass test = new CodeWars.TestClass();
//        System.out.println(findNextSquare(625));
//
//    }
}

