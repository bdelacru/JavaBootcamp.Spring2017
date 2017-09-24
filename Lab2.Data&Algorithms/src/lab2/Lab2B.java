package lab2;
import java.util.Scanner;

public class Lab2B {
	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		
		System.out.println("Enter hour: ");
		int hour= time.nextInt();
		System.out.println("Enter minute: ");
		int minute= time.nextInt();
		System.out.println("Enter seconds: ");
		int second= time.nextInt();
		int hourSecond= 3600*hour;
		int minuteSeconds= 60*minute;
		
		
		System.out.println("Your time: " + hour + " hour " + minute + " minute " + second + " second ");
		System.out.println("Time converted to seconds:" + (hourSecond+minuteSeconds+second));
	}

}
