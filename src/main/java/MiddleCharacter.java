public class MiddleCharacter {
    public static String getMiddle(String word) {
//        int length = word.length();
//        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
        String[] wordArray = word.split("");
        String middleCharacter;
        float temp = word.length()/2;
        if (word.length()%2==0){
            return middleCharacter = wordArray[(int)temp-1] + wordArray[(int)temp];
        }
        else {
            return middleCharacter = wordArray[(int)Math.round(temp)];
        }
    }

//    public static void main(String[] args) {
//        System.out.println(getMiddle("a"));
//    }
}
