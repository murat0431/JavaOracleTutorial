package com.oracletutorial.learningTheLanguage.generics;

import javax.lang.model.util.ElementFilter;
import java.util.*;

class WildCard {
    public static void main(String[] args) {
        List<? extends A> l1 = new ArrayList<>();
        List<B> l2 = new ArrayList<>();
        l1.add(null);
        l2.add(new B());
        l1.clear();
        l1=l2;

        List[] arrayOfLists = new List[2];  // compile-time error
        arrayOfLists[0] = new ArrayList();
        arrayOfLists[1] = new LinkedList();


    }
    void foo(List<?> list) {
        fooHelper(list);
    }

    //Helper method to capture wildcard
    private <T> void fooHelper(List<T> list) {
        list.set(0, list.get(0));
    }
}
class A {

}

class B extends A {

}
