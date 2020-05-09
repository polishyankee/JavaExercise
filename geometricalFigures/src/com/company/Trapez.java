package com.company;

public class Trapez extends Czworokat {

    double pierwszaPodstawa = 0;
    double drugaPodstawa = 0;
    double wysokosc =0;

    Trapez(double pierwszaPodstawa, double drugaPodstawa, double wysokosc){
        this.pierwszaPodstawa=pierwszaPodstawa;
        this.drugaPodstawa= drugaPodstawa;
        this.wysokosc= wysokosc;
    }


    @Override
    public void obliczPole() {
            polePowierzchni=(pierwszaPodstawa+ drugaPodstawa) *wysokosc / 2;

    }

    @Override
    public boolean czyPoleZostaloZdefiniowane() {
            return true; }
}
