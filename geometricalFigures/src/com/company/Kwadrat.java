package com.company;

public class Kwadrat extends Czworokat {

    double dlugosc = 0;

    Kwadrat(double dlugosc){
        this.dlugosc=dlugosc;

    }

    @Override
    public void obliczPole() {
        polePowierzchni= dlugosc*dlugosc;

    }

    @Override
    public boolean czyPoleZostaloZdefiniowane() {
        return true;

    }
}

