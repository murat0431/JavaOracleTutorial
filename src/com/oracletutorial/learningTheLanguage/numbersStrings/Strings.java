package com.oracletutorial.learningTheLanguage.numbersStrings;

public class Strings {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('2'));
        double x = 2.24;
        String s = String.format("%.3f", x);
        System.out.println(s);
        System.out.println(Integer.valueOf("324242"));
        System.out.println(Integer.parseInt("23"));
        System.out.println("   afojpogjga " + "   afojpogjga   ".trim());
    }
}
