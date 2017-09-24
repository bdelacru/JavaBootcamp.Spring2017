//***********************************************************************
//  SwitchExample.java              Author: M A Papalaskari
//  Example of switch statement that does NOT use break after each case.
//***********************************************************************
import java.util.Scanner;

public class SwitchExample 
{
  // Example of using a switch statement. Counts number of digits, zeros,
  // whitespace, and others in a line of input.

  public static void main (String[] args) 
  { 
    Scanner scan = new Scanner(System.in);  
    int digits = 0, zeros = 0, whitespace = 0, other = 0;
    
    System.out.print("Input line>");
    String message = scan.nextLine();
    
    int count = 0; 
    while (count < message.length()) {
      switch (message.charAt(count)) {
         case '0':  zeros++;
         case '1':
         case '2':   
         case '3':
         case '4':   
         case '5':
         case '6':   
         case '7': 
         case '8':   
         case '9':  digits++; break;
         case ' ':
         case '\t': whitespace++; break;
         default:   other++;
      }  // end switch
      count++;
    } // end while 
    System.out.print(digits + " Digit" + (digits==1 ? "" : "s"));
    System.out.print(", of which " + zeros);
    System.out.println((zeros==1 ? " is a zero " : " are zeros "));

    System.out.println(whitespace + " whitespace");
    System.out.println(other + " other" + (other==1 ? "" : "s"));
  }
}
