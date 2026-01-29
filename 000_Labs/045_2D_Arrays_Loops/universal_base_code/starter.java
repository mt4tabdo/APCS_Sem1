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
	
	System.out.println("How many rows would you like for your 2D array?");
	
	   int r = sc.nextInt();
	   
	  System.out.println("How many columns would you like for your 2D array?");
	  
         int c = sc.nextInt();
	   
    
    System.out.println("-----------------------------------------------------------------------------------------------");
    
    
    
    
    
     int [] [] arr = new int [r] [c];
     
		for (int i = 0; i < arr.length; i++){
			for (int x = 0; x < arr[0].length; x++){
			  arr[i][x] = (int)(Math.random() * 10 + 1);
			}
		}
		
		for (int y = 0; y < arr.length; y++){
			for (int t = 0; t < arr[0].length; t++){
			  System.out.print(arr[y] [t] );
			}
			System.out.println();
		}
		
		 System.out.println("-----------------------------------------------------------------------------------------------");
    
		
		System.out.println("What row would you like to get the average of?"); 
		
		 int a = sc.nextInt();
		 
	     double rowSum = 0;

		for (int j = 0; j < arr[0].length; j++) {
            rowSum += arr[a][j];
         }

	double rowAverage = rowSum / arr[0].length;
		System.out.println("The row average is " + rowAverage);
		
		
		double totalSum = 0;

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
        totalSum += arr[i][j];
    }
}

double totalAverage = totalSum / (arr.length * arr[0].length);
System.out.println("The average of the 2D array is " + totalAverage);

	}
}
