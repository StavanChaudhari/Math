package org.example.Calculator;

import java.util.Scanner;

public class hcfLcm {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double number1;
    private double number2;
    private double number1_temp;
    private double number2_temp;

    hcfLcm(int n) {
        option = n;
    }

    static void printChoice() {
        System.out.println("""
                1.H.C.F. of two numbers
                2.L.C.M. of two numbers
                """);
    }

    void input() {
        System.out.println("Enter the first number :");
        number1 = sc.nextDouble();
        System.out.println("Enter the second number :");
        number2 = sc.nextDouble();
        number1_temp = number1;
        number2_temp = number2;
    }

    void calculate() {
        switch (option) {
            case 1:
                while (number2 != 0) {
                    double temp = number2;
                    number2 = number1 % number2;
                    number1 = temp;
                }
                break;
            case 2:
                while (number2 != 0) {
                    double temp = number2;
                    number2 = number1 % number2;
                    number1 = temp;
                }
                number1 = Math.abs(number1_temp * number2_temp) / number1;
        }
    }

    void display() {
        String s = switch (option) {
            case 1 -> "H.C.F.";
            case 2 -> "L.C.M.";
            default -> "";
        };
        System.out.println(s + " of " + number1_temp + " and " + number2_temp + " = " + number1);
    }
}