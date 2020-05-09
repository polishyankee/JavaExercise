package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner obj=new Scanner(System.in);
                double area;

                System.out.println(" Pierwsza podstawa trapezu =  ");
                double a = obj.nextDouble();
                System.out.println("Druga podstawa trapezu =  ");
                double b = obj.nextDouble();
                System.out.println("Wysokosc trapezu = ");
                double hgt = obj.nextDouble();
                area = 0.5 * (a+b) * hgt;
                System.out.println("Pole = "+area);
            }








}





