package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kwardat");
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 15; j++) {
                System.out.print("#");
            }
        }
        System.out.println("\n\nProstokąt");
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 25; j++) {
                System.out.print("#");
            }
        }

        System.out.println("\n\nTrapez");
        for (int i = 10; i < 15; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println("\n\nChoinka");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("#");
            System.out.println("");
        }


    }
}
