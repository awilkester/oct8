package main.java;

public class Main {
    public static void main(String[] args) {
        trapFind t = new trapFind();
        String ex1 = "There is a trap.";
        String ex2 = "Hey, did you think there is a TRAP?";
        String ex3 = "This goes traaa!!!";
        System.out.println(t.trapFind(ex1));
        System.out.println(t.trapFind(ex2));
        System.out.println(t.trapFind(ex3));
    }
}
