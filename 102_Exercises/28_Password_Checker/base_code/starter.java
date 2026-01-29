import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
int strength1 = 0; // 8 or more characters
		int strength2 = 0; // has symbol
		int strength3 = 0; // both
		int noStrength = 0;

		for (i = 0; i < passwords.length; i++) {
			String p = passwords[i];

			boolean hasLength = p.length() >= 8;
			boolean hasSymbol =
				p.contains("!") || p.contains("@") || p.contains("#") ||
				p.contains("$") || p.contains("%") || p.contains("^") ||
				p.contains("&") || p.contains("*");

			if (hasLength && hasSymbol) {
				strength3++;
			} else if (hasLength) {
				strength1++;
			} else if (hasSymbol) {
				strength2++;
			} else {
				noStrength++;
			}
		}

		System.out.println("There are " + strength1 + " passwords of strength 1 with 8 or more characters.");
		System.out.println("There are " + strength2 + " passwords of strength 2 with a special symbol.");
		System.out.println("There are " + strength3 + " passwords of strength 3 with both strength 1 and 2.");
		System.out.println("There are " + noStrength + " passwords with no strength.");
		
		
	
	
		
		
		
		
		
		
	}
}
