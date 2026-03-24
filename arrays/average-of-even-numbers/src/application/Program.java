package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: Average of Even Numbers
         *
         * Description:
         * Write a program that reads N integers into an array.
         * Then, calculate and display the average of only the even numbers.
         * If there are no even numbers, display a message indicating that.
         *
         * Category: Arrays
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the array contain? ");
        int[] numbers = new int[sc.nextInt()];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        double totalSum = 0.0;
        int evenCount = 0;
        for(int num : numbers) {
            if(num % 2 == 0) {
                totalSum = totalSum + num;
                evenCount++;
            }
        }

        if(evenCount > 0) {
            double average = totalSum / evenCount;
            System.out.printf("Average of the pairs = %.2f", average);
        } else {
            System.out.println("No even number");
        }

        sc.close();
    }
}
