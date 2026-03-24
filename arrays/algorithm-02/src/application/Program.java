package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantity = 0;
        boolean isValidInput = false;

        // Read and validate the quantity of numbers
        do {
            System.out.print("How many numbers are you going to type? ");
            if (sc.hasNextInt()) {
                quantity = sc.nextInt();
                if (quantity > 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Please enter a number greater than 0.");
                }

            } else {
                System.out.println("Invalid input! Please enter an integer number.");
                sc.next();
            }
        } while (!isValidInput);

        double[] numbers = new double[quantity];


        // Fill the array with numbers typed by the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");

            while (!sc.hasNextDouble()) {
                System.out.println("Invalid number! Try again.");
                sc.next();
            }

            numbers[i] = sc.nextDouble();
        }

        double sum = 0.0;

        // Print values and calculate the sum
        System.out.print("\nValues = ");
        for (double num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }

        // Calculate the average
        double average = sum / quantity;

        System.out.printf("%nSum = %.2f%nAverage = %.2f", sum, average);


        sc.close();
    }
}
