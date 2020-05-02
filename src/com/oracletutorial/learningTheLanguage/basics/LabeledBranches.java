package com.oracletutorial.learningTheLanguage.basics;

public class LabeledBranches {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {2,5},
                {7,9}
        };
    search:
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == 7) break search;
            }
        }
    anotherSearch:
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt != 7) continue anotherSearch;
            }
        }
    }
}
