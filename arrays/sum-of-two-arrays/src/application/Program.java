package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: Sum of Two Arrays
         *
         * Description:
         * Write a program that reads two arrays A and B with N elements each.
         * Then, generate a third array C where each element is the sum of
         * the corresponding elements from A and B.
         * Finally, print the resulting array.
         *
         * Category: Arrays
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // Read
        System.out.print("How many numbers are you going to each array? ");
        int n = sc.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        int[] arrayC = new int[n];


        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Enter the number " + (i + 1) + " to fill the array A: ");
            arrayA[i] = sc.nextInt();
        }


        for (int i = 0; i < arrayB.length; i++) {
            System.out.print("Enter the number " + (i + 1) + " to fill the array B: ");
            arrayB[i] = sc.nextInt();

            // Calc
            arrayC[i] = arrayA[i] + arrayB[i];

        }

        System.out.println("\nINDEX | ARRAY A | ARRAY B | SUM");
        System.out.println("------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d | %-6d | %-6d | %-5d%n", i, arrayA[i], arrayB[i], arrayC[i]);
        }

        sc.close();
    }
}
