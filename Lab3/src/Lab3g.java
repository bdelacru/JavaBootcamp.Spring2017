import java.io.File;
import java.util.Scanner;
import java.io.*;

//********************************************************************
//  TwoDArray.java
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************

public class Lab3g {
	// -----------------------------------------------------------------
	// Creates a 2D array of integers, fills it with increasing
	// integer values, then prints them out.
	// -----------------------------------------------------------------
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("lab3bigdata.txt"));
		int row = in.nextInt();
		int col = in.nextInt();

		int[][] table = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				table[i][j] = in.nextInt();
		}

		// Print the table
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				System.out.print(table[i][j] + "\t");
			System.out.println();
		}
		in.close();
	}
}
