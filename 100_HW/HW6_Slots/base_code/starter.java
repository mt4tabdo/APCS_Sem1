/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	

Scanner sc = new Scanner(System.in);

        int money = 100;
        System.out.println("Welcome to the Slot Machine!");
        System.out.println("You have $" + money);

        while (money > 0) {
            System.out.print("Play? (yes/y): ");
            String input = sc.nextLine();

            if (!(input.equals("yes") || input.equals("y"))) {
                System.out.println("You ended with $" + money);
                break;
            }

            System.out.print("Enter wager: ");
            int wager = sc.nextInt();
            sc.nextLine();

            if (wager <= 0 || wager > money) {
                System.out.println("Invalid wager.");
                continue;
            }

            int a = (int)(Math.random() * 9 + 1);
            int b = (int)(Math.random() * 9 + 1);
            int c = (int)(Math.random() * 9 + 1);

            System.out.println("You rolled: " + a + " " + b + " " + c);

            if (a == b && b == c) {
                money += wager * 3;
                System.out.println("JACKPOT! You won $" + (wager * 3));
            } else if (a == b || a == c || b == c) {
                money += wager * 2;
                System.out.println("You won $" + (wager * 2));
            } else {
                money -= wager;
                System.out.println("You lost $" + wager);
            }

            System.out.println("You now have $" + money);
        }

        if (money <= 0) {
            System.out.println("You ran out of money!");
        }











	}
}
