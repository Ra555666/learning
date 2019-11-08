package SoloLearn.CodingChallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean validator(String password) {
        byte wellChecks = 0;
        Pattern specialCharacters = Pattern.compile("[^A-Za-z0-9]");
        Pattern digits = Pattern.compile("[0-9]");
        Pattern whitespace = Pattern.compile(" ");
        Matcher matcher = specialCharacters.matcher(password);
        boolean match = matcher.find();
        if(match)
            wellChecks++;
        matcher = digits.matcher(password);
        match = matcher.find();
        if(match)
            wellChecks++;
        matcher = whitespace.matcher(password);
        match = matcher.find();
        if (!match)
            wellChecks++;
        if (password.length() >= 5 && password.length() <= 10)
            wellChecks++;
        return wellChecks == 4;
    }

    public static void main(String[] args) {
        System.out.println(validator("aaaaa1@"));
    }
}
