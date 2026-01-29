/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println(" please insert a integer");
	
	
	int num1 = sc.nextInt();
	 System.out.println(" please insert a integer larger than the last intger");
	 int num2 = sc.nextInt();
	 
	 System.out.println(" your range is" + num1 + " to " + num2);
	
	int num3 = (int)(Math.random() * (num2- num1) + num1);
	
	int num4 = (int)(Math.random() * (num2- num1) + num1);
	
	int num5 = (int)(Math.random() * (num2- num1) + num1);
	
	int num6 = (int)(Math.random() * (num2- num1) + num1);
	
	int num7 = (int)(Math.random() * (num2- num1) + num1);
	
	
	
	System.out.println(" here are 5 numbers between your two numbers");
	
	
	System.out.println(num3 +"," + num4 + "," + num5 + "," + num6 + "," + num7);
	
	
	
	
	
	
	
	 
	}
}
