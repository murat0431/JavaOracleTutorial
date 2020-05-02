package com.oracletutorial.learningTheLanguage.basics;

import common.utils.ArrayUtils;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] nums = {1,5,2,3,5,121,4};
        int[] copy = {111,311,211};
        System.arraycopy(nums,1,copy,1,2);
        ArrayUtils.printArray(copy);

        int[] newCopy = Arrays.copyOfRange(nums, 2, 4);
        ArrayUtils.printArray(newCopy);

        Arrays.sort(copy);
        int index = Arrays.binarySearch(copy, 111);
        System.out.println(index);

        boolean isEqual = Arrays.equals(new int[]{1,2,3,4}, new int[]{3,234,1});
        System.out.println(isEqual);

        Arrays.fill(newCopy, -2);
        Arrays.parallelSort(nums);
    }
}
