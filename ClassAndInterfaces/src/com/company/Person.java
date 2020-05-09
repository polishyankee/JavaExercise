package com.company;

public class Person implements Info {


    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello there. I'm " + name + " and I'm " + age +  " years old." );
    }
    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);

    }
}


