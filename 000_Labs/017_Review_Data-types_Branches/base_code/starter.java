/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println(" Whats your name");
     
      String name = sc.nextLine();
     System.out.println("What is your title? Ex: Slayer of Dragons");
      String title = sc.nextLine();
    
    System.out.println("Choose your role: Wizard, Warrior, or Rogue");
        String imput = sc.nextLine();
        
        boolean a = imput.equals("Wizard");
        boolean b = imput.equals("wizard");
        
        boolean c = imput.equals("Warrior");
        boolean d = imput.equals("warrior");
        
        boolean f = imput.equals("rogue");
        boolean g = imput.equals("Rogue");
        

       if(a || b){ 
       	System.out.println("you choose Wizard");
       }
       else if (c || d){ 
       	System.out.println("you choose Warrior");
       }
       else if (f || g){
       	System.out.println("you choose Rogue");
       }
       else { 
       	System.out.println("You chose no role");
       }
        
        System.out.println(" You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
        System.out.println("Strength (1-10): ");
  
        int strength = sc.nextInt();
        if(strength < 0 || strength > 10){
            System.out.println("please choose a number between 1-10");
        strength = sc.nextInt(); 
	}
        int points = 20 - strength;
        
    System.out.println(" you have " + points + " points to spend");
    
    System.out.println("Dexterity (1-10): ");
    
    int dex = sc.nextInt();
        if(dex < 0 || dex > 10){
            System.out.println("please choose a number between 1-10");
        dex = sc.nextInt(); 
	}
        int points2 = points - dex;
        
        System.out.println(" you have " + points2 + " points to spend");
        
        System.out.println("Intenellgience (1-10): ");
    
    int intl = sc.nextInt();
        if(intl < 0 || intl > 10){
            System.out.println("please choose a number between 1-10");
        intl = sc.nextInt(); 
	}
        int points3 = points2 - intl;
        
        System.out.println(" you have " + points3 + " points to spend");
        
        System.out.println("Charisma (1-10): ");
    
    int car = sc.nextInt();
        if(car < 0 || car > 10){
            System.out.println("please choose a number between 1-10");
        car = sc.nextInt(); 
	}
        int points4 = points3 - car;
        
        System.out.println(" you have " + points4 + " points to spend");
        
        System.out.println("___________________________________________________________________________________________________________ ");
    
   
   
   
   System.out.println("You are " + name + ", the " + title + " of CVHS");
   
   System.out.println("Your a " + imput + " with the folowing stats");
   
   
   
   
   
    System.out.println("Strength - " + strength);
    System.out.println("Charisma - " + car);
    System.out.println("Dexterility - " + dex);
    System.out.println("Intelligence - " + intl);
    
    
    System.out.println("Good luck on your quest " + name);
	}   
}
