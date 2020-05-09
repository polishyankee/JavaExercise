package com.company;

public class TriangularPrism extends Prism {
    double a,b,c,h,H;

    TriangularPrism(double a, double h, double H)
    {
        this.a = a;
        this.h = h;
        this.H = H;

        obliczPolePowierzchniPodstawy();
        obliczPolePowierzchniBocznej();
        obliczPolePowierzchniCalkowite();
        obliczObjetosc();

    }

    double obliczPolePowierzchniPodstawy() {
        this.polePowierzchniPodstawy = a * a * Math.pow(3,0.5)/4;
        return polePowierzchniPodstawy;
    }
    double obliczPolePowierzchniBocznej() {
        this.polePowierzchniBocznej = 3 * a * H;
        return polePowierzchniBocznej;
    }
    double obliczPolePowierzchniCalkowite() {
        this.polePowierzchniCalkowite = 2 * polePowierzchniPodstawy + polePowierzchniBocznej;
        return polePowierzchniCalkowite;
    }

   double obliczObjetosc() {
        this.objetosc = polePowierzchniPodstawy *H;
        return objetosc;
    }


    @Override
    String getStringInfo() {
        {return "Funkcja z klasy Triangular Prism";}
    }
}
