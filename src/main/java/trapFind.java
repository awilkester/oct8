package main.java;

import java.util.regex.*;

public class trapFind {

    public static String trapFind(String input){
        Pattern p = Pattern.compile("trap");
        Matcher m = p.matcher(input.toLowerCase());
        if (m.find()) {
            return "BOO!!";
        } else {
            return "Relax, there is no trap.";
        }
    }

}
