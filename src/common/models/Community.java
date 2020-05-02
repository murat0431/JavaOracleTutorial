package common.models;

import common.interfaces.Printable;
import common.interfaces.Subscribable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Community implements Subscribable, Printable<Person> {
    private Set<Person> personSet;

    public Community() {
        personSet = new HashSet<>();
    }

    @Override
    public void print(Predicate<Person> predicate) {
        for(Person p : personSet) {
            if(predicate.test(p)) print(p);
        }
    }

    private <T> void print(T o) {
        if(o instanceof Person) {
            Person p = (Person) o;
            System.out.println(p.getAge() + " " + p.getName() + " " + p.getGender() + " " + p.getNetWorth());
        } else {
            System.out.println("This is not a person!");
        }
    }

    public void action(Predicate<Person> predicate, Consumer<String> consumer, Function<Person, String> fc) {
       for(Person p : personSet) {
           if(predicate.test(p)) {
               String s = fc.apply(p);
               consumer.accept(s);
           }
       }
    }

    @Override
    public boolean subscribe(Person p) {
        if(p != null) {
            personSet.add(p);
            return true;
        }
        return false;
    }

    @Override
    public boolean unsubscribe(Person p) {
        if(!personSet.isEmpty() && !personSet.contains(p)) {
            personSet.remove(p);
            return true;
        }
        return false;
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }
}
