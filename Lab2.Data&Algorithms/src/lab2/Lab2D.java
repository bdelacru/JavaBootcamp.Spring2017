package lab2;
import java.util.Scanner; 

public class Lab2D {

	public static void main(String[] args) {
		int max=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.print(" Enter first number: ");
		int first= scan.nextInt();
		
		System.out.print(" Enter second number: ");
		int second= scan.nextInt();
		
		System.out.print( " Enter third number: ");
		int third= scan.nextInt();
		
		System.out.print( "Enter fourth number: ");
		int fourth= scan.nextInt();
		
		System.out.println(" Numbers choosen : "+ first + " " +  second + " " + third +" "  +  fourth);
		
		
		int[] nums = {first, second, third, fourth};
		for ( int i=1; i< nums.length;i++)
		{
			  if (nums[i] > max)
			  {
			      max = nums[i]; 
			  }
			
		}
		System.out.println(" THe max is: " + max);
		}
	}


