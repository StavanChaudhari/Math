package org.example.Calculator;

import java.util.Scanner;

public class primeNumber {
    private static final Scanner sc = new Scanner(System.in);

    private double number;
    private double temp_number;
    private boolean answer;

    void input() {
        System.out.println("Enter the number :");
        number = sc.nextDouble();
        temp_number = number;
    }

    void calculate() {
        number = Math.abs(number);
        answer = !(number <= 1);
        for (int i = 2; i <= (Math.sqrt(number)); i++) {
            if (number % i == 0) {
                answer = false;
                break;
            }
        }
    }

    void display() {
        if (!answer)
            System.out.println(temp_number + " is a composite number");
        else
            System.out.println(temp_number + " is a prime number");
    }
}