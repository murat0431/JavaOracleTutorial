package com.oracletutorial.generics;

import java.lang.reflect.Parameter;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Pair<Integer> p = new Pair(3,4);
        p.display();
        p.setX(7);
        p.display();

         */
        /*
        int[] arr = new int[] {2, 3, 5, 9, 12, 43, 23, 1, 0, 55};
        int element = 24;
        System.out.println(countGreaterThan(arr, element));
         */
        Pair[] arr = initializeStringPairs();
        Pair element = new Pair("Murat", "Kara");
        System.out.println(genericCountGreaterThan(arr, element));
    }

    public static int countGreaterThan(int[] arr, int element) {
        int count = 0;
        for(int i : arr) {
            if(i > element) count++;
        }
        return count;
    }

    public static <T extends Comparable<T>> int genericCountGreaterThan(T[] arr, T element) {
        int count = 0;
        for(T el: arr) {
            if(el.compareTo(element) > 0) count++;
        }
        return count;
    }

    public static Pair[] initializeStringPairs() {
        Pair[] list = new Pair[6];
        list[0] = new Pair<>("A" , "B");
        list[1] = new Pair<>("BAA" , "ZB");
        list[2] = new Pair<>("FAGAA" , "DBZ");
        list[3] = new Pair<>("GAGGA" , "DSDB");
        list[4] = new Pair<>("ABAH" , "YTRB");
        list[5] = new Pair<>("MADFA" , "PPB");
        return list;
    }
}
