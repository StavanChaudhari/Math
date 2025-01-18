package org.example.Progression;

import java.util.Scanner;

public class arithmeticProgression extends progression {
    private static final Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the first term :");
        firstTerm = sc.nextDouble();
        System.out.println("Enter the difference :");
        difference = sc.nextDouble();
        System.out.println("Enter the position of term :");
        positionOfTerm = sc.nextInt();
    }

    void calculate() {
        term = firstTerm + difference * (positionOfTerm - 1);
    }

    void display() {
        System.out.println("The " + positionOfTerm + "th term of the arithmetic progression = " + term);
    }
}
