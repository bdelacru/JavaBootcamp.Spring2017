package lab2;
import java.util.Scanner;

public class Lab2A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = scan.nextLine();
		
		System.out.print("please enter pet name: ");
		String pet= scan.nextLine();
		
		System.out.print("Please enter age: ");
		int age = scan.nextInt();
		
		System.out.println();
		
		System.out.println(" Hello, my name is " + name + " and I am " + age + " years old."
				+ "I'm enjoying my time at Villanova, through I miss my pet " + pet +  " very much!");
	}

}
