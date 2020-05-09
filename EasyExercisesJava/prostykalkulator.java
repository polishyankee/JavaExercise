package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        double x, y, suma, iloraz, iloczyn, roznica, potega;

        Scanner scanner = new Scanner(System.in);

        System.out.println("x: ");
        x = scanner.nextDouble();
        System.out.println("y= ");
        y = scanner.nextDouble();
        suma = x + y;
        System.out.println("Suma wynosi: " + suma);
        iloczyn = x * y;
        System.out.println("iloczyn wynosi: " + iloczyn);
        iloraz = x / y;
        System.out.println("Iloraz wynosi: " + iloraz);
        roznica = x - y;
        System.out.println("Roznica wynosi " + roznica);
        potega = pow(x, y);
        System.out.println("Potega wynosi: " + potega);

        if (x > y) {
            System.out.println("x jest wiekszy od y");
        } else
            System.out.println("y jest wiekszy od x");
    }

}
