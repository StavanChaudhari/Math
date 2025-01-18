package org.example.Calculator;

import java.util.Scanner;

public class quadraticEquation {
    private static final Scanner sc = new Scanner(System.in);

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    void input() {
        System.out.println("Enter a :");
        a = sc.nextDouble();
        System.out.println("Enter b :");
        b = sc.nextDouble();
        System.out.println("Enter c :");
        c = sc.nextDouble();
    }

    void calculate() {
        x1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        x2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    void display() {
        System.out.println("x = {" + x1 + "," + x2 + "}");
    }

}