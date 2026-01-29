/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static int pow(int x, int y){
		int result = 1;
		int count = 0;
	
	while (count < y) {
		result *= x;
		count++;
	}
	return result;
	
	}
	   
	
	
	
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        int answer = pow(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + answer);


		
	}
}
