package application;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        // Read
        System.out.print("How many numbers are you going to type? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }

        double maxValue = numbers[0];
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("\nHIGHEST VALUE = " + maxValue);
        System.out.println("POSITION OF THE HIGHEST VALUE = " + maxIndex);

        sc.close();
    }
}
