package lab2;

import java.util.Scanner;

public class Lab2C {
	public static void main(String[] args) {
	Scanner time = new Scanner(System.in);
		
	System.out.println("Enter seconds: ");
	int seconds= time.nextInt();
	int hour= seconds/3600;
	int hourLeft= seconds%3600;
	int minute= hourLeft/60;
	int minuteLeft= hourLeft%60;
	int seconds1=minuteLeft;

	
	
	
	
	System.out.println("Your time in seconds: " +seconds);
	System.out.println("Time converted to..... " + hour + " hour, " + minute + " minute, and  "
	+ seconds1 + "  seconds");
	
	}

}
