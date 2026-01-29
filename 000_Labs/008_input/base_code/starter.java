/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("Whats your name");
	String name = sc.nextLine();
	System.out.println("How old are you");
	int age = sc.nextInt();
	System.out.println("What month were you born");
	String month = sc.nextLine();
	
	System.out.println("What day were you born");
	int day = sc.nextInt();
		System.out.println("How much is a buck fifty"); 
		double money = sc.nextDouble();
		
	System.out.println("Your name is " + name);
	
	System.out.println("you were born on" + day+" in " + month);
	
	
	
	
	
	
	}
}
