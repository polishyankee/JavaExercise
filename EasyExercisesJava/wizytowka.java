package com.company;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                String imie, nazwisko, adres, wiek, zawod;

                Scanner scanner = new Scanner(System.in);

                System.out.print("Wprowadź imię: ");
                imie = scanner.next();

                System.out.println("Wprowadzono: " + imie);


                System.out.print("Wprowadz nazwisko: ");
                nazwisko = scanner.next();
                System.out.println("Wprowadzono: " + nazwisko);

                System.out.println("_____________________");
                System.out.println(imie + " " + nazwisko);
                System.out.println("_____________________");
                System.out.print("wprowadz wiek");
                wiek = scanner.next();
                System.out.println("wprowadzono wiek" + " " + wiek);
                System.out.println("___________");
                System.out.println("Wprowadz adres zamieszkania");
                adres = scanner.next();
                System.out.println("wprowadzono" + " " + adres);
                System.out.println("__________");
                zawod= scanner.next();
                System.out.println("Wprowadz zawód"+  zawod);

                System.out.println(imie + " " + nazwisko);
                System.out.println(wiek);
                System.out.println(adres);
                System.out.println(zawod);
            }
        }

