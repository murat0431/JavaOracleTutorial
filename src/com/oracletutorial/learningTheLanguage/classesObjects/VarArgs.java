package com.oracletutorial.learningTheLanguage.classesObjects;

public class VarArgs {

    public void printNames(String... names) {
        System.out.println("Number of the names is: " + names.length);
        for(String name : names) System.out.println(name);
    }
}
