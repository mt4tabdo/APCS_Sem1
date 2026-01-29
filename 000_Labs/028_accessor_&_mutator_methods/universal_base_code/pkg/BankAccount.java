/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
		// -------CONSTRUCTORS-------
	public BankAccount(){
		String owner;
	   int  accountnumber;
	    double balance;
	    boolean active;
	    
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
         
         public String getowner(){
 	return owner;
 }
         
         public void setowner(String h){
	 owner = h;
         }
         
         public double getBalance(){
	 
	 return balance;
}
public void checkBalance(double h1){ 
	 balance = h1;
}
         public void closeAccount(){ 
	 active = false;
         
         }
         
           public boolean getisactive(){
 	return active;
 }
         
         public void isactive(boolean h3){
	 active = h3;
         }
         
         public double Deposit(double x){
         	if(active == true)
         	balance = balance + x;
         	
         }
         public double withdraw(double h){
         	if((active == true) || balance < h)
         	
         	balance = balance - h;
         }
         
         
         
         
}