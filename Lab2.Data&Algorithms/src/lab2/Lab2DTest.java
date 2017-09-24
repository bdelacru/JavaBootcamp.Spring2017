package lab2;

public class Lab2DTest {

	public static void main(String[] args) {
		int a=2;
		int b=33; 
		int c=4;
		int max=0;
		
		if (a> b && b>c) {
			max= a;
		}
		else if ( b> a && b > c) {
			max= b;
		}
		else if ( c> a && c >b) {
		max= c;	
		}
		System.out.println(" the max of the numbers  is : " + max);
			
		}

	}

