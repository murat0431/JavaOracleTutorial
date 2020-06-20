package com.oracletutorial.learningTheLanguage.generics;

import java.io.Serializable;
import java.util.*;

public class Driver extends WildCard{
    public static void main(String[] args) {
        Box<Double> b = new Box<>();
        Number i = b.getObject();
        System.out.println(i);
        Box a = new Box();

        toLowerCase("MMMBAC");
        System.out.println();

        List<Integer> list = Arrays.asList(1, 4 ,3);
        printList(list);

        WildCard wc = new WildCard();
        wc.foo(Arrays.asList(2, 4, 5));


    }

    private static <U extends CharSequence & Serializable> void toLowerCase(U s) {
        for(int i=0;i<s.length();i++) {
            System.out.print((char)(s.charAt(i)-'A'+'a'));
        }
    }

    private static <T extends Comparable<T>> int greaterThan(T[] elements, T comp) {
        int count =0;
        for (T elem : elements) {
            if(elem.compareTo(comp)>0) ++count;
        }
        return count;
    }

    private static double process(List<? extends Number> list) {
        double sum = 0.0;
        for (Number d : list)
            sum += d.doubleValue();
        return sum;
    }

    private static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    private static void printStrings(List<? super String> list) {
        for (Object s : list)
            System.out.println(s);
    }
}