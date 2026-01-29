/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
         Scanner sc = new Scanner(System.in);
         
         
         int x = (int)(Math.random() * (1001 - 1) + 1);
         
         System.out.println("Please select a number between 1 and 1000"");
         
         int y = sc.nextInt();
         
         while( x!= y){ 
         	if (y > x){ 
         		System.out.println("Your number too big");
         	
         		y = sc.nextInt();
         	}
         	else if ( y < x) { 
         			System.out.println("Your number too small");
         	}
         	 else if (y == x) { 
         	     System.out.println(" You got It");


		
	}
}
