/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);

System.out.println("Enter a first name and last name with a space in the middle");
	
	     String s = sc.nextLine();
	
	

	     int y = s.indexOf(" ");
          int b = s.length();
          System.out.println("The last name is: " + s.substring(y,b));
		
	}
}
