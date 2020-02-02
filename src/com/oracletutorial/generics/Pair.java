package com.oracletutorial.generics;

public class Pair<T extends Comparable<T>> implements Comparable<Pair<T>>{
    private T x;
    private T y;
    public Pair(T x, T y) {
        this.x = x;
        this.y = y;
    }
    void display() {
        System.out.println("X is: " + x.toString());
        System.out.println("Y is: " + y.toString());
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }


    @Override
    public int compareTo(Pair<T> o) {
        return o.y.compareTo(y);
    }
}
