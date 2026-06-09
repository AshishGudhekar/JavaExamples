package com.java.list;

public class Person implements Comparable<Person>{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age + " years old";
    }

    @Override
    public int compareTo(Person o){
        return Integer.compare(this.age, o.age);
    }

}

