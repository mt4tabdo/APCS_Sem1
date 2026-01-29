/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	  Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("\n--- First Number: " + num1 + " ---");

        if (num1 % 2 == 0) {
            System.out.println("It is even.");
        } else {
            System.out.println("It is odd.");
        }

        boolean num1DivBy3 = num1 % 3 == 0;
        boolean num1DivBy4 = num1 % 4 == 0;
        boolean num1DivBy5 = num1 % 5 == 0;

        if (num1DivBy3) {
            System.out.println("It is divisible by 3.");
        } else {
            System.out.println("It is not divisible by 3.");
        }

        if (num1DivBy4) {
            System.out.println("It is divisible by 4.");
        } else {
            System.out.println("It is not divisible by 4.");
        }

        if (num1DivBy5) {
            System.out.println("It is divisible by 5.");
        } else {
            System.out.println("It is not divisible by 5.");
        }

        if (num1DivBy3 && num1DivBy4 && num1DivBy5) {
            System.out.println("It is divisible by 3, 4, and 5!");
        } else {
            System.out.println("It is NOT divisible by all 3, 4, and 5.");
        }

        System.out.println("\n--- Second Number: " + num2 + " ---");

        if (num2 % 2 == 0) {
            System.out.println("It is even.");
        } else {
            System.out.println("It is odd.");
        }

        boolean num2DivBy3 = num2 % 3 == 0;
        boolean num2DivBy4 = num2 % 4 == 0;
        boolean num2DivBy5 = num2 % 5 == 0;

        if (num2DivBy3) {
            System.out.println("It is divisible by 3.");
        } else {
            System.out.println("It is not divisible by 3.");
        }

        if (num2DivBy4) {
            System.out.println("It is divisible by 4.");
        } else {
            System.out.println("It is not divisible by 4.");
        }

        if (num2DivBy5) {
            System.out.println("It is divisible by 5.");
        } else {
            System.out.println("It is not divisible by 5.");
        }

        if (num2DivBy3 && num2DivBy4 && num2DivBy5) {
            System.out.println("It is divisible by 3, 4, and 5!");
        } else {
            System.out.println("It is NOT divisible by all 3, 4, and 5.");
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
