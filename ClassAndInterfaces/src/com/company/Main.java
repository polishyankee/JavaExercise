package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Provide the machine id which is suppose to start: " );
        Machine mach1 = new Machine();
        mach1.start();
        mach1.showInfo();

        Person person1 = new Person("Bob",25);
        person1.greet();

        Person person2 = new Person("Jack",45);
        person2.greet();

        System.out.println("Provide the machine id which is suppose to start: " );
        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        System.out.println();

        outputInfo(person1);
        outputInfo(person2);

    }


    private static void outputInfo(Info info) {
        info.showInfo();
    }
    }

