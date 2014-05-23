package com.gwyn.oop;

/**
 * Created by glockett.
 */
public class Person {

    private String name;
    private int weight;

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void print() {
        System.out.println(name, weight);

    }
}
