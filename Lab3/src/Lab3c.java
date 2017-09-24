import java.util.Random;
public class Lab3c {

	public static void main(String[] args) {
		boolean[] Array= new boolean[100]; // sets the array
		Random GenNum = new Random(); // sets random
		for( int i=0; i<Array.length; i++) // sets the numbers to each array index
		{
		
			//Array[i] = GenNum.nextBoolean();
		}
		for( int i=0; i<Array.length; i++)
		{
			System.out.println("Element at index " + i + ": "+ Array[i]);
		}
	}

}
