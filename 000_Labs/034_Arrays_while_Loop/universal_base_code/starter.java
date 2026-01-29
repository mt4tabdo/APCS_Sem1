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
	
		 int [] arr = new int[1001];
		   int i = 0;
		   while (i < 1001){
		   	arr[i] = (int)(Math.random() * (1001 - 1) + 1);
		   	i++;
		   }
		   int y = 0;
		   while (y < 1001){
		   	System.out.println(arr[y] + ", ");
		   	y++;
		   }


		
	}
}
