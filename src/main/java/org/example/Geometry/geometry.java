package org.example.Geometry;

import org.example.math;

import java.util.Scanner;

public class geometry {
    private static final Scanner sc = new Scanner(System.in);

    static void printChoice() {
        System.out.println("""
                	1.Regular polyhedron
                	2.Two dimensional shapes
                	3.Three dimensional shapes
                	3.Co-ordinate geometry
                	4.Trigonometry
                """);
    }

    public static void run() {
        printChoice();
        int ch1 = math.validateIntInput(sc, 1, 4);
        switch (ch1) {
            case 1:
                regularPolyhedron.printChoice();
                int ch2 = math.validateIntInput(sc, 1, 5);
                regularPolyhedron rp = new regularPolyhedron(ch2);
                rp.input();
                rp.calculate();
                rp.display();
                break;
            case 2:
                twoDimensionalShapes.printChoice();
                int ch3 = math.validateIntInput(sc, 1, 5);
                twoDimensionalShapes tds = new twoDimensionalShapes(ch3);
                tds.input();
                tds.calculate();
                tds.display();
                break;
            case 3:
                threeDimensionalShapes.printChoice();
                int ch4 = math.validateIntInput(sc, 1, 8);
                threeDimensionalShapes Tds = new threeDimensionalShapes(ch4);
                Tds.input();
                Tds.calculate();
                Tds.display();
                break;
            case 4:
                coordinateGeometry.printChoice();
                int ch5 = math.validateIntInput(sc, 1, 4);
                coordinateGeometry cg = new coordinateGeometry(ch5);
                cg.input();
                cg.calculate();
                cg.display();
                break;
            case 5:
                trigonometry.printChoice();
                int ch6 = math.validateIntInput(sc, 1, 6);
                trigonometry tg = new trigonometry(ch6);
                tg.input();
                tg.calculate();
                tg.display();
                break;
        }
    }
}
