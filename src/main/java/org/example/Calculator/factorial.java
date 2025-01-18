package org.example.Calculator;

import java.util.Scanner;

public class factorial {
    private static final Scanner sc = new Scanner(System.in);

    private double n1;
    private double answer;

    void input() {
        System.out.println("Enter the number :");
        n1 = sc.nextInt();
    }

    void calculate() {
        answer = 1;
        while (n1 > 0) {
            answer *= n1;
            n1--;
        }
    }

    void display() {
        System.out.println("The answer = " + answer);
    }
}