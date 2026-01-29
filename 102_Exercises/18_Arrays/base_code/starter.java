/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		   int i = 0;
		   int x = 0;
		   while (i < 1001){
		   	arr[i] = x + 3;
		   	x = x + 3;
		   	i = i + 1;
		   }
		   int y = 0;
		   while (y < 1001){
		   	System.out.print(arr[y] + ", ");
		   	y++;
		   }
		System.out.println("");
		System.out.println("");
		  int [] arr1 = new int[1001];
		   int u = 0;
		   int h = 1001;
		   while (u < 1001){
		   	arr1[u] = h - 1;
		   	h = h - 1 ;
		   	u = u + 1;
		   }
		   int z = 0;
		   while (z < 1001){
		   	System.out.print(arr1[z] + ", ");
		   	z++;
		   }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
