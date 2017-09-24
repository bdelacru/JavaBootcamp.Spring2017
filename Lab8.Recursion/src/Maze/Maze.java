//********************************************************************
//  Maze.java
//
//  Represents a maze of characters. The goal is to get from the
//  top left corner to the bottom right, following a path of 1s.
//********************************************************************
package Maze;

import java.util.Random;

public class Maze {
	// initializing variables
	private final int TRIED = 3;
	private final int PATH = 7;
	

	// setting up empty grid
	private static int[][] grid = {};

	// --------------------------------------------------------
	// generating user's rows and columns
	// -------------------------------------------------------
	public static void defineGrid(int useruserRow, int userCol) {

		grid = new int[useruserRow][userCol]; 
	}

	// --------------------------------------------------------------------------
	// Putting random 1's and 0's inside the grid based on the user's row and
	// col
	// --------------------------------------------------------------------------
	
	public static void Random(int userRow, int userCol) {
	
		for (int i = 0; i < userRow; i++) {
			for (int a = 0; a < userCol; a++)
			{
				Random rnd = new Random(); 
				grid[i][a] = rnd.nextInt(2); 
			}
		}	
	}

	// -----------------------------------------------------------------
	// Attempts to recursively traverse the maze. Inserts special
	// characters indicating locations that have been tried and that
	// eventually become part of the solution.
	// Here we move around to find the other end. 3 is the tried path, and 7 is
	// the final path taken. 0 is blocked path and 1 is clear path.
	// -----------------------------------------------------------------
	public boolean traverse(int userRow, int userCol) 
													
	{
		boolean done = false; 

		if (valid(userRow, userCol)) 
								
		{
			grid[userRow][userCol] = TRIED; // this SPECIFIC cell has been tried
			// if the move is valid, the grid entry is changed from a 1 to a 3

			if (userRow == grid.length - 1 && userCol == grid[0].length - 1) 
				done = true; // the maze is solved
			else {
				done = traverse(userRow + 1, userCol); // down
				if (!done)
					done = traverse(userRow, userCol + 1); // right
				if (!done)
					done = traverse(userRow - 1, userCol); // up
				if (!done)
					done = traverse(userRow, userCol - 1); // left
			}

			if (done) // this location is part of the final path
				grid[userRow][userCol] = PATH; // change to a 7

			

		}

		return done;

	}

	// -----------------------------------------------------------------
	// Determines if a specific location is valid.
	// -----------------------------------------------------------------
	private boolean valid(int userRow, int userCol) {
		boolean result = false; // checking if it's true

		// check if cell is in the bounds of the matrix
		if (userRow >= 0 && userRow < grid.length && userCol >= 0 && userCol < grid[userRow].length)

			// check if cell is not blocked and not previously tried
			if (grid[userRow][userCol] == 1) // if cell has a 1 then it is open
												// and not used
				result = true;

		return result;
	}


	// -----------------------------------------------------------------
	// Returns the maze as a string.
	// -----------------------------------------------------------------
	public String toString() {
		String result = "\n";

		for (int userRow = 0; userRow < grid.length; userRow++) // prints out
																// the numbers
																// in row
		{
			
			//System.out.println("|");
			result += "|";
			for (int userCol = 0; userCol < grid[userRow].length; userCol++) {
				
				result +=grid[userRow][userCol] + " "; // prints out the number and space
			
				
			}
			result += "|";
			   result += "\n";
			   
			  
		}
		

		return result;
	}

	// ---------------------------------------------------------------------
	// attempting to return the maze with additional outputs
	// ----------------------------------------------------------------------
	public String toMazeString() { // "." is path traversed
									// "#" is the wall
								// " " is blank space that can be traversed
									// " | " and " -" is the outline of the maze
		String result1 = "\n";
		String border = "--";
		String border1 = "|";
		String path= ".";
		char backChar = ' ', wallChar = 'X', cellChar = ' ', pathChar = '*',border2= '-', border3='|';
			String numberAsString = Integer.toString(PATH);
		numberAsString= path;
			//System.out.println(numberAsString);
	
		
		for (int userRow = 0; userRow < grid.length; userRow++) 
		{
			
			result1 += border2;
			result1+= border2;			
			
		}
	

		result1 += toString();
		
	
		for (int userRow = 0; userRow < grid.length; userRow++) 
		{
			result1 += border2;
			result1 += border2;
			
		}
		 result1 = result1.replaceAll("7", ".");
		 result1 = result1.replaceAll("1", " ");
		 result1 = result1.replaceAll("3", " ");
		 result1 = result1.replaceAll("0","#");
		return result1;
	}
	
}
