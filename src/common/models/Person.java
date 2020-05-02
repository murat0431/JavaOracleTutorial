package common.models;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private Gender gender;
    private int netWorth;

    public Person(int age, String name, Gender gender, int netWorth) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.netWorth = netWorth;
    }

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getNetWorth() {
        return netWorth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender, netWorth);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Person p = (Person) obj;
        return age == p.getAge() &&
                name.equals(p.getName()) &&
                gender.equals(p.getGender()) &&
                netWorth == p.getNetWorth();
    }

    public void print() {
        System.out.println(name + " " + age + " " + gender + " " + netWorth);
    }
}
