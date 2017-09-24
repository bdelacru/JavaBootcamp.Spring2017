//********************************************************************
//  EvenOdd.java
//
//  Demonstrates the use of the JOptionPane class.
//********************************************************************
package projects;
import javax.swing.JOptionPane;

public class EvenOdd
{
   //-----------------------------------------------------------------
   //  Determines if the value input by the user is even or odd.
   //  Uses multiple dialog boxes for user interaction.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String numStr, result;
      float num, again;
      String sqrt;

      do 
      {
         numStr = JOptionPane.showInputDialog ("Enter an integer: ");
         num = Float.parseFloat(numStr);

         result = "That number is " + ((num%2 == 0) ? "even" : "odd") 
        		 + " \nThe sqrt is " + Math.sqrt(num) 
        		 + "\nThe absolute value is " + Math.abs(num)
        		 + "\nThe sin is: " + Math.sin(num)+" ||The cos is: " + Math.cos(num)+ " ||The tan is: " + Math.tan(num)
        		 + "\nThe floor is " + Math.floor(num) + "||The ceil is " + Math.ceil(num) ;
       //  sqrt = "The sqrt is " + Math.sqrt(num);

         JOptionPane.showMessageDialog (null, result);
        // JOptionPane.showMessageDialog (null, sqrt);
         again = JOptionPane.showConfirmDialog (null, "Do Another?");
      }
      while (again == JOptionPane.YES_OPTION);
   }
}
