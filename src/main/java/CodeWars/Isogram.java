

package CodeWars;


public class Isogram {
    public static boolean  isIsogram(String str) {
        String ready = str.toLowerCase();
        char[] inp = ready.toCharArray();
        for (int i = 0; i < ready.length(); i++) {
            for (int j = i + 1; j < ready.length(); j++) {
                if (inp[i] == inp[j]) {
                    return false;
                }
            }
        }
        return true;
//        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
    }
}
