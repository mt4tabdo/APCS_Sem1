/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		
		
	


        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] answers = {"apple", "elephant", "piano"};
        String[][] hints = {
            {"It's a fruit", "Keeps the doctor away"},
            {"It's a large animal", "Has a trunk"},
            {"It's a musical instrument", "Has black and white keys"}
        };

        int choice = random.nextInt(answers.length);
        String selectedAnswer = answers[choice];
        String[] selectedHints = hints[choice];

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Hint 1: " + selectedHints[0]);
        System.out.println("Hint 2: " + selectedHints[1]);
        System.out.print("Your guess: ");
        String userGuess = sc.nextLine().toLowerCase();

        if (userGuess.equals(selectedAnswer)) {
            System.out.println("Correct! You guessed it right.");
        } else {
            System.out.println("Oops! The correct answer was: " + selectedAnswer);
        }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
