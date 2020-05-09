package com.company;

 public class Cube extends Prism {
        double a;

        Cube(double a) {
            this.a = a;

            evaluateField();
            evaluateVolume();
        }

        @Override
        protected void evaluateBottomField() {
            this.bottomField = a * a;
        }

        @Override
        protected void evaluateVolume() {
            this.volume = a * a * a;
        }

     @Override
     protected void evaluateField() {
            this.Field= 4*(a*a);
     }

     @Override
        String getFigureInfo() {
            return "Cube";
        }
    }

