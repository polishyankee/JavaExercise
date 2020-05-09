package com.company;

public class Sphere extends Prism {
    double r;
    Sphere( double r)
    {
        this.r =r;

        obliczObjetosc();
        obliczPolePowierzchniCalkowite();



    }

    double obliczObjetosc() {
        this.objetosc = 4/3 * Math.PI* r*r*r;
return objetosc;
    }

    @Override
    double obliczPolePowierzchniPodstawy() {
        return 0;
    }

    @Override
    double obliczPolePowierzchniBocznej() {
        return 0;
    }

  double obliczPolePowierzchniCalkowite() {
   this.polePowierzchniCalkowite = 4* Math.PI * r*r;
   return polePowierzchniCalkowite;
    }


    @Override
    String getStringInfo() {
        {return "Funkcja z klasy Sphere";}
    }
}
