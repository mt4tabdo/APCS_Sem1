/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

 public static void toStringArray(){
		for(int y = 0; y < arr.length ; y++){
		   	System.out.print(arr[y] + ", ");
		   }
 }
		 public static int getArrayAverage(){
		 int sum = 0;

for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}

int average = (int) sum / arr.length;

		 }
		public static int getArrayMax(){
		int max = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++){
	if (arr[i] > max){
		max = arr[i];
	}
}
		}		
		
		
		
		
		
		
	}

}

