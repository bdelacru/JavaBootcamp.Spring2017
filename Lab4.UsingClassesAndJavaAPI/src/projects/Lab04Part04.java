package projects;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Lab04Part04{

   public static void main(String[ ] args) throws IOException {
      File input = new File("hemingway-old-man.txt");
      String content = new Scanner(input).useDelimiter("\\Z").next();
    //System.out.println(content);
    
   
      final int NUMCHARS = 26;
   
      Scanner scan = new Scanner (System.in);
   
      int[] upper = new int[NUMCHARS];
      int[] lower = new int[NUMCHARS];
   
      char current;   // the current character being processed
      int other = 0;  // counter for non-alphabetics
   
      String line = content;
   
      //  Count the number of each letter occurence
      for (int ch = 0; ch < line.length(); ch++)
      {
         current = line.charAt(ch);
         if (current >= 'A' && current <= 'Z')
            upper[current-'A']++;
         else
            if (current >= 'a' && current <= 'z')
               lower[current-'a']++;
            else
               other++;
      }
   
      //  Print the results
      System.out.println ();
      for (int letter=0; letter < upper.length; letter++)
      {
         System.out.print ( (char) (letter + 'A') );
         System.out.print (": " + upper[letter]);
         System.out.print ("\t\t" + (char) (letter + 'a') );
         System.out.println (": " + lower[letter]);
      }
   
      System.out.println ();
      System.out.println ("Non-alphabetic characters: " + other);
            System.out.println(upper[0]);
      for (int x=0; x<upper.length; x++)
      {
      int noA=lower[x]/1000;
      System.out.print ( (char) (x + 'A') );
      System.out.print(":");
      //System.out.println(noA); 
     
     // System.out.print("A: ");
      for(int i=0; i<noA; i++)
      {
    	  System.out.print("* ");    	
    	  
      }
      System.out.println();
      }
   }
}


