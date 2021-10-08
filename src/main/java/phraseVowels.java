package main.java;

import java.util.regex.*;

public class phraseVowels {
    String regex = "[aeiou]";

    public static int phraseVowels(String input, String x){
        int count = 0;

        Pattern p = Pattern.compile(x);
        Matcher m = p.matcher(input);
        while (m.find()) {
            count ++;
        }

        return count;

    }

}
