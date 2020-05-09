package com.company;

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Wprowadz dwie liczby: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Podaj operatora (+, -, *, /, ^, #): ");
        char operator = reader.next().charAt(0);
        double result;
        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
            case'^':
                result= Math.pow(first,second);
                break;
            default:
                System.out.printf("Blad! Zly operator! ");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
