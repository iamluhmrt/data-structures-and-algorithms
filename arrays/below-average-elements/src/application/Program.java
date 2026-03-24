package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: Below Average Elements
         *
         * Description:
         * Write a program that reads an integer N and then N real numbers
         * into an array.
         * Then, calculate and display the average of the array.
         * After that, display all elements that are below the average.
         *
         * Category: Arrays
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the array contain? ");
        int arraySize = sc.nextInt();

        double[] numbers = new double[arraySize];
        double totalSum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextDouble();
            totalSum = totalSum + numbers[i];
        }

        double average = totalSum / arraySize;
        System.out.printf("Array average = %.3f%n", average);
        System.out.println("Elements below average: ");

        for (double number : numbers) {
            if(number < average) {
                System.out.printf("%.1f%n",number);
            }
        }





        sc.close();
    }

}
