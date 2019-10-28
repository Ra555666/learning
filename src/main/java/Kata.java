public class Kata {
    public static String stringy(int size) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            String brick = (i % 2 != 0 )? "1" :  "0";
            resultString.append(brick);
        }
        return resultString.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(stringy(12));
//    }
}


