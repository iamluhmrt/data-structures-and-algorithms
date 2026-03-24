package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Problem: People Height and Gender Statistics
         *
         * Description:
         * Given a dataset containing the height and gender (M, F) of N people,
         * write a program that calculates and displays the minimum and maximum
         * heights, the average height of women, and the number of men.
         *
         * Category: Arrays
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed? ");
        int n = sc.nextInt();
        int[] number = new int[n];
        char[] gender = new char[n];
        double[] height = new double[n];

        for(int i = 0; i < number.length; i++) {
            System.out.printf("Height of the #%d person: ", (i + 1));
            height[i] = sc.nextDouble();

            System.out.printf("Gender (M/F) of the #%d person: ",(i + 1));
            gender[i] = sc.next().charAt(0);
        }


        double lowestHeight = height[0];
        double highestHeight = height[0];

        for(int i = 1; i < height.length; i++) {
            if(height[i] < lowestHeight) {
                lowestHeight = height[i];
            }

            if(height[i] > highestHeight) {
                highestHeight = height[i];
            }

        }

        int countWoman = 0;
        int countMan = 0;
        double womanHeight = 0.0;
        for(int i = 0; i < gender.length; i++) {
            if(gender[i] == 'F') {
                womanHeight += height[i];
                countWoman++;
            }
            if(gender[i] == 'M') {
                countMan++;
            }
        }

        double averageWomen = womanHeight / countWoman;

        System.out.printf("\nLowest Height = %.2f%n", lowestHeight );
        System.out.printf("Highest Height = %.2f%n", highestHeight );
        System.out.printf("Average height of women = %.2f%n", averageWomen);
        System.out.printf("Number of men = %d%n",countMan);

        sc.close();

    }
}
