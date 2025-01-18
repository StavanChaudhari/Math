package org.example.Geometry;

import java.util.Scanner;

public class trigonometry {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double answer;
    private double input;

    trigonometry(int n) {
        option = n;
    }

    static void printChoice() {
        System.out.println("""
                1.Sine
                2.Co-sine
                3.Tangent
                4.Co-tangent
                5.Secant
                6.Co-secant
                """);
    }

    void input() {
        System.out.println("Enter the angle of reference in degrees :");
        input = sc.nextDouble();
        input = Math.toRadians(input);
    }

    void calculate() {
        switch (option) {
            case 1:
                answer = Math.sin(input);
                break;
            case 2:
                answer = Math.cos(input);
                break;
            case 3:
                answer = Math.tan(input);
                break;
            case 4:
                answer = 1.0 / (Math.tan(input));
                break;
            case 5:
                answer = 1.0 / (Math.cos(input));
                break;
            case 6:
                answer = 1.0 / (Math.sin(input));
                break;
        }
    }

    void display() {
        System.out.println("Answer=" + answer);
    }
}
