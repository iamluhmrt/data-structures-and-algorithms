package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
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
