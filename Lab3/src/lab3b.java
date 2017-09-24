import java.util.Random;
public class lab3b {

	public static void main(String[] args) {
		Random GenNum = new Random(); // sets random
		double[] Array= new double[100]; // sets the array
		int numbers; // variable for parameters
		
		for( int i=0; i<Array.length; i++) // sets the numbers to each array index
		{
			numbers = GenNum.nextInt(2); // goes from 0 - 1
			//System.out.println(numbers + " ");
			//Array[i]= numbers;
		}
		for( int i=0; i<Array.length; i++)
		{
			System.out.println("Element at index " + i + ": "+ Array[i]);
		}

	}

}
