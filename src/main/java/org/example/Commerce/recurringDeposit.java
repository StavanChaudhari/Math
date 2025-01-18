package org.example.Commerce;

import java.util.Scanner;

public class recurringDeposit {
    private static final Scanner sc = new Scanner(System.in);

    private double principal;
    private double rate;
    private double maturityValue;
    private double time;
    private double interest;

    void input() {
        System.out.println("Enter the Principal in Rupees :");
        principal = sc.nextDouble();
        System.out.println("Enter the Time Period in months :");
        time = sc.nextDouble();
        System.out.println("Enter the Rate of Interest :");
        rate = sc.nextDouble();
    }

    void calculate() {
        interest = ((principal * time * (time + 1)) / 24.0) * (rate / 100.0);
        maturityValue = (principal * time) + interest;
    }

    void display() {
        System.out.println("Interest = " + interest);
        System.out.println("Maturity Value = " + maturityValue);
    }

}