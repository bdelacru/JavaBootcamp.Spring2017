package lab2;
import java.util.Scanner;
public class Lab2E {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int max=0;
		
		System.out.print(" Finding the maximum of some values. How many will there be?");
		int number= scan.nextInt();
		
		System.out.print(" Please enter " + number+ " numbers. separated by spaces: ");
		for( int i=1; i <= number; i++)
		{
			int nums= scan.nextInt();	
			System.out.print(" " +nums + " ");
		    if(nums > max)
            {
            max = nums;
            } 
	
		}
		System.out.println();
		System.out.println(" The laragest value entered is : " + max);
		
	}

}
