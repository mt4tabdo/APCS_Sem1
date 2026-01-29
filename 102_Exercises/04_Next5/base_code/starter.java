/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("please enter a number");
      int num = sc.nextInt();
      
      
      int num2 = num *2;
      int num3 = num2 *2;
      int num4 = num3 *2;
      int num5 = num4 *2;
      System.out.println("here are the next 5 numbers"); 
      System.out.println(num +" , " +(num + 1)+" , " +(num + 2)+ " , " +(num + 3)+ " , "+ (num + 4));
      System.out.println("Here are the next 5 multiples of 2!");
      System.out.println(num +" , " +(num2 * 2)+" , " +(num3 + 2)+ " , " +(num4 + 2)+ " , "+ (num5 + 2));
      
      System.out.println("here is " + num + " divided by 100");
     
       double numdiv = num/100.0;
      System.out.println(numdiv);
        System.out.println("here is " + num + " divided by 10");
      double numdiv2 = num/10.0;
      System.out.println(numdiv2);
     
      
      
      
      
      
      
      
	}
}
