package org.example.Calculator;

import java.util.Scanner;

public class DMAS {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double n1;
    private double n2;
    private double answer;

    DMAS(int n) {
        option = n;
    }

    static void printChoice() {
        System.out.println("""
                1.Addition
                2.Subtraction
                3.Multiplication
                4.Division
                5.Reminder
                """);
    }

    void input() {
        System.out.println("Enter number one :");
        n1 = sc.nextInt();
        System.out.println("Enter number two :");
        n2 = sc.nextInt();
    }

    void calculate() {
        switch (option) {
            case 1:
                answer = n1 + n2;
                break;
            case 2:
                answer = n1 - n2;
                break;
            case 3:
                answer = n1 * n2;
                break;
            case 4:
                answer = n1 / n2;
                break;
            case 5:
                answer = n1 % n2;
                break;

        }
    }

    void display() {
        System.out.println("The answer = " + answer);
    }
}