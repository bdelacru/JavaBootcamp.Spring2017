//********************************************************************
//  FileInput.java       Author: MAP
//
//  Demonstrates the use of Scanner to read text file input.
//********************************************************************

import java.util.Scanner;
import java.io.*;

public class FileInput
{
   //-----------------------------------------------------------------
   //  Reads text from a file and prints it in uppercase.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws IOException
   {
      String line;
      Scanner fileScan;

      File myFile = new File("sample.txt");
      fileScan = new Scanner (myFile);

      // Read and process each line of the file
      while (fileScan.hasNext())
      {
         line = fileScan.nextLine();
         System.out.println (line.toUpperCase());
      }
     
   }
}
