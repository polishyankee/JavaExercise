package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Codon cod = new Codon();

        System.out.println("Wprowadz przykladowa sekwencje kwasu deoksyrybonukleinowego: ");
        Scanner scanner = new Scanner(System.in);
        String templateStrand = scanner.next();
        String mRNA = Strand.mRNA(templateStrand);
        System.out.println("Komplementarna sekwencja: " + Strand.complementaryStrand(templateStrand));
        System.out.println("Sekwencja mRNA: " +mRNA );
        String ramkaOdczytu = cod.locateStopCodon(cod.locateStartCodon(mRNA));
        System.out.println("Ramka odczytu         : " + ramkaOdczytu);
        System.out.println("Pozycja Start         : " +cod.startCodonPosition );
        System.out.println("Pozycja Stop          : " +cod.stopCodonPosition );
        System.out.println("Sekwencja Aminokwasów : " +cod.toCodon(ramkaOdczytu));
        System.out.println(" Pełna sekwencja/ Uwzgłędnić kodony star-stop? (y/n)" );
        String daneuzytkownika  = scanner.next();
        if(daneuzytkownika.equalsIgnoreCase("y"))
        {
            System.out.println("Sekwencja aminkowasów  : " + cod.toCodon(mRNA));

        }

    }
}
