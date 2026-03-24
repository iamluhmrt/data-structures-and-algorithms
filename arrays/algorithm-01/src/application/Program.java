package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        boolean isValidInput = false;

        // Validation loop for array size
        do {
            System.out.print("How many numbers are you going to type (0-10)? ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 0 && n <= 10) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid range! Please enter a value between 0 and 10.");
                }
            }
            else {
                System.out.println("Invalid input! Please enter an integer number.");
                sc.next(); // Clears the invalid buffer
            }

        } while (!isValidInput);

        int[] numbers = new int[n];

        // Filling the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        // Displaying negative numbers
        System.out.println("\nNEGATIVE NUMBERS:");
        boolean hasNegative = false;
        for (int num : numbers) {
            if (num < 0) {
                System.out.println(num);
                hasNegative = true;
            }
        }

        if (!hasNegative) {
            System.out.println("None.");
        }

        sc.close();
        System.out.println("\nProgram finished.");
    }
}
