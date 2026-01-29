package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villian;		// Who's the arch nemesis of this Spiderman?

public Spiderman(){
	actor = "unknown";
	age = 0;
	villian = "unknown";
}
public Spiderman(String a){
actor = a;
age = 0;
villian = "unknown";
}
public Spiderman(int b){
actor = "unkwnown";
age = b;
villian = "unknown";
}
public Spiderman(String villainName, boolean isVillain){
actor = "unknown";
age = 0;
villian = villainName;
}
public Spiderman(String a, int b){
actor = a;
age = b;
villian = "unknown";
}
public Spiderman(String a, int b, String villainName){
actor = a;
age = b;
villian = villainName;
}

// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public int getAge(){
	 
	 return age;
}
public void setAge(int h){ 
	 age = h;
}
 public String getName(){
 	return actor;
 }
public void setName(String h2){
	 actor = h2;
}
public String getVillian(){
	return villian;
}
public void setVillian(String h3){
	villian = h3;
}
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villian);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
