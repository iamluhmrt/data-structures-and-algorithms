package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: Multiplication Table
         *
         * Description:
         * Write a program that reads an integer N.
         * Then, print the multiplication table of N from 1 to 10.
         *
         * Example:
         * Input: 5
         * Output:
         * 5 x 1 = 5
         * 5 x 2 = 10
         * ...
         * 5 x 10 = 50
         *
         * Category: Loops
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = readPositiveInt(sc, "Enter a positive integer: ");
        printMultiplicationTable(number);

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

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result );
        }
    }

}
