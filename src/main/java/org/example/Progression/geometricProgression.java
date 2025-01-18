package org.example.Progression;

import java.util.Scanner;

public class geometricProgression extends progression {
    private static final Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the first term :");
        firstTerm = sc.nextDouble();
        System.out.println("Enter the the common ratio :");
        difference = sc.nextDouble();
        System.out.println("Enter the position of term :");
        positionOfTerm = sc.nextInt();
    }

    void calculate() {
        term = firstTerm * Math.pow(difference, (positionOfTerm - 1));
    }

    void display() {
        System.out.println("The " + positionOfTerm + "th term of the geometric progression = " + term);
    }
}
