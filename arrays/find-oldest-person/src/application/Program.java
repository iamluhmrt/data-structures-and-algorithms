package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: Find Oldest Person
         *
         * Description:
         * Write a program that reads a list of names and their respective ages.
         * Store the names and ages in separate arrays.
         * Then, display the name of the oldest person.
         *
         * Category: Arrays
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people are you going to type? ");
        int number = sc.nextInt();

        String[] names = new String[number];
        int[] ages = new int[number];

        for(int i = 0; i < names.length; i++) {
            System.out.printf("Enter the data for person %d:%n", i + 1);
            System.out.print("Name: ");
            names[i] = sc.next();

            System.out.print("Age: ");
            ages[i] = sc.nextInt();
        }
        int oldestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if(ages[i] > ages[oldestIndex]) {
                oldestIndex = i;
            }
        }
        System.out.println("Oldest person: " + names[oldestIndex]);



        sc.close();
    }
}
