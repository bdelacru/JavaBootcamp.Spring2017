package projects;

import java.io.*;
import java.util.*;
import java.util.Scanner;

class PalindromeTester {
	public static void main(String[] args) throws IOException {
		File input = new File("palindrome.txt"); // reads the file
		///String content = new Scanner(input).useDelimiter("\\Z").next();// putting file into a string name content 
		Scanner in = new Scanner(input);
		
		//.useDelimiter("\\Z") set the delimiter to the end of the file and .next() red the scanner until the next delimmiter, in this case it is the end of the file
		//String content2= content.replaceAll(" ", "");
		//System.out.println(content);
		

		String str, another = "y"; // initializing variables
		int left, right; // initializing variables


		while (in.hasNextLine()) // allows y or Y
		{

			str = in.nextLine();

			left = 0;
			right = str.length() - 1;

			while (str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}

			System.out.println(str);

			if (left < right)
				System.out.println("That string is NOT a palindrome.");
			else
				System.out.println("That string IS a palindrome.");

			System.out.println();
			//System.out.print("Test another palindrome (y/n)? ");
			//another = scan.nextLine();
		}
		System.out.println("done");
	}
}
