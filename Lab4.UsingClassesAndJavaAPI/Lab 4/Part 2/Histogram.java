import java.util.Random;

      // Making a Histogram class
  public class Histogram
{
   int number;
   String graph;
   
   public Histogram (int x)
   {
      number=x;
   }
   
   public String draw()
   {
      int FirstNumber = number/((int)(Math.pow(10,4)));
      do
      {
      System.out.print("*");
      FirstNumber --;      
      } while (FirstNumber>0);
      return ""; 

    }
   
   // Declaring and initialize the array   
   public static void main (String[] args)
   {
      Random rand = new Random();
      
      int No0=0, No1=0, No2=0, No3=0, No4=0, No5=0, No6=0, No7=0, No8=0, No9=0, other=0;
      
      
      int[] Random_Array = new int[(int)Math.pow(10,6)];
      for (int x=0; x<Random_Array.length; x++)
      {
         Random_Array[x]=rand.nextInt(10);
         
         switch (Random_Array[x]) 
         {
         case 0:  No0++; break;
         case 1:  No1++; break;
         case 2:  No2++; break;
         case 3:  No3++; break;
         case 4:  No4++; break;
         case 5:  No5++; break;
         case 6:  No6++; break;
         case 7:  No7++; break;
         case 8:  No8++; break;
         case 9:  No9++; break;       
         default:   other++;
         }  // end switch
      }
      
     /* 
      System.out.println( "0\t" + No0 + "\n" +
      "1\t" + No1 + "\n" +
      "2\t" + No2 + "\n" +
      "3\t" + No3 + "\n" +
      "4\t" + No4 + "\n" +
      "5\t" + No5 + "\n" +
      "6\t" + No6 + "\n" +
      "7\t" + No7 + "\n" +
      "8\t" + No8 + "\n" +
      "9\t" + No9 + "\n" +
      other
      );
      */
      
      
      // How do you change the No0 from a int to a string so that you can edit it?
      // Print out the result
      
      
      // Draw Histogram of No0
      Histogram Temp = new Histogram(No0);
      System.out.print("0 ");
      System.out.println(Temp.draw() + "\t" + No0);
 
      
      // Draw Histogram of No1    
      Histogram Temp1 = new Histogram(No1);
      System.out.print("1 ");
      System.out.println(Temp.draw() + "\t" + No1);

   }
}