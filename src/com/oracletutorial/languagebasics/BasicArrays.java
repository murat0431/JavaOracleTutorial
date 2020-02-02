package com.oracletutorial.languagebasics;
import java.util.Arrays;
import java.util.List;

public class BasicArrays {
    public static void main(String[] args) {
        int[] myArray = {1,4,1,2,4,1,2,7,7,5};
        List myList = Arrays.asList(myArray);
        Arrays.sort(myArray);
        int[] anotherArray = new int[10];
        Arrays.fill(anotherArray, 2);
        boolean isEqual = Arrays.equals(anotherArray, myArray);
       int result =  Arrays.binarySearch(myArray, 0);
        Arrays.parallelSort(myArray);
       int[] copyArr = Arrays.copyOfRange(myArray, 2, 4);
    }
}
