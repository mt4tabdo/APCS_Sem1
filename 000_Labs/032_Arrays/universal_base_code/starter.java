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
		BaseClass test = new BaseClass();
int [] arr1 = new int[10];
		   int u = 0;
		   int h = 10;
		   while (u < 10){
		   	arr1[u] = h - 1;
		   	h = h - 1 ;
		   	u = u + 1;
		   }
		   int z = 0;
		   while (z < 10){
		   	System.out.println(arr1[z] );
		   	z++;
		   }

		
	}
}
