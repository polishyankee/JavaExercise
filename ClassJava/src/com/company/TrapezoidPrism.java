package com.company;

public class TrapezoidPrism extends Prism {
    double a,b,h,H;

    TrapezoidPrism( double a,double b,double h, double H) {
        this.a = a;
        this.b=b;
        this.h=h;
        this.H= H;

        evaluateField();
        evaluateVolume();
    }

    @Override
    protected void evaluateBottomField() {
        this.bottomField = (a+b) * h /2;


    }

    @Override
    protected void evaluateVolume() {
        this.volume = (a + b) * h/2 * H;
    }

    @Override
    protected void evaluateField() {
            this.Field= 4*(a*b);
    }

    @Override
    String getFigureInfo() {
        return "Trapezoid";
    }
}
