/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
        Spiderman x = new Spiderman("Tobey Maguire", 48);
       
	 System.out.println("Actor: " + x.getName());
        System.out.println("Age: " + x.getAge());
        
        
         Spiderman y = new Spiderman("Andrew Garfield", 40, "Electro");
        
        System.out.println("Actor: " + y.getName());
        System.out.println("Age: " + y.getAge());
        System.out.println("Villain: " + y.getVillian());
        
        Spiderman z = new Spiderman("Tom Holland", 27);
       
	 System.out.println("Actor: " + z.getName());
        System.out.println("Age: " + z.getAge());
        
       Spiderman t = new Spiderman("Miles Morales", 19, "Bruce");
        
        System.out.println("Actor: " + t.getName());
        System.out.println("Age: " + t.getAge());
        System.out.println("Villain: " + t.getVillian());
        
	}
}