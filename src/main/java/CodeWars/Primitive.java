package CodeWars;

import java.math.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Primitive {

    public String determineType(String number) {
//        try { Byte.parseByte(number); return "byte"; } catch (NumberFormatException e) {}
//        try { Short.parseShort(number); return "short"; } catch (NumberFormatException e) {}
//        try { Integer.parseInt(number); return "int"; } catch (NumberFormatException e) {}
//        try { Long.parseLong(number); return "long"; } catch (NumberFormatException e) {}
//        return "none";
        try{
            long n = Long.parseLong(number);
            if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                return "byte";
            if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                return "short";
            if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                return "int";
            return "long";
        }catch(Exception ignored){}
        return "none";
    }


//    public static void main(String args[]) {
//        String number = "54654";
//    }
}
