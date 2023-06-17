/*Write a program to calculate sum, multiplication, division, subtraction of two number based on the user choice. [Hint: ask two number input from user and one choice from user and perform operation using switch case] */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("Sum: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Subtraction: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Multiplication: " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
