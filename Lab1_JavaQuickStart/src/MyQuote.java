
public class MyQuote 
{
	 public static void main (String[] args)
	 {

		 int x=42;
		 int count=100;
		 double pi=3.14;
		 String name= "Betsy";
		
		System.out.println("Learn from yesterday, live for today, hope for tomorrow. The important thing is not to stop questioning.\n" );

		System.out.println("Howdy " + name);
		System.out.println("The answer is " +x);
		System.out.println("Counting...up:"+(count+1));
		System.out.println("...and\n...down:" + (count-1));
		System.out.println("The diameter of a circle with radius " + x+ " is "
				+ "" + (pi*x));
	 }
}