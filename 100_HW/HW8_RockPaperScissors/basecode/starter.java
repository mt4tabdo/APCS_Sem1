/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    
    
    public static String getObject() {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    public static int compare2(String p1, String p2) {
        if (p1.equals(p2)) return 0;
        if (p1.equals("rock") && p2.equals("scissors") ||
            p1.equals("paper") && p2.equals("rock") ||
            p1.equals("scissors") && p2.equals("paper")) {
            return 1;
        }
        return 2;
    }
    
    
      public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   
   
		while (true) {
            System.out.println("Would you like to play the computer? (yes/no/done)");
            String answer = sc.nextLine();

            System.out.println("--------------------------------------------------------------");

            if (answer.equals("done")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (answer.equals("yes")) {
                System.out.println("Please enter rock/paper/scissors:");
                String userChoice = sc.nextLine().toLowerCase();

                // Validate input
                while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                    System.out.println("Invalid input! Please enter rock, paper, or scissors:");
                    userChoice = sc.nextLine().toLowerCase();
                }

                String computerChoice = getObject();
                

                int result = compare2(userChoice, computerChoice);

                if (result == 0) {
                    System.out.println("It's a tie!");
                } else if (result == 1) {
                    System.out.println("You won!!!");
                } else {
                    System.out.println("Computer wins!");
                }

            } else if (answer.equals("no")) {
                System.out.println("How many times would you like the computer to play itself?");
                int games = sc.nextInt();
                sc.nextLine(); // Consume newline

                int p1Wins = 0;
                int p2Wins = 0;
                int ties = 0;

                for (int i = 0; i < games; i++) {
                    String p1 = getObject();
                    String p2 = getObject();
                    int result = compare2(p1, p2);

                    if (result == 0) ties++;
                    else if (result == 1) p1Wins++;
                    else p2Wins++;
                }

                System.out.println("Player 1 wins: " + p1Wins);
                System.out.println("Player 2 wins: " + p2Wins);
                System.out.println("Ties: " + ties);
            }

            System.out.println("--------------------------------------------------------------");
        }

			
			          
			          
	



















    }
}
