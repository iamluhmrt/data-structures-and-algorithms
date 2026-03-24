package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int[] numbers = new int[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        int evenCount = 0;
        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                evenCount++;
            }
        }

        System.out.println();
        System.out.println("Quantity of even numbers = " + evenCount);


        sc.close();
    }
}
