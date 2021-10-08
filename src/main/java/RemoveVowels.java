package main.java;
import java.util.regex.*;
public class RemoveVowels {
    public static String removeVowels(String input){
        Pattern t = Pattern.compile("[aeiouAEIOU]");
        return t.matcher(input).replaceAll("");

    }


}
