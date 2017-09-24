//********************************************************************
//  EvenOdd.java
//
//  Demonstrates the use of the JOptionPane class.
//********************************************************************

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

      do 
      {
         numStr = JOptionPane.showInputDialog ("Enter an integer: ");
         num = Integer.parseInt(numStr);

         result = ("Math.sqrt(" + num + ")=" + Math.sqrt(num) 
         + "\n" + "Absolute Value= " + Math.abs(num)
         + "\n" + "Cos= " + Math.cos(Math.toRadians(num))
         + "\n" + "Sin= " + Math.sin(Math.toRadians(num))
         + "\n" + "Tan= " + Math.tan(Math.toRadians(num))
         + "\n" + "Ceil= " + Math.ceil(num)
         + "\n" + "Floor= " + Math.floor(num));

         JOptionPane.showMessageDialog (null, result);
         again = JOptionPane.showConfirmDialog (null, "Do Another?");
      }
      while (again == JOptionPane.YES_OPTION);
   }
}