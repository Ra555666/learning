import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mumbling {


    public static String accum(String s) {
        ArrayList<String> resultArray = new ArrayList<String>();
        if (s.matches("[a-zA-Z]+") && s.length() > 2) {
            char characterForArray;
            String stringForArray;
            char[] array = s.toCharArray();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == array.length - 1 && i == array.length - 1) {
                        characterForArray = Character.toLowerCase(array[i]);
                        resultArray.add(String.valueOf(characterForArray));
                    } else if ((j == 0 && i == 0)) {
                        characterForArray = Character.toUpperCase(array[i]);
                        stringForArray = characterForArray + "-";
                        resultArray.add(stringForArray);
                    } else if (j == 0) {
                        characterForArray = Character.toUpperCase(array[i]);
                        resultArray.add(String.valueOf(characterForArray));
                    } else if (j == i) {
                        characterForArray = Character.toLowerCase(array[i]);
                        stringForArray = characterForArray + "-";
                        resultArray.add(stringForArray);
                    } else {
                        characterForArray = Character.toLowerCase(array[i]);
                        resultArray.add(String.valueOf(characterForArray));
                    }
                }
            }

        }
        return String.join("", resultArray);
    }


//    public static void main(String[] args) {
//        String s = "Jopa" ;
//        Mumbling testMumbling = new Mumbling();
//        System.out.println(accum("jopa"));
//
//
//    }
}
