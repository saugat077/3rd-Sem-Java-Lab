/*    2. Write a program to read a four-digit number from user and perform following operation
    a. Display each digit separately 
    b. Print the sum of digits
    c. Reverse the digits
    d. Find the sum of square of each digit */

import java.util.Scanner;

public class FourDigitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();
        
        // Displaying each digit separately
        int d4 = num % 10;
        int d3 = (num / 10) % 10;
        int d2 = (num / 100) % 10;
        int d1 = (num / 1000) % 10;
        
        System.out.println("Digit 1: " + d1);
        System.out.println("Digit 2: " + d2);
        System.out.println("Digit 3: " + d3);
        System.out.println("Digit 4: " + d4);
        
        // Calculating the sum of digits
        int sum = d1 + d2 + d3 + d4;
        System.out.println("Sum of digits: " + sum);
        
        // Reversing the digits
        int rev = d4 * 1000 + d3 * 100 + d2 * 10 + d1;
        System.out.println("Reversed number: " + rev);
        
        // Calculating the sum of squares of digits
        int squareSum = d1 * d1 + d2 * d2 + d3 * d3 + d4 * d4;
        System.out.println("Sum of squares of digits: " + squareSum);
        
        sc.close();
    }
}
