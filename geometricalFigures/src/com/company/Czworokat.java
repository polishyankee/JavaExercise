package com.company;

public class Czworokat {
    double polePowierzchni = 0;

    public void obliczPole(){
    }

    public double getPolePowierzchni(){
        return polePowierzchni;
    }

    public boolean czyPoleZostaloZdefiniowane(){
        return false;
    }

    public void wyswietl(){
        System.out.print("Pole powierzchni: ");

        if(czyPoleZostaloZdefiniowane())
            System.out.println(polePowierzchni);
        else
            System.out.println("pole powierzchni nie zostało zdefiniowane");
    }
}

