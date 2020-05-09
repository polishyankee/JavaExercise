package com.company;

        import java.util.Random;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mainscanner = new Scanner(System.in);
        Random mainrandom = new Random();
        int cel = mainrandom.nextInt(50) + 1, strzal;
        int ilosckrokow =0;
        boolean koniec = false;
        System.out.print("Zgadnij liczbe: ");
        for (; ; ) {
            strzal = mainscanner.nextInt();
            if (strzal < cel) {
                System.out.print("\nNie Zgadles! Podaj wieksza liczbe ");

            } else {
                if (strzal > cel)
                    System.out.print("\nNie zgadles! Podaj mniejsza liczbe");
                else {
                    System.out.print("\nZgadles! Zgadles za " +ilosckrokow +" gratulacje: )\n");
                    break;
                }
            }
            ilosckrokow= ilosckrokow +1;
        }
    }
}

