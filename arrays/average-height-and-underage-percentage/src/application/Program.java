package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: Average Height and Underage Percentage
         *
         * Description:
         * Write a program to read the name, age, and height of N people.
         * Then, display the average height of the group and the percentage
         * of people under 16 years old, along with their names.
         *
         * Category: Arrays
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberOfPeople = 0;
        boolean validInput = false;

        // Read and validate the number of people
        do {
            System.out.print("How many people will be entered? ");
            if (sc.hasNextInt()) {
                numberOfPeople = sc.nextInt();
                if (numberOfPeople > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer number.");
                sc.next();
            }
        } while (!validInput);

        Person[] people = new Person[numberOfPeople];

        // Read the data of each person and store it in the people array
        sc.nextLine(); // clear buffer before loop

        for (int i = 0; i < people.length; i++) {
            System.out.println("Data of person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine(); // clear buffer for next iteration

            people[i] = new Person(name, age, height);
        }

        // --- Statistics calculation ---

        // Calculate the total height and count how many people are under 16
        double sumHeight = 0.0;
        int countUnder16 = 0;
        StringBuilder under16Names = new StringBuilder();
        for (Person person : people) {
            sumHeight += person.getHeight();

            if (person.getAge() < 16) {
                countUnder16++;
                under16Names.append(person.getName()).append(System.lineSeparator());
            }
        }

        // Calculate the average height
        double averageHeight = sumHeight / people.length;

        // Calculate the percentage of people under 16
        double percentageUnder16 = (double) countUnder16 / people.length * 100;

        System.out.printf("%nAverage height: %.2f%n", averageHeight);
        System.out.printf("People under 16 years old: %.2f%%%n", percentageUnder16);
        System.out.println("People under 16:");
        System.out.print(under16Names);

        System.out.println("\nPeople entered:");
        for (Person person : people) {
            System.out.println(person);
        }
        sc.close();
    }
}
