package projects;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		final int N=1000000;
		int[] numbers = new int[N]; 
		Random rand = new Random();
		int n =0;
	//	int value=0;
		int count=0, count1=0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0, count9=0;
		
		
		for(int i=0; i<N;i++)
		{
			n = rand.nextInt(10);
			
			numbers[i]=n; // insert the numbers in the array
			
	//	System.out.print( numbers[i]);
		
		
		switch(numbers[i]) {
		   case 0 :   count++;    break; 
		   
		   case 1 :   count1++;   break; 
		      
		   case 2 :   count2++;   break; 
			     
		   case 3 :   count3++;   break; 
			      
		   case 4 :   count4++;   break;
		   
		   case 5 :   count5++;   break; 
		   
		   case 6 :   count6++;   break; 
		      
		   case 7 :   count7++;   break; 
			     
		   case 8 :   count8++;   break; 
			      
		   case 9 :   count9++;   break;
		}
		//int divider=(int)Math.pow(10, 4);
		//System.out.println(num);
		}
		System.out.println("\n0:" + count + "\n1:" + count1 + "\n2:" + count2 + "\n3:" + count3 + "\n4:" + count4 +
						   "\n5:" + count5+ "\n6:" + count6 + "\n7:" + count7 + "\n8:" + count8 + "\n9:" + count9 );
		System.out.print("0:");
		for(int b=0; b<count/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count+")");
		System.out.println();
		System.out.print("1:");
		for(int b=0; b<count1/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count1+")");
		System.out.println();
		System.out.print("2:");
		for(int b=0; b<count2/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count2+")");
		System.out.println();
		System.out.print("3:");
		for(int b=0; b<count3/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count3+")");
		System.out.println();
		System.out.print("4:");
		for(int b=0; b<count4/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count4+")");
		System.out.println();
		System.out.print("5:");
		for(int b=0; b<count5/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count5+")");
		System.out.println();
		System.out.print("6:");
		for(int b=0; b<count6/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count6+")");
		System.out.println();
		System.out.print("7:");
		for(int b=0; b<count7/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count7+")");
		System.out.println();
		System.out.print("8:");
		for(int b=0; b<count8/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count8+")");
		System.out.println();
		System.out.print("9:");
		for(int b=0; b<count9/(int)Math.pow(10, 4);b++)
		{
			System.out.print("*");
		}
		System.out.print("(" + count9+")");


 
	}

}
