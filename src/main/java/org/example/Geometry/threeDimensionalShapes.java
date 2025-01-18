package org.example.Geometry;

import java.util.Scanner;

public class threeDimensionalShapes {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double s1;
    private double s2;
    private double s3;
    private double tsa;
    private double volume;
    private double diagonal;
    private boolean x;

    threeDimensionalShapes(int n) {
        x = true;
        option = n;
    }

    static void printChoice() {
        System.out.println("""
                1.Cube
                2.Cuboid
                3.Sphere
                4.Hemisphere
                5.Cone
                6.Cylinder
                7.Pyramid
                8.Triangular Prism
                """);
    }

    void input() {
        switch (option) {
            case 1:
                System.out.println("Enter the side length :");
                s1 = sc.nextDouble();
                break;
            case 2:
                System.out.println("Enter the length :");
                s1 = sc.nextDouble();
                System.out.println("Enter the width :");
                s2 = sc.nextDouble();
                System.out.println("Enter the height :");
                s3 = sc.nextDouble();
                break;
            case 3, 4:
                System.out.println("Enter the radius :");
                s1 = sc.nextDouble();
                break;
            case 5, 6:
                System.out.println("Enter the radius :");
                s1 = sc.nextDouble();
                System.out.println("Enter the height :");
                s2 = sc.nextDouble();
                break;
            case 7:
                System.out.println("Enter the length :");
                s1 = sc.nextDouble();
                System.out.println("Enter the breadth :");
                s2 = sc.nextDouble();
                System.out.println("Enter the height :");
                s3 = sc.nextDouble();
                break;
            case 8:
                // "diagonal" used instead of "height of the prism"
                System.out.println("Enter the base side 'A' :");
                s1 = sc.nextDouble();
                System.out.println("Enter the base side 'B' :");
                s2 = sc.nextDouble();
                System.out.println("Enter the base side 'C' :");
                s3 = sc.nextDouble();
                System.out.println("Enter the height :");
                diagonal = sc.nextDouble();
                break;
        }
    }

    void calculate() {
        switch (option) {
            case 1:
                tsa = 6 * s1 * s1;
                volume = s1 * s1 * s1;
                diagonal = s1 * Math.sqrt(3);
                break;
            case 2:
                tsa = 2 * (s1 * s2 + s2 * s3 + s1 * s3);
                volume = s1 * s2 * s3;
                diagonal = Math.sqrt(s1 * s1 + s2 * s2 + s3 * s3);
                break;
            case 3:
                tsa = 4 * Math.PI * s1 * s1;
                volume = (4.0 / 3.0) * Math.PI * s1 * s1 * s1;
                break;
            case 4:
                tsa = 2 * Math.PI * s1 * s1;
                volume = (2.0 / 3.0) * Math.PI * s1 * s1 * s1;
                break;
            case 5:
                s3 = Math.sqrt(s1 * s1 + s2 * s2);
                tsa = Math.PI * s2 * (s3 + s2);
                volume = Math.PI * s2 * s2 * s1 / 3.0;
                break;
            case 6:
                tsa = 2 * Math.PI * s1 * (s1 + s2);
                volume = Math.PI * s1 * s1 * s2;
                break;
            case 7:
                tsa = s1 * s2 + s1 * Math.sqrt(s2 / 2 * s2 / 2 + s3 * s3)
                        + s2 * Math.sqrt(s1 / 2 * s1 / 2 + s3 * s3);
                volume = (s1 * s2 * s3) / 3;
                break;
            case 8:
                // "diagonal" used instead of "height of the prism"
                x = ((s1 + s2) > s3) && ((s2 + s3) > s1) && ((s3 + s1) > s2);
                if (x) {
                    double s = (s1 + s2 + s3) / 2;
                    tsa = 2 * diagonal * (s1 + s2 + s3) + 2 * Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
                    volume = diagonal * Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
                } else
                    System.out.println("Prism invalid");
                break;
        }
    }

    void display() {
        if (x) {
            System.out.println("The T.S.A. = " + tsa);
            System.out.println("The volume = " + volume);
            if (diagonal != 0 && option != 8)
                System.out.println("The diagonal = " + diagonal);
        }
    }
}