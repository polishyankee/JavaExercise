package com.company;

public class Main {

    public static void main(String[] args) {
        int size = 23;

        for (int i = 1; i < size; i += 2) {
            for (int k = size; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= size; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print(" ");
            }
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
