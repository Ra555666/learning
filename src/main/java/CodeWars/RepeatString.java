package CodeWars;

public class RepeatString {
    public static String repeatStr(final int repeat, final String string) {
        String multiplyString = "";
        if(repeat>0) {
            for (int i = 0; i < repeat; i++) {
                multiplyString += string;
            }
        }else {
            return "";
        }
        return string;
    }

    public static void main(String[] args) {
        RepeatString test = new RepeatString();
        System.out.println(repeatStr(4,"a"));
        repeatStr(4,"a");
    }
}

