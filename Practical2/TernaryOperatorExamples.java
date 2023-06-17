/*    3. Solve the following using ternary operator:
    a. Read a number from user and print whether that number is odd or even
    b. Read a number from user and print whether that number is positive or negative
    c. Read a three number from user and find greatest of three */

import java.util.Scanner;

public class TernaryOperatorExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // a. Check if a number is odd or even
        System.out.println("================Check Odd or Even================");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result);
        
        // b. Check if a number is positive or negative
        System.out.println("===========Check Positive or Negative===========");
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        result = (number >= 0) ? "positive" : "negative";
        System.out.println(number + " is " + result);
        
        // c. Find the greatest of three numbers
        System.out.println("================Greatest Number================");
        System.out.print("Enter three numbers (separated by spaces): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("The greatest number is: " + max);
        
        sc.close();
    }
}

