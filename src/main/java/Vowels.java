public class Vowels {
    public static int getCount(String str) {
//        return str.replaceAll("(?i)[^aeiou]", "").length();
        int vowelsCount = 0;
        String[] temp = str.split("");
        for (int i =0; i< temp.length; i++){
            if (temp[i].contains("a")||temp[i].contains("e")||temp[i].contains("i")||temp[i].contains("o")||temp[i].contains("u")){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("babeli"));

    }
}
