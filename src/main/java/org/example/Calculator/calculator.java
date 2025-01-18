//21/07/2024
package org.example.Calculator;

import org.example.math;

import java.util.Scanner;

public class calculator {
    private static final Scanner sc = new Scanner(System.in);

    static void printChoice() {
        System.out.println("""
                    1.D-M-A-S
                    2.Indices
                    3.Factorial
                    4.Quadratic equation
                    5.Check for prime number
                    6.H.C.F. or L.C.M.
                """);
    }

    public static void run() {
        printChoice();
        int ch1 = math.validateIntInput(sc, 1, 6);
        switch (ch1) {
            case 1:
                DMAS.printChoice();
                int ch2 = math.validateIntInput(sc, 1, 5);
                DMAS dm = new DMAS(ch2);
                dm.input();
                dm.calculate();
                dm.display();
                break;
            case 2:
                indices.printChoice();
                int ch3 = math.validateIntInput(sc, 1, 5);
                indices id = new indices(ch3);
                id.input();
                id.calculate();
                id.display();
                break;
            case 3:
                factorial fc = new factorial();
                fc.input();
                fc.calculate();
                fc.display();
                break;
            case 4:
                quadraticEquation qe = new quadraticEquation();
                qe.input();
                qe.calculate();
                qe.display();
                break;
            case 5:
                primeNumber pn = new primeNumber();
                pn.input();
                pn.calculate();
                pn.display();
                break;
            case 6:
                hcfLcm.printChoice();
                int ch4 = math.validateIntInput(sc, 1, 2);
                hcfLcm hl = new hcfLcm(ch4);
                hl.input();
                hl.calculate();
                hl.display();
                break;
        }
    }
}
