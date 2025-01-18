package org.example.Commerce;

import java.util.Scanner;

public class interest {
    private static final Scanner sc = new Scanner(System.in);
    private final int option;
    private double principal;
    private double rate;
    private double amount;
    private double time;
    private double interest;

    interest(int n) {
        option = n;
    }

    static void printChoice() {
        System.out.println("""
                1.Simple Interest
                2.Compound Interest
                """);
    }

    void input() {
        System.out.println("Enter the principal :");
        principal = sc.nextDouble();
        System.out.println("Enter the rate of interest :");
        rate = sc.nextDouble();
        System.out.println("Enter the time :");
        time = sc.nextDouble();
    }

    void calculate() {
        switch (option) {
            case 1:
                interest = (principal * time * rate) / 100.0;
                amount = principal + interest;
                break;
            case 2:
                amount = principal * Math.pow((1 + (rate / 100.0)), time);
                interest = amount - principal;
                break;
        }
    }

    void display() {
        System.out.println("Interest = " + interest);
        System.out.println("Amount = " + amount);
    }
}