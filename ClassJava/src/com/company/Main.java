package com.company;

import java.util.ArrayList;

public class Main {
    static ArrayList<Prism> mPrisms = new ArrayList<>();

    public static void main(String[] args) {

            mPrisms.add(new RectangularPrism(5,5,5));
            mPrisms.add(new RectangularPrism(10,5,5));

            mPrisms.add(new Cube(5));
            mPrisms.add(new Cube(10));

//            for(Prism prism : mPrisms)
//                prism.print();

            RectangularPrism rp = new RectangularPrism(10,5,5);
            TrapezoidPrism nnp= new TrapezoidPrism(2,4,7,10);

            mPrisms.add(new TrapezoidPrism(5,6,3,8));
            mPrisms.add(new TrapezoidPrism(5,10,5,9));
            mPrisms.add(new Cube(5));
            mPrisms.add(new RectangularPrism(8,9,4));


        for(Prism prism : mPrisms)
            prism.print();
        }
    }

