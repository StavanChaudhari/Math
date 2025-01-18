package org.example.Commerce;

import org.example.math;

import java.util.Scanner;

public class commerce {
    private static final Scanner sc = new Scanner(System.in);

    static void printChoice() {
        System.out.println("""
                    1.Interest
                    2.Recurring Deposit Account
                """);
    }

    public static void run() {
        printChoice();
        int ch1 = math.validateIntInput(sc, 1, 2);
        switch (ch1) {
            case 1:
                interest.printChoice();
                int ch2 = math.validateIntInput(sc, 1, 2);
                interest it = new interest(ch2);
                it.input();
                it.calculate();
                it.display();
                break;
            case 2:
                recurringDeposit rd = new recurringDeposit();
                rd.input();
                rd.calculate();
                rd.display();
                break;
        }
    }
}