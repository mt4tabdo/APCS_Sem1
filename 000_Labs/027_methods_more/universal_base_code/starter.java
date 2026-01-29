/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
			Scanner sc =  new Scanner(System.in);
			System.out.println("Welcome to the 67 ATM! ");
		    System.out.println("We're going to create a bank account! What info do we know?");
		      System.out.println("1- Nothing");
		       System.out.println("2- owner");
		        System.out.println("3- owner and intial deposit");
		        
		         int non = sc.nextInt();
		      sc.nextLine(); 

         BankAccount x = new BankAccount();

       if (non == 1) {
            x = new BankAccount(); 
        } else if (non == 2) {
            System.out.print("Enter the owner's name: ");
            String o = sc.nextLine(); 
            x = new BankAccount(o);   
        } else if (non == 3) {
            System.out.print("Enter the owner's name: ");
            String o = sc.nextLine(); 
            System.out.print("Enter initial deposit: ");
            double deposit = sc.nextDouble();
            sc.nextLine(); 
            x = new BankAccount(o, deposit); 
        } else {
            System.out.println("Invalid option.");
            return;
        }

        System.out.println("\nAccount successfully created!\n");
        x.displayAccountInfo();

        System.out.println("\nWould you like to check your balance of this account? (yes/no)");
        String balance1 = sc.nextLine(); 

        if (balance1.equals("yes")) {  
            x.checkBalance();
        }

        System.out.println("\nThank you for coming to the 67 ATM!");
               
            
            
		        
		         
		          
		                        
		      
		                   
		 

		
	}
}
