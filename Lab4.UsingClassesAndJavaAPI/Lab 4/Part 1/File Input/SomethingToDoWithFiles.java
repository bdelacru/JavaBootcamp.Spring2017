//********************************************************************
//  SomethingToDoWithFiles.java       Author: MAP
//  
//  Be sure to have two text files named sample1.inp and sample2.inp
//   in same folder.
//********************************************************************
import java.util.Scanner;
import java.io.*;

public class SomethingToDoWithFiles
{
   public static void main (String[] args) throws IOException
   {
      String line1, line2;
      Scanner fileScan1, fileScan2;

      File myFile1 = new File("sample1.inp");
      fileScan1 = new Scanner (myFile1);

      File myFile2 = new File("sample2.inp");
      fileScan2 = new Scanner (myFile2);
     
      while (fileScan1.hasNext() && fileScan2.hasNext())
      {
         line1 = fileScan1.nextLine();
         line2 = fileScan2.nextLine();    
         System.out.println (line1 + line2 + line1);
      }
      System.out.println(fileScan1.hasNext()? "first!": "second!");
   }
}
