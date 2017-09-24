import java.util.Scanner;
public class Lab3e 
{
    public static void main(String[] args)
    {
    	Scanner in= new Scanner(System.in); 
    	int[] anArray= new int[6];  // declares an array of integers // allocates memory for 5 integers
    	System.out.print("ENTER NUMBERS: ");
    	int value=0;
    	
	        for ( int i=0; i < anArray.length; i++)
	        {
	         value= in.nextInt(); 
	        	anArray[i]=value;
	        	
	        }
	      
	        
	      for ( int i=0; i< anArray.length; i++)
	       {
	    	 
	       	System.out.println("Element at index " +  i + ": "+ anArray[i]);
	        } 
    }
}