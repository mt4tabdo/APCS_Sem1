/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String[] args){
		
		Warrior[] x = new Warrior[100];
		for (int i = 0; i < 100; i++){
			x[i] = new Warrior();
		}
		
	
		Wizard[] y = new Wizard[100];
		for (int i = 0; i < 100; i++){
		     y[i] = new Wizard();
	   	}
		int i = 0; // wiard
		int c = 0; // warrior
		while( i < 100 && c < 100){
			 y[i].attack(x[c]);

    if (x[c].isDead()) {
        c++;
    } else {
        x[c].attack(y[i]);
    }

    if (y[i].isDead()) {
        i++;
    }
}
		     int d = 100 - c;
		    int u = 100 - i;
		   
	 if (i == 100){
    System.out.println("Warriors won with " + (100 - c) + " left.");
	} 
	else if (c == 100) {
    System.out.println("Wizards won with " + (100 - i) + " left.");
		}
		
		
		
		
		

	}
}
