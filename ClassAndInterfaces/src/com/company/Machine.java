package com.company;

import java.util.Scanner;

public class Machine implements Info {


    Scanner scanner = new Scanner(System.in);
    private int id = scanner.nextInt();


    public void start() {
        System.out.println("Machine started.");
    }

    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}
