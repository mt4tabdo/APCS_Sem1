package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		map = new int[row][column];
		posX = 0;
		posY = 0;
		map[posX][posY] = 2;

	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		Random rand = new Random();
		treasureX = rand.nextInt(map.length);
		treasureY = rand.nextInt(map[0].length);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
int newX = posX;
		int newY = posY;

		if(m == 1) newX--;				
		else if(m == 2) newX++;			
		else if(m == 3) newY--;			
		else if(m == 4) newY++;		
		else if(m == 5){ newX--; newY--; } 
		else if(m == 6){ newX--; newY++; }
		else if(m == 7){ newX++; newY--; } 
		else if(m == 8){ newX++; newY++; } 
		else return false;

		return move(newX, newY);
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
if(row < 0 || col < 0 || row >= map.length || col >= map[0].length){
			return false;
			}
	 
	 if(map[posX][posY] == 2)
			map[posX][posY] = 0;
		else if(map[posX][posY] == 3)
			map[posX][posY] = 1;

		posX = row;
		posY = col;

	
		if(map[posX][posY] == 1)
			map[posX][posY] = 3;
		else
			map[posX][posY] = 2;

		return true;
	}
	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
 	if(posX == treasureX && posY == treasureY){
			return true;
		}

	
		if(map[posX][posY] == 2)
			map[posX][posY] = 3;
		else if(map[posX][posY] == 0)
			map[posX][posY] = 1;

		return false;
	}
	
	

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
	System.out.println("The treasure was at " + treasureX + "," + treasureY + "!");
		map[treasureX][treasureY] = 5;
		System.out.println();
		printMap();
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
	System.out.println();
		System.out.println("MAP:");
		for(int i = 0; i < map.length; i++){
			System.out.print("| ");
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println("|");
		}
		System.out.println();
	}

}
