import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Lab04Part04{

   public static void main(String[ ] args) throws IOException {
      File input = new File("Palindrome.txt");
      String content = new Scanner(input).useDelimiter("\\Z").next();
      String after= content.replaceAll(" ", "");
      String lowercase= after.toLowerCase();
      System.out.println(lowercase);
    //System.out.println(content);
 
    String str, another = "y";
      int left, right;

      Scanner scan = new Scanner (System.in);

      while (another.equalsIgnoreCase("y")) // allows y or Y
      {
         str = lowercase;

         left = 0;
         right = str.length() - 1;

         while (str.charAt(left) == str.charAt(right) && left < right)
         {
            left++;
            right--;
         }

         System.out.println();

         if (left < right)
            System.out.println ("That string is NOT a palindrome.");
         else
            System.out.println ("That string IS a palindrome.");

         System.out.println();
         System.out.print ("Test another palindrome (y/n)? ");
         another = scan.nextLine();
      }
      System.out.println("done");
   }
}


