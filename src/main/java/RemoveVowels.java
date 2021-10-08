package main.java;
import java.util.regex.*;
public class RemoveVowels {

    public static String removeVowels2(String input){
        String result = input.replaceAll("[aeiouAEIOU]", "");
        return result;
    }
    public static String removeVowels(String input){
        Pattern t = Pattern.compile("[aeiouAEIOU]");
        return t.matcher(input).replaceAll("");

    }


}
