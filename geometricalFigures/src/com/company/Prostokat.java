package com.company;

public class Prostokat extends Czworokat{
    double dlugosc = 0;
    double szerokosc = 0;

    Prostokat(double dlugosc, double szerokosc){
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    @Override
    public void obliczPole(){
        polePowierzchni = dlugosc*szerokosc;
    }

    @Override
    public boolean czyPoleZostaloZdefiniowane() {
        return true;
    }
}
