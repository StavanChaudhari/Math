package org.example.Geometry;

import java.util.Scanner;

public class regularPolyhedron {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double s1;
    private double tsa;
    private double volume;
    private double area;
    private double diagonal;

    regularPolyhedron(int n) {
        option = n;

    }

    static void printChoice() {
        System.out.println("""
                1.Tetrahedron
                2.Hexahedron
                3.Octahedron
                4.Dodecahedron
                5.Icosahedron
                """);
    }

    void input() {
        System.out.println("Enter the side length :");
        s1 = sc.nextDouble();
    }

    void calculate() {
        switch (option) {
            case 1:
                area = ((Math.sqrt(3)) / 4) * (s1 * s1);
                tsa = 4 * area;
                volume = (s1 * s1 * s1) / (6 * Math.sqrt(2));
                diagonal = s1 * Math.sqrt(3);
                break;
            case 2:
                area = s1 * s1;
                tsa = 6 * area;
                volume = s1 * s1 * s1;
                break;
            case 3:
                area = (Math.sqrt(3) / 4.0) * (s1 * s1);
                tsa = area * 8;
                volume = (Math.sqrt(2) / 3.0) * (s1 * s1 * s1);
                break;
            case 4:
                s1 = sc.nextDouble();
                area = 1.0 / 4.0 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * (s1 * s1);
                tsa = area * 12;
                volume = ((15 + 7 * Math.sqrt(5)) / 4.0) * (s1 * s1 * s1);
                break;
            case 5:
                area = (Math.sqrt(3) / 4.0) * (s1 * s1);
                tsa = 20 * area;
                volume = ((5 * (3 + Math.sqrt(5))) / 12.0) * (s1 * s1 * s1);
                break;
        }

    }

    void display() {
        System.out.println("The surface area = " + area);
        System.out.println("The total surface area = " + tsa);
        System.out.println("The volume = " + volume);
        if (diagonal != 0)
            System.out.println("The diagonal = " + diagonal);
    }
}