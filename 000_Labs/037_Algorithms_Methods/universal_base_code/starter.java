/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int [] arr){
		for(int y = 0; y < arr.length ; y++){
		   	System.out.print(arr[y] + ", ");
		   }
		   System.out.println("  ");
 }
	public static int getArrayAverage(int [] arr){
		 int sum = 0;

for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}

int average = (int) sum / arr.length;
     return average;
		 }
	public static int getArrayMax(int [] arr){
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
				
			}
		}
		return max;
		
	}	
	
	public static int getArrayMin(int [] arr){
		int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
	        	min = arr[i];
	        
    		}
    	}
     return min;
}
			
			
			
			
	public static void main(String args[]) {
		// Your code goes below here
      int [] arr = new int[100];
		 for (int i = 0; i < 100; i++){
		   	arr[i] = (int)(Math.random() * (100 - 1) + 1);
		   	
		   }
		 	toStringArray(arr);
		System.out.println("Average: " + getArrayAverage(arr));
		   System.out.println("Maximum: "+ getArrayMax(arr));
           System.out.println("Minimum: " +getArrayMin(arr));

		
	}
}
