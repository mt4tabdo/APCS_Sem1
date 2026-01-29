/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf(randName(),5);
			PooleDwarf test2 = new PooleDwarf(randName(),6);
				PooleDwarf test3 = new PooleDwarf(randName(),0);
					PooleDwarf test4 = new PooleDwarf(randName(),1);
						PooleDwarf test5 = new PooleDwarf(randName(),2);
							PooleDwarf test6 = new PooleDwarf(randName(),3);
								PooleDwarf test7 = new PooleDwarf(randName(),4);
				
				String firstName = test.getName();
		int duplicates = 0;

		if (test2.isSam eName(firstName)) duplicates++;
		if (test3.isSameName(firstName)) duplicates++;
		if (test4.isSameName(firstName)) duplicates++;
		if (test5.isSameName(firstName)) duplicates++;
		if (test6.isSameName(firstName)) duplicates++;
		if (test7.isSameName(firstName)) duplicates++;

		System.out.println("The first dwarf’s name is: " + firstName);
		System.out.println("Number of duplicates: " + duplicates);
		if (duplicates > 0) {
			
				
				
		}
				
	}
}
