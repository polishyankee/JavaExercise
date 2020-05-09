package com.company;

abstract public class Prism {
    protected double polePowierzchniPodstawy;
    protected double polePowierzchniBocznej;
    protected double polePowierzchniCalkowite;
    protected double objetosc;

abstract double  obliczPolePowierzchniPodstawy();
abstract double  obliczPolePowierzchniBocznej();
abstract double  obliczPolePowierzchniCalkowite();
abstract double  obliczObjetosc();

abstract String getStringInfo();
protected String info() {return "Funkcja z klasy bazowej Prism";}

void print()
{
    System.out.println(getStringInfo());
    System.out.println("Pole powierzchni podstawy wynosi: " + polePowierzchniPodstawy);
    System.out.println("Pole powierzchni bocznej wynosi: "+ polePowierzchniBocznej);
    System.out.println("Pole powierzchni calkowite wynosi: "+ polePowierzchniCalkowite);
    System.out.println("Objetosc wynosi: " + objetosc);

}






}


