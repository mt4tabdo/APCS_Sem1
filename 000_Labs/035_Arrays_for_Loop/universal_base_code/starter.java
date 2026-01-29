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
		 for (int i = 0; i < 1001; i++){
		   	arr[i] = (int)(Math.random() * (1001 - 1) + 1);
		   }
		  for(int y = 0; y < 1001; y++){
		   	System.out.println(arr[y] + ", ");
		   }


		
	}
}
