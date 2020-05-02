package com.oracletutorial.learningTheLanguage.classesObjects;

import common.models.Community;
import common.models.Day;
import common.models.Gender;
import common.models.Person;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaExpressions {
    public static void main(String[] args) {
        /**
         * Most used Functional Interfaces
         *         Consumer;
         *         Predicate;
         *         Function;
         *         Comparator;
         */


        Community cm = new Community();
        cm.subscribe(new Person(12, "Anna", Gender.MALE, 40));
        cm.subscribe(new Person(13, "Jen", Gender.FEMALE, 23));
        cm.subscribe(new Person(32, "Maya", Gender.FEMALE, 150));
        cm.subscribe(new Person(43, "Cal", Gender.MALE, 55));
        cm.subscribe(new Person(20, "Chelsea", Gender.FEMALE, 50));
        //cm.print();
        //cm.printWealthyWoman();

        cm.action(p -> p.getAge() > 10 && p.getName().startsWith("C"),
                p -> System.out.println(p),
                p-> p.getGender().toString()
        );
        System.out.println("--------------------");
        Set<Person> set = cm.getPersonSet();
        set.stream().
                map(p -> p.getGender()).
                filter(p -> p==Gender.MALE).
                forEach(p-> System.out.println(p));

        long l = set.stream().filter(p->p.getNetWorth()>40).count();
        System.out.println("L is : " + l);
        set.stream().
                map(p -> p.getName()).
                distinct().
                findFirst().ifPresent(p-> System.out.println("My name is : " + p));

        int sum = set.stream().
                filter(p->p.getGender()==Gender.FEMALE).
                mapToInt(p->p.getNetWorth()).
                sum();
        System.out.println("Sum is: " + sum);
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(new ArrayList<>());
        ls.add(new ArrayList<>());
        ls.get(0).add(1);
        ls.get(1).add(2);
        ls.get(0).add(5);
        ls.get(1).add(23);

        ls.stream().
                map(p->p.stream()).findFirst();

        Comparator<int[]> ab = Comparator.comparing(a->a[0]);

        Predicate<Integer> predicate = (p) -> p>0;
        System.out.println(isPositive(predicate, 0));

        Consumer<String> cs = (p) -> System.out.println(p.charAt(0));
        Function<String, Integer> fn = (p) -> p.length() + 2;
        BiFunction<String, String, StringBuilder> bf = (a, b) -> new StringBuilder(a).append(b);
        Comparator<Person> cmp = Comparator.comparingInt(Person::getAge);
        Supplier<Person> sp = () -> new Person(2, "A", Gender.MALE, 34);

        List<String> myList = Arrays.asList("a", "b", "4");
        myList.stream().
                filter(p->p.startsWith("a") || Character.isDigit(p.charAt(0))).
                map(p -> "My current value is: " + p).
                sorted(Comparator.reverseOrder()).
                forEach(System.out::println);

        Supplier<Person> spp = () -> new Person();

        //OptionalInt.of(Day.FRIDAY.getNumber());

    }

    public static boolean isPositive(Predicate<Integer> predicate, int a) {
        return predicate.test(a);
    }


    //public static List<>


}
