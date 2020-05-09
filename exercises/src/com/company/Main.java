package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

   public class Main {
            public static void main(String[] args) throws NumberFormatException,
                    IOException {
                BufferedReader reader = new BufferedReader(new
                        InputStreamReader(System.in));
                int a, b, c, delta;
                double pdelta, x0, x1, x2;
                System.out.print("Funkcja kwadratowa ma postać Ax^2+Bx+C\nWprowadź wartość dla A: ");
                a = Integer.parseInt(reader.readLine());
                System.out.print("Wprowadź wartość dla B: ");
                b = Integer.parseInt(reader.readLine());
                System.out.print("Wprowadź wartość dla C: ");
                c = Integer.parseInt(reader.readLine());
                delta = (b * b - 4 * a * c);
                pdelta = Math.sqrt(delta);
                if (delta > 0) {
                    x1 = (-b - pdelta) / (2 * a);
                    x2 = (-b + pdelta) / (2 * a);
                    System.out.println("Delta wynosi: " + delta + "\nX1 wynosi: " + x1 + "\nX2 wynosi: " + x2);
                } else if (delta == 0) {
                    x0 = -b / (2 * a);
                    System.out.println("Delta wynosi:" + delta + "\nX0 wynosi: " + x0);
                } else {
                    double i = -1^1/2;
                    x1 = (-b - i *pdelta) / (2 * a);
                    x2 = (-b + i *pdelta) / (2 * a);
                    System.out.println("Delta jest ujemna i wynosi: " + delta + "\nX1 wynosi: " + x1 + "\nX2 wynosi: " + x2);
                    System.out.println("I wynosi "+ i);

                }
            }
        }

