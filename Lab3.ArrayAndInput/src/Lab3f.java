//********************************************************************
//  TwoDArray.java
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************

public class Lab3f
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int[][] table = new int[3][4];
      
      int [][] num= new int[9][4]; 
      //int [] numRow= new int[4];
      // Load the table with values
      for (int row=0; row < table.length; row++)
    	  for(int i=0; i<num.length; i++)
         for (int col=0; col < table[row].length; col++)
        	  	for(int a=0; a< num[i].length; a++)
         { 
            table[row][col] = row * 10 + col;
            
         }
      
      

      for ( int i=0; i<= table[1].length; i++)
    	  {System.out.print(i+"\t");
    	 
    	  }
      System.out.println();
      
      System.out.print("-|");
      for (int x=0; x<table[0].length; x++)
      {
    	  System.out.print("--------");
      }
      System.out.println();
      
      // Print the table
    	  
      for (int row=0; row < table.length; row++)
      {  
    	  System.out.print(row+"|"+ "\t");
    	  
         for (int col=0; col < table[row].length; col++)
         {
            System.out.print (table[row][col] + "\t");
         }
         System.out.println();
         
      }
   }
   
}
