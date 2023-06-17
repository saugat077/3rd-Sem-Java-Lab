/*  Write a program to take two number input from user, divide first number by second and display quotient 
and remainder obtained from division operation */

import java.util.Scanner;

public class DivisionOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Calculating quotient and remainder
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        // Displaying the result
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        sc.close();
    }
}
