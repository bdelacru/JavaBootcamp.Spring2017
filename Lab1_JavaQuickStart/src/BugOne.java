
public class BugOne {

	public static void main(String[] args) {
		for (int i=0; i<100; i++)
			//Having an decremenet of i-- will make the for loop go to infinity
		{
			System.out.println("And you thought I was annoying before!");
		}

	}

}
