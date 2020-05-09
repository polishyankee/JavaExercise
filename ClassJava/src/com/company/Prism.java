package com.company;

abstract public class Prism {
    double bottomField;
    double volume;
    double Field;

    abstract protected void evaluateBottomField();
    abstract protected void evaluateVolume();
    abstract protected void evaluateField();


    abstract String getFigureInfo();

    protected String info(){
        return "Prism - funkcja z klasy bazowej";
    }

    void print(){
        System.out.println(info());

        System.out.println(getFigureInfo());
        System.out.println("Pole powierzchni: "+ bottomField);
        System.out.println("Objetosc: "+volume);
        System.out.println("Pole powierzchni bocznej: " + Field);
    }
}