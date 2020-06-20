package com.oracletutorial.learningTheLanguage.numbersStrings;

import java.util.Random;

import static java.lang.Math.*;

public class Numbers {
    public static void main(String[] args) {
        System.out.format("%.1f%n", sin(toRadians(30)));
        System.out.printf("%.3f %.4f%n", E, PI);
        System.out.printf("%.2f", random());
        Random r = new Random();
        Integer.valueOf(25);
        Integer.valueOf(25).intValue();
    }
}
