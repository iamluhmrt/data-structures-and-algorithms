package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: Count Divisors
         *
         * Description:
         * Write a program that reads an integer N.
         * Then, count how many integers from 1 to N divide N exactly.
         *
         * Example:
         * Input: 6
         * Output: 4  // (1, 2, 3, 6)
         *
         * Category: Loops
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = readPositiveInt(sc, "Enter a positive integer: ");
        int divisorCount = countDivisorsOf(number);
        System.out.println(divisorCount);
        sc.close();

    }

    public static int readPositiveInt(Scanner sc, String message) {

        while (true) {
            System.out.print(message);

            try {
                int number = sc.nextInt();

                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please enter a number greater than 0.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer number.");
                sc.next(); // clear the invalid input from the buffer
            }
        }
    }

    public static int countDivisorsOf(int number) {

        int divisorCount = 0;
        for (int i = 1; i <= number; i++) { // check all possible divisors
            if (number % i == 0) {
                divisorCount++;
            }
        }

        return divisorCount;
    }
}
