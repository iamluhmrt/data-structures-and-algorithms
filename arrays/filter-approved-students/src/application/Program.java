package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: Filter Approved Students
         *
         * Description:
         * Write a program that reads the names of N students along with their
         * grades from the first and second semesters.
         * Store the data in arrays.
         * Then, display the names of students whose average grade is
         * greater than or equal to 6.0.
         *
         * Category: Arrays
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("How many students will you enter? ");
        int students = sc.nextInt();

        String[] name = new String[students];
        double[] n1 = new double[students];
        double[] n2 = new double[students];

        for(int i = 0; i < students; i++) {
            System.out.print("Enter name and two grades for student #" + (i + 1) + ": ");

            name[i] = sc.next();
            n1[i] = sc.nextDouble();
            n2[i] = sc.nextDouble();

        }
        int count = 0;
        System.out.println("\nApproved students:");
        for (int i = 0; i < name.length; i++) {
            double average = (n1[i] + n2[i]) / 2.0;
            if (average >= 6.0) {
                System.out.println(name[i]);
                count++;
            }
        }

        if(count ==0) {
            System.out.println("No students were approved.");
        }

        sc.close();
    }
}
