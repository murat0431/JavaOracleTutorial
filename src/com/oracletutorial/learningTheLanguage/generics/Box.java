package com.oracletutorial.learningTheLanguage.generics;

public class Box<T extends Number> {
    private T o;

    public T getObject() {
        return o;
    }

    public void setObject(T o) {
        this.o = o;
    }
}
