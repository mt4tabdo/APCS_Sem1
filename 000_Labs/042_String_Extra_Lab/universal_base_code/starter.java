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
System.out.print("Enter a sentence");
System.out.println(" ");
   String p = sc.nextLine();
   
   String a = p;
   String reversed = "";
   while (a.indexOf(" ")!= -1){
   	String word = a.substring(0,a.indexOf(" "));
   	a = a.substring(a.indexOf(" ") + 1);
   reversed = word + " " + reversed;
   System.out.println("Orignal: " + word + " " + a);
   }
 
 	
 	reversed = a + " " + reversed;

        System.out.println("Reversed sentence:");
        System.out.print(reversed);





		
	}
}
