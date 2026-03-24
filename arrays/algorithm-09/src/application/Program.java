package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
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
