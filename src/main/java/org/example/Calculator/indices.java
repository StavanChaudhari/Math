package org.example.Calculator;

import java.util.Scanner;

public class indices {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double n1;
    private double n2;
    private double answer;

    indices(int n) {
        option = n;
    }

    static void printChoice() {
        System.out.println("""
                1.Square
                2.Cube
                3.Power
                4.N-th root of x
                5.Natural log
                """);
    }

    void input() {
        switch (option) {
            case 1:
            case 2:
            case 5:
                System.out.println("Enter the number :");
                n1 = sc.nextDouble();
                break;
            case 3:
                System.out.println("Enter the base :");
                n1 = sc.nextDouble();
                System.out.println("Enter the power :");
                n2 = sc.nextDouble();
                break;
            case 4:
                System.out.println("Enter the the value under root");
                n1 = sc.nextDouble();
                System.out.println("Enter the value of 'n'");
                n2 = sc.nextDouble();
                break;
        }
    }

    void calculate() {
        switch (option) {
            case 1:
                answer = n1 * n1;
                break;
            case 2:
                answer = n1 * n1 * n1;
                break;
            case 3:
                answer = Math.pow(n1, n2);
                break;
            case 4:
                answer = Math.pow(n1, (1.0 / n2));
                break;
            case 5:
                answer = Math.log(n1);
                break;
        }
    }

    void display() {
        System.out.println("The answer = " + answer);
    }
}
