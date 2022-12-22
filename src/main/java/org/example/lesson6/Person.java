package org.example.lesson6;

public class Person {
    String name;
    int age;

    public static void main (String[] args) {
        Person dima = new Person();
        dima.name = "Dima";
        dima.age = 33;

        System.out.println(dima.name);
        System.out.println(dima.age);

        Person some = new Person();
        some.name = "Some";
        some.age = Integer.MAX_VALUE;

        System.out.println(some.name);
        System.out.println(some.age);
    }
}
