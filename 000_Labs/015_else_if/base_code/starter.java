/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		 Random rand = new Random();
        int secretNumber = rand.nextInt(1000) + 1; // 1 to 1000
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("I'm thinking of a number between 1 and 1000.");
        System.out.println("Try to guess it!");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess < secretNumber) {
                    System.out.println("Higher than " + guess);
                } else if (guess > secretNumber) {
                    System.out.println("Lower than " + guess);
                } else {
                    System.out.println("Correct! The number was " + secretNumber);
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); 
        }
		
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
