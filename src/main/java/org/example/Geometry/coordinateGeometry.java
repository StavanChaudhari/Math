package org.example.Geometry;

import java.util.Scanner;

public class coordinateGeometry {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double answer1;
    private double answer2;
    private double m1;
    private double m2;

    coordinateGeometry(int n) {
        option = n;
    }

    static void printChoice() {
        System.out.println("""
                1.Distance Formula
                2.Section Formula
                3.Mid point Formula
                4.Slope of line
                """);
    }

    void input() {
        System.out.println("Enter the abscissa of point one :");
        x1 = sc.nextDouble();
        System.out.println("Enter the ordinate of point one :");
        y1 = sc.nextDouble();
        System.out.println("Enter the abscissa of point two :");
        x2 = sc.nextDouble();
        System.out.println("Enter the ordinate of point two :");
        y2 = sc.nextDouble();
        if (option == 2) {
            System.out.println("Enter the ratio(m1) :");
            m1 = sc.nextDouble();
            System.out.println("Enter the ratio(m2) :");
            m2 = sc.nextDouble();
        }
    }

    void calculate() {
        switch (option) {
            case 1:
                double x = x1 * x1 - x2 * x2;
                double y = y1 * y1 - y2 * y2;
                answer1 = Math.sqrt(x + y);
                break;
            case 2:
                answer1 = ((m1 * x2 + m2 * x1) / m1 + m2);
                answer2 = ((m1 * y2 + m2 * y1) / m1 + m2);
                break;
            case 3:
                answer1 = ((x1 + x2) / 2);
                answer2 = ((y1 + y2) / 2);
                break;
            case 4:
                answer1 = (y2 - y1) / (x2 - x1);
                break;
        }
    }

    void display() {
        switch (option) {
            case 1:
                System.out.println("The distance between the points = " + answer1);
                break;
            case 2:
                System.out.println("The point of intersection = (" + answer1 + "," + answer2 + ")");
                break;
            case 3:
                System.out.println("The mid point = (" + answer1 + "," + answer2 + ")");
                break;
            case 4:
                System.out.println("The slope of the line = " + answer1);
                break;
        }
    }
}