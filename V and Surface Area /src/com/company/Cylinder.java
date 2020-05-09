package com.company;

public class Cylinder extends Prism {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;

        obliczObjetosc();
        obliczPolePowierzchniCalkowite();
        obliczPolePowierzchniPodstawy();
        obliczPolePowierzchniBocznej();

    }

    double obliczPolePowierzchniCalkowite() {
        this.polePowierzchniCalkowite = 2 * Math.PI *r*r + 2* Math.PI * r*h;
    return polePowierzchniCalkowite;
    }

     double obliczPolePowierzchniPodstawy() {
        this.polePowierzchniPodstawy = 2* Math.PI *r*r;
         return polePowierzchniPodstawy;
     }

    @Override
    double obliczPolePowierzchniBocznej() {
        this.polePowierzchniBocznej = 2* Math.PI *h;
        return polePowierzchniBocznej;
    }

    double obliczObjetosc() {
        this.objetosc = Math.PI* r*r *h;
   return objetosc;
    }

    @Override
    String getStringInfo() {
        {
            return "Funkcja z klasy Cylinder";
        }
    }

}
