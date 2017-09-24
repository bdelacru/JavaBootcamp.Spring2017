//********************************************************************
//  MazeSearch.java
//
//  Demonstrates recursion.
//********************************************************************
package Maze;

import java.util.Scanner;

public class MazeSearch
{
   //-----------------------------------------------------------------
   //  Creates a new maze, prints its original form, attempts to
   //  solve it, and prints out its final form.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
	   //----------------------------
	   // entering user's row and col
	   //----------------------------
	   Scanner in= new Scanner(System.in);
	   System.out.print("Enter number of columns: ");
	   int userCol=in.nextInt();
	   Scanner in2 = new Scanner(System.in);
	   System.out.print("Enter number of rows: ");
	   int userRow= in2.nextInt();
	   
	   //--------------------
	   // calling the methods
	   //--------------------
	   Maze labyrinth = new Maze();
      Maze.defineGrid(userRow, userCol);
      Maze.Random(userRow,userCol);
      
      
      //System.out.println (labyrinth); // prints out the maze with 1's and 0's

      //----------------------------------
      // Computing if the Maze is traverse, if not random numbers will be reassigned until 
      // the maze is traverse
      //-----------------------------------
      if (labyrinth.traverse (0, 0)) 
         System.out.println ("The maze was successfully traversed!");
      else 
      {   
    	 do{
         Maze.Random(userRow, userCol);
    	 	}
      while(labyrinth.traverse(0, 0)== false);   	
    	  System.out.println ("The maze was successfully traversed!");
    		 // System.out.println ("There is no possible path."); 
      
      System.out.println (labyrinth.toMazeString()); // prints out the maze with 7's= path completed\
      }
   }
}
