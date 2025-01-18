package org.example.Geometry;

import java.util.Scanner;

public class twoDimensionalShapes {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double s1;
    private double s2;
    private double s3;
    private double perimeter;
    private double area;
    private double diagonal;
    private boolean x;

    twoDimensionalShapes(int n) {
        x = true;
        option = n;
    }

    static void printChoice() {
        System.out.println("""
                1.Square
                2.Rectangle
                3.Circle
                4.Parallelogram
                5.Triangle
                """);
    }

    void input() {
        switch (option) {
            case 1:
                System.out.println("Enter the side length :");
                s1 = sc.nextDouble();
                break;
            case 2, 4:
                System.out.println("Enter the length :");
                s1 = sc.nextDouble();
                System.out.println("Enter the width :");
                s2 = sc.nextDouble();
                break;
            case 3:
                System.out.println("Enter the radius :");
                s1 = sc.nextDouble();
                break;
            case 5:
                System.out.println("Enter side one :");
                s1 = sc.nextDouble();
                System.out.println("Enter side two :");
                s2 = sc.nextDouble();
                System.out.println("Enter side three :");
                s3 = sc.nextDouble();
                break;
        }
    }

    void calculate() {
        switch (option) {
            case 1:
                perimeter = s1 * 4;
                area = s1 * s1;
                diagonal = s1 * Math.sqrt(2);
                break;
            case 2:
                perimeter = 2 * (s1 + s2);
                area = s1 * s2;
                diagonal = Math.sqrt(s1 * s1 + s2 * s2);
                break;
            case 3:
                perimeter = 2 * Math.PI * s1;
                area = Math.PI * s1 * s1;
                break;
            case 4:
                perimeter = 2 * (s1 + s2);
                area = s1 * s2;
                break;
            case 5:
                x = ((s1 + s2) > s3) && ((s2 + s3) > s1) && ((s3 + s1) > s2);
                if (x) {
                    perimeter = s1 + s2 + s3;
                    double s = (s1 + s2 + s3) / 2;
                    area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
                } else
                    System.out.println("Triangle invalid");
                break;
        }
    }

    void display() {
        System.out.println("The perimeter = " + perimeter);
        System.out.println("The area = " + area);
        if (diagonal != 0)
            System.out.println("The diagonal = " + diagonal);
    }
}