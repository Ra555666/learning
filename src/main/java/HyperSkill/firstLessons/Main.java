package HyperSkill.firstLessons;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        String d = scanner.next();
        String e = scanner.next();

        String plus = "+";
        String minus = "-";
        String val = "x";

        if (b.equals(plus)) {
            if (a.equals(val)) {
                System.out.println(Integer.parseInt(e) - Integer.parseInt(c));
            } else if (c.equals(val)) {
                System.out.println(Integer.parseInt(e) - Integer.parseInt(a));
            } else if (e.equals(val)) {
                System.out.println(Integer.parseInt(c) + Integer.parseInt(a));
            }

        } else if (b.equals(minus)) {
            if (a.equals(val)) {
                System.out.println(Integer.parseInt(e) + Integer.parseInt(c));
            } else if (c.equals(val)) {
                System.out.println(Integer.parseInt(a) - Integer.parseInt(e));
            } else if (e.equals(val)) {
                System.out.println(Integer.parseInt(a) - Integer.parseInt(c));
            }

        } else if (d.equals(plus)) {
            if (a.equals(val)) {
                System.out.println(Integer.parseInt(c) + Integer.parseInt(e));
            } else if (c.equals(val)) {
                System.out.println(Integer.parseInt(a) - Integer.parseInt(e));
            } else if (e.equals(val)) {
                System.out.println(Integer.parseInt(a) - Integer.parseInt(c));
            }

        } else if (d.equals(minus)) {
            if (a.equals(val)) {
                System.out.println(Integer.parseInt(c) - Integer.parseInt(e));
            } else if (c.equals(val)) {
                System.out.println(Integer.parseInt(a) + Integer.parseInt(e));
            } else if (e.equals(val)) {
                System.out.println(Integer.parseInt(c) - Integer.parseInt(a));
            }
        }
    }
}


