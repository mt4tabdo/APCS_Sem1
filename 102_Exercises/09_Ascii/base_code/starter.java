/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Choose one of the following Animal, Object, or Face");
	
	String thing = sc.nextLine();
	
	if (thing.equals("Animal")) {
		System.out.println(" _____");
		System.out.println("(' v ')");
	    System.out.println("((____)) ");
	    System.out.println(" ^   ^");
		
	}
	 else if (thing.equals("Object")) { 
	 	System.out.println(" ((̲̅ ̲̅(̲̅C̲̅r̲̅a̲̅y̲̅o̲̅l̲̲̅̅a̲̅( ̲̅((>   " );
	
	 }
	
	
	else if (thing.equals("Face")) {
		System.out.println(" 0-^-0");
	}
	 
	 else if (thing.equals("animal")) {
		System.out.println(" _____");
		System.out.println("(' v ')");
	    System.out.println("((____)) ");
	    System.out.println(" ^   ^");
		
	}
	 else if (thing.equals("object")) { 
	 	System.out.println(" ((̲̅ ̲̅(̲̅C̲̅r̲̅a̲̅y̲̅o̲̅l̲̲̅̅a̲̅( ̲̅((>   " );
	
	 }
	
	
	else if (thing.equals("face")) {
		System.out.println(" 0-^-0");
	}
	 
	 
	else {
		System.out.println("Invaild, please try again");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
