package main.java;

public class Main {
    public static void main(String[] args) {
        TrapFind t = new TrapFind();
        String ex1 = "There is a trap.";
        String ex2 = "Hey, did you think there is a TRAP?";
        String ex3 = "This goes traaa!!!";
//        System.out.println(t.trapFind(ex1));
//        System.out.println(t.trapFind(ex2));
//        System.out.println(t.trapFind(ex3));

        RemoveVowels x = new RemoveVowels();
        System.out.println(x.removeVowels("I have never seen a thin person drinking Diet Coke."));
        System.out.println(x.removeVowels("We're gonna build a wall!"));
        System.out.println(x.removeVowels("Happy Thanksgiving to all--even the haters and losers!"));
        System.out.println(x.removeVowels2("I have never seen a thin person drinking Diet Coke."));
        System.out.println(x.removeVowels2("We're gonna build a wall!"));
        System.out.println(x.removeVowels2("Happy Thanksgiving to all--even the haters and losers!"));
    }
}
