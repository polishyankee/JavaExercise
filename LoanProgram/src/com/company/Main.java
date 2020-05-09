package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program sprzedazy ratalnej!");
        System.out.println("Bank udziela kredytow od 100zl do 10tys zl");
        System.out.print("Podaj kwote: ");
        double kwota;
        Scanner odczyt = new Scanner(System.in);
        kwota = odczyt.nextDouble();
        if(kwota<100 || kwota>10000){
            System.out.println("Bledne dane!");
        }
        System.out.print("Podaj liczbe rat: ");
        int rata;
        Scanner odczytRat = new Scanner(System.in);
        rata = odczytRat.nextInt();
        if(rata<6 || rata>48){
            System.out.println("Błędne dane!");
            System.out.println("Bank rozkłada od 6 do 48 rat");
        }
        if(rata>=6 && rata<=12){
            double odsetki = kwota+ (kwota * 0.025);
            System.out.println("Koszt kredytu to: " +odsetki);
        }
        else if(rata>=13 && rata <=24){
            double odsetki1 = kwota+(kwota * 0.05);
            System.out.println("Koszt kredytu to: " +odsetki1);
        }
        else if(rata>=25 && rata<=48){
            double odsetki2 = kwota+ (kwota * 0.10);
            System.out.println("Koszt kredytu to: " +odsetki2);
        }
        else{
            System.out.println("Popraw dane!");
        }
}

}