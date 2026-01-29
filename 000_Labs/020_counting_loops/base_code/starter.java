/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Whats your name");
         
          String name = sc.nextLine();
          
          System.out.println("How many times do you want to print out your name");
          
         int print = sc.nextInt();
         int counter = 0;
         while(counter < print){
         	if(print == counter){
         		break;
         	}
         	System.out.println(counter + ". " + name);
         	counter++;
         
         }
          
          


		
	}
}
