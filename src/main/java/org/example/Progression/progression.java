package org.example.Progression;

import org.example.math;

import java.util.Scanner;

public class progression {
    private static final Scanner sc = new Scanner(System.in);

    protected static double firstTerm;
    protected static double difference;
    protected static double term;
    protected static int positionOfTerm;

    static void printChoice() {
        System.out.println("""
                1.Arithmetic progression
                2.Geometric progression
                """);
    }

    public static void run() {
        printChoice();
        int ch1 = math.validateIntInput(sc, 1, 2);
        switch (ch1) {
            case 1:
                arithmeticProgression ap = new arithmeticProgression();
                ap.input();
                ap.calculate();
                ap.display();
                break;
            case 2:
                geometricProgression gp = new geometricProgression();
                gp.input();
                gp.calculate();
                gp.display();
                break;
        }
    }
}