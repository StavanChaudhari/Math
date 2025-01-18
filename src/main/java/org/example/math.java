package org.example;

import org.example.Calculator.calculator;
import org.example.Commerce.commerce;
import org.example.Geometry.geometry;
import org.example.Progression.progression;

import java.time.LocalDate;
import java.util.Scanner;

public class math {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
        System.out.println(LocalDate.now() + "\n");
        new math().run();
    }

    static void defaultPrint() {
        System.out.println("Enter a valid input");
    }

    static void printChoice() {
        System.out.println("""
                      1. Geometry
                      2. Calculator
                      3. Commerce
                      4. Central Tendency
                      5. Progression
                      6. Exit
                """);
    }

    public static int validateIntInput(Scanner sc, int min, int max) {
        int input;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
            input = sc.nextInt();
            sc.nextLine();
            if (!(min <= input && max >= input)) {
                System.out.println("Input must be between " + min + " and " + max + ".");
            }
        } while (!(min <= input && max >= input));
        return input;
    }

    public void run() {
        int chf;
        boolean running = true;
        while (running) {
            try {
                System.out.println("Welcome to math calculator");
                System.out.println("Enter the number before the desired options");
                printChoice();
                chf = math.validateIntInput(sc, 1, 6);
                switch (chf) {
                    case 1:
                        geometry.run();
                        break;
                    case 2:
                        calculator.run();
                        break;
                    case 3:
                        commerce.run();
                        break;
                    case 4:
                        centralTendency.run();
                        break;
                    case 5:
                        progression.run();
                        break;
                    case 6:
                        running = false;
                        break;
                }
                if (running) {
                    System.out.println("\nPress Enter to continue...");
                    sc.nextLine();
                }
            } catch (Exception e) {
                defaultPrint();
                System.exit(0);
            }
        }
    }
}