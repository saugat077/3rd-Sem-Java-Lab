/*    4. Write a program to read marks of five subject, then find the division and percentage.
    a. Percentage greater or equal than 80, print distinction
    b. Percentage between 60 to 80 -> first division
    c. Percentage between 40 to 60 -> second division
    d. Percentage below 40 -> fail */

import java.util.Scanner;

public class ResultDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for five subjects
        int[] marks = new int[5];
        System.out.println("Enter marks for five subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Calculating total marks and percentage
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += marks[i];
        }
        double percentage = (double) totalMarks / 5;

        // Determining the division based on the percentage
        String division;
        if (percentage >= 80) {
            division = "Distinction";
        } else if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 40) {
            division = "Second Division";
        } else {
            division = "Fail";
        }

        // Displaying the division and percentage
        System.out.println("Division: " + division);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}

