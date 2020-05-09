package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Prism> mPrisms = new ArrayList<>();

    public static void main(String[] args) {

//Cylinder c1 = new Cylinder(5,7);
//TriangularPrism t1 = new TriangularPrism(4,5,10);
//Sphere s1 = new Sphere(4);
//TriangularPrism p1 = new TriangularPrism(4,8,10);

mPrisms.add(new Cylinder(5,7));
mPrisms.add(new Cylinder(4,10));
mPrisms.add(new Sphere(7));
mPrisms.add(new Sphere(5));
mPrisms.add(new TriangularPrism(5,7,10));
mPrisms.add(new TriangularPrism(3,4,5));
mPrisms.add(new TriangularPrism(9,7,10));
mPrisms.add(new Sphere(55));


for (Prism prism : mPrisms)
    prism.print();

    }
}
