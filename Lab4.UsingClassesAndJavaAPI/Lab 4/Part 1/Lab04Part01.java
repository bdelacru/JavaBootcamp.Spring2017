// Java Bootcamp Lab 04 Part 1- Encryption
// (1) String Declaration (array)
// (2) encrypt (String, char)
// (3) decrypt

import java.util.Scanner;
import java.io.*;
public class Lab04Part01
{
   public static void main (String[] args)throws IOException
   
   {
      // (1)declaration 
      char[] Secrets = new char[100];
      char[] Encryption = new char[100];
      char[] Decryption = new char[100];
      
      // Instantiation
      // Here we input a file from Shakespear as an example
      
      Scanner fileScan;
      String line;
   
      File myFile = new File("Shakespears.txt");
      fileScan = new Scanner (myFile);
      
      // Read and process each line of the file
      while (fileScan.hasNext())
      {
         line = fileScan.nextLine();
         //System.out.println (line.toUpperCase());
         
         for (int x=0; x<100; x++)
         {
            Secrets[x]=line.charAt(x);
            System.out.print(Secrets[x]);
                     //System.out.print(Character.getNumericValue(Secrets[x]));
         
         }
      
      }
      System.out.println();
      System.out.println();
   
      // (2) Encryption
      for (int x = 0; x < Encryption.length; x++)
      {
         Encryption[x]=(char)(((int)(Secrets[x]))+5);
         System.out.print(Encryption[x]);
      
      }
      System.out.println();
      System.out.println();
   
      // (3) Decryption
      for (int x = 0; x < Decryption.length; x++)
      {
         Decryption[x]=(char)(((int)(Encryption[x]))-5);
         System.out.print(Decryption[x]);
      
      }  
       
         
   }
}