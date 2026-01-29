/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
private String owner;
private int accountnumber;
private double balance;
private boolean active;
private static int nextaccountnumber = (int)Math.random() * (1000 - 50) + 50;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unknown";
	    accountnumber = nextaccountnumber;
	    balance = 0;
	    active = true;
	    
	    nextaccountnumber ++;
	}
	    public BankAccount(String owner){	
		owner = owner;
		accountnumber = nextaccountnumber;
		balance = 0;
		active = true;
	    
	    
	    nextaccountnumber ++;
	 }
	    public BankAccount(String owner, double bal){	
		owner = owner;
		accountnumber = nextaccountnumber;
		balance = bal;
		active = true;
	    
	    nextaccountnumber ++;
	
	    }

	// -------METHODS-------
public void checkBalance(){
	System.out.println("Current Balance: " + balance);
}
 
 public void displayAccountInfo() {
 	System.out.println("Owner: " + owner);
 		System.out.println("Balance: " + balance);
 		System.out.println("Account Number: " + accountnumber);
 		System.out.println("Status: " + active);
         }






}