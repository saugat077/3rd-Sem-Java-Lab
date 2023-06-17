/*    8. Write a program to read annual salary of an employee and calculate the tax and print the actual amount received by the employee
    a. Salary up to 100000-> 1%
    b. Salary above 100000 and below 5 lakh -> 5%
    c. Salary above 5 lakh -> 10% */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the annual salary: ");
        double salary = sc.nextDouble();

        double tax = 0;
        if (salary <= 100000) {
            tax = salary * 0.01;
        } else if (salary > 100000 && salary < 500000) {
            tax = salary * 0.05;
        } else if (salary >= 500000) {
            tax = salary * 0.1;
        }

        double actualAmount = salary - tax;

        System.out.println("Tax: " + tax);
        System.out.println("Actual Amount Received: " + actualAmount);

        sc.close();
    }
}
