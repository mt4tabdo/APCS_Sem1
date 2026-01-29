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
    int [] arr = new int[(int)(Math.random() * (201 - 51) + 51)];
		 for (int i = 0; i < arr.length; i++){
		   	arr[i] = (int)(Math.random() * (101 - 1) + 1);
		   }


int min = Integer.MAX_VALUE;
for (int i = 0; i < arr.length; i++){
	if (arr[i] < min){
		min = arr[i];
	}
}


int max = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++){
	if (arr[i] > max){
		max = arr[i];
	}
}


 for (int y = 0; y < arr[y]; y++){
 
 }
    int sum = 0;

for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}

double average = (double) sum / arr.length;





System.out.println("The elements are:");
System.out.println("---------------------------------");
for(int y = 0; y < arr.length; y++){
		   	System.out.print(arr[y] + ", ");
		   }
		   System.out.println(" ");
		   System.out.print("---------------------------------");
		    System.out.println(" ");
System.out.println("There are " + arr.length + " number of elements");
		System.out.println("The maximum of " + arr.length + " random numbers is: " + max);
        System.out.println("The minimum of " + arr.length + " random numbers is: " + min);
          System.out.println("The average of " + arr.length + " random numbers is: " + average);



	}
}
