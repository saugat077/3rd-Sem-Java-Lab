/*    6. Write a program that ask student to enter his/her marks for 5 subject and print the grade obtained:
    a. 80-100 -> grade A
    b. 60-79 -> grade B
    c. 40-59-> grade C
    d. Below 40 -> grade F */

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");
        int totalMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double average = (double) totalMarks / 5;

        String grade;

        if (average >= 80 && average <= 100) {
            grade = "A";
        } else if (average >= 60 && average < 80) {
            grade = "B";
        } else if (average >= 40 && average < 60) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Grade obtained: " + grade);

        scanner.close();
    }
}
