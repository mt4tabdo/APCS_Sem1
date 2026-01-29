/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Please enter a word that you'd like to hide in a crossword:");
		     String word = sc.nextLine();
		     
		 
		 
		int  rows = word.length() + 5;
		int  cols = word.length() + 5;
		 
		 
		    String [][] grid = new String [rows] [cols];
		
	
		 
		 
		 	
		 	
		 	
		 	// vertical
		 	
		 
		
		
		
		
		
		
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
	  	 Random rand = new Random();
		 
		 	  	for (int r = 0; r < rows; r++) {
    for (int c = 0; c < cols; c++) {
        grid[r][c] = letters[rand.nextInt(letters.length)];
    }
}


        
        int dir = rand.nextInt(3);

        if (dir == 0) {
          
            int startRow = rand.nextInt(rows);
            int startCol = rand.nextInt(cols - word.length());

            for (int i = 0; i < word.length(); i++) {
                grid[startRow][startCol + i] = word.substring(i, i + 1);
            }

        } else if (dir == 1) {
      
            int startRow = rand.nextInt(rows - word.length());
            int startCol = rand.nextInt(cols);

            for (int i = 0; i < word.length(); i++) {
                grid[startRow + i][startCol] = word.substring(i, i + 1);
            }

        } else {
            
            int startRow = rand.nextInt(rows - word.length());
            int startCol = rand.nextInt(cols - word.length());

            for (int i = 0; i < word.length(); i++) {
                grid[startRow + i][startCol + i] = word.substring(i, i + 1);
            }
        }


        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                
            }
        }

       
        System.out.println("-----Crossword Puzzle-----");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }




















		
	}
}
