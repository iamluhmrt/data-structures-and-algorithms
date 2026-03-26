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

        int n = getValidPositiveInt(sc, "How many numbers for each array? ");

        int[] arrayA = readArray(sc, n, 'A');
        int[] arrayB = readArray(sc, n, 'B');

        int[] arrayC = calculateSum(arrayA, arrayB);

        displayTable(arrayA, arrayB, arrayC);

        sc.close();
    }

    // --- Logic Methods ---

    public static int[] readArray(Scanner sc, int n, char label) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter number %d for Array %c: ", (i + 1), label);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] calculateSum(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    public static void displayTable(int[] a, int[] b, int[] c) {
        System.out.println("\nINDEX | ARRAY A | ARRAY B | SUM");
        System.out.println("------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-5d | %-7d | %-7d | %-5d%n", i, a[i], b[i], c[i]);
        }
    }

    // --- Validation Methods ---

    public static int getValidPositiveInt(Scanner sc, String message) {
        int value = -1;
        while (value <= 0) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value <= 0) {
                    System.out.println("Error: Enter a positive number.");
                }
            } else {
                System.out.println("Error: Invalid input!");
                sc.next();
            }
        }
        return value;
    }
}