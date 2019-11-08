package CodeWars;

public class Correct {
    public static String correct(String string) {
//        return string.replace("5","S").replace("0", "O").replace("1","I");
        String[] temp = string.split("");
        for (int i = 0; i < string.length(); i++) {
            switch (temp[i]) {
                case "5":
                    temp[i] = "S";
                    break;
                case "0":
                    temp[i] = "O";
                    break;
                case "1":
                    temp[i] = "I";
                default:
            }
        }
        return String.join("", temp);
    }

//    public static void main(String[] args) {
//        System.out.println(correct("1F-RUDYARD K1PL1NG"));
//
//    }
}
