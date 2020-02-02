package com.oracletutorial.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    private static <T> void processLists(List<T> l) {
        for (T p : l) {
            System.out.println(p.toString());
        }
    }

    private static void processLists2(List<?> l) {
        for (Object p: l) {
            System.out.println(p.toString());
        }
    }

    private static void processLists3(List<? extends String> l) {
        for (String p : l) {
            System.out.println(p.toString());
        }
    }

    private static <T extends String> void processLists4(List<T> l) {
        for (String p : l) {
            System.out.println(p.toString());
        }
    }

    public static void main(String[] args) {
        processLists(initStringList());
        lineBreaker();
        processLists2(initStringList());
        lineBreaker();
        processLists3(initStringList());
        lineBreaker();
        processLists4(initStringList());
    }

    public static List<String> initStringList () {
        String s = "acan";
        String y = "dfg";
        String a = "ar";
        String b = "g";
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(y);
        list.add(a);
        list.add(b);
        return list;
    }

    public static void lineBreaker() {
        System.out.println("===============");
    }
}
