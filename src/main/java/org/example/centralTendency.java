package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class centralTendency {
    private static final Scanner sc = new Scanner(System.in);

    static void run() {
        System.out.println("Enter number of observations :");
        int noOfOb = sc.nextInt();
        double[] a = new double[noOfOb];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter no." + (i + 1) + " :");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double sum = 0;
        for (double v : a) {
            sum += v;
        }
        double mean = sum / noOfOb;
        double median;
        if (noOfOb % 2 == 0) {
            double m1 = a[noOfOb / 2 - 1];
            double m2 = a[noOfOb / 2];
            median = ((m1 + m2) / 2.0);
        } else {
            median = a[noOfOb / 2];
        }
        double cn = a[0];
        double mode = cn;
        int cc = 1;
        int mc = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == cn) {
                cc++;
            } else {
                cn = a[i];
                cc = 1;
            }

            if (cc > mc) {
                mc = cc;
                mode = cn;
            }
        }

        System.out.println("The mean = " + mean);
        System.out.println("The median = " + median);
        System.out.println("The mode = " + mode);
        System.out.println("Sorted array in ascending = ");
        System.out.print(a[0]);
        for (int i = 1; i < noOfOb; i++) {
            System.out.print(" , " + a[i]);
        }
        System.out.println();
        System.out.println("Sorted array in descending = ");
        System.out.print(a[noOfOb - 1]);
        for (int i = noOfOb - 2; i >= 0; i--) {
            System.out.print(" , " + a[i]);
        }
        System.out.println();
    }
}