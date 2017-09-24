package projects;

import java.io.*;
import java.util.*;

class FileInput {
	public static void main(String[] args) throws IOException {
		File input = new File("hemingway-old-man.txt");
		String content = new Scanner(input).useDelimiter("\\Z").next();
		content= content.toUpperCase();
		int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0 ,l=0 ,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
	//	System.out.println(content);
	
		//System.out.println(content.toUpperCase());

      final int NUMCHARS = 26;



      int[] upper = new int[NUMCHARS];
      

      char current;   // the current character being processed
      int other = 0;  // counter for non-alphabetics


      //  Count the number of each letter occurence
      for (int ch = 0; ch < content.length(); ch++)
      {
         current = content.charAt(ch);
         if (current >= 'A' && current <= 'Z')
            upper[current-'A']++;
         else
          /*  if (current >= 'a' && current <= 'z')
               lower[current-'a']++;*/
          //  else
               other++;
 		
 	/*	switch(upper[ch]) {
 		   case 0 :   a++;    break; 
 		   
 		   case 1 :   b++;   break; 
 		      
 		   case 2 :   c++;   break; 
 			     
 		   case 3 :   d++;   break; 
 			      
 		   case 4 :   e++;   break;
 		   
 		   case 5 :   f++;   break; 
 		   
 		   case 6 :   g++;   break; 
 		      
 		   case 7 :   h++;   break; 
 			     
 		   case 8 :   i++;   break; 
 			      
 		   case 9 :   j++;   break;
 		   
 		   case 10:	  k++; 	break;
 		   
 		   case 11:   l++;  break;
 		   
 		   case 12:   m++; break;
 		   
 		   case 13:   n++;  break;
 		   
 		   case 14:   o++;  break;
 		   
 		   case 15:  p++;   break;
 		   
 		   case 16:  q++;   break;
 		   
 		   case 17:  r++;  break;
 		   
 		   case 18:  s++; break;
 		   
 		   case 19:  t++;  break;
 		   
 		   case 20:  u++; break;
 		   
 		   case 21:  v++;  break;
 		   
 		   case 22:  w++; break;
 		   
 		   case 23:  x++; break;
 		   
 		   case 24:  y++; break;
 		   
 		   case 25: z++; break;
 		}
      }
  	System.out.print("a:");
		for(int A=0; A<a/(int)Math.pow(10, 2);A++)
		{
			System.out.print("*");
		}
		System.out.print("(" + a+")");
		System.out.println();
		System.out.print("b:");
		for(int B=0; B<b/(int)Math.pow(10, 2);B++)
		{
			System.out.print("*");
		}
		System.out.print("(" + b+")");
		System.out.println();
		System.out.print("c:");
		for(int C=0; C<c/(int)Math.pow(10, 2);C++)
		{
			System.out.print("*");
		}
		System.out.print("(" + c+")");
		System.out.println();
		System.out.print("d");
		for(int D=0; D<d/(int)Math.pow(10, 2);D++)
		{
			System.out.print("*");
		}
		System.out.print("(" +d+")");
		System.out.println();
		System.out.print("e:");
		for(int E=0; E<e/(int)Math.pow(10, 2);E++)
		{
			System.out.print("*");
		}
		System.out.print("(" + e+")");
		System.out.println();
		System.out.print("f:");
		for(int F=0; F<f/(int)Math.pow(10, 2);F++)
		{
			System.out.print("*");
		}
		System.out.print("(" + f+")");
		System.out.println();
		System.out.print("g:");
		for(int G=0; G<g/(int)Math.pow(10, 2);G++)
		{
			System.out.print("*");
		}
		System.out.print("(" + g+")");
		System.out.println();
		System.out.print("h:");
		for(int H=0; H<h/(int)Math.pow(10, 2);h++)
		{
			System.out.print("*");
		}
		System.out.print("(" + h+")");
		System.out.println();
		System.out.print("i:");
		for(int I=0; i<I/(int)Math.pow(10, 2);I++)
		{
			System.out.print("*");
		}
		System.out.print("(" + i+")");
	  	System.out.print("j:");
		for(int J=0; J<j/(int)Math.pow(10, 2);J++)
		{
			System.out.print("*");
		}
		System.out.print("(" + j+")");
		System.out.println();
		System.out.print("k:");
		for(int K=0; K<k/(int)Math.pow(10, 2);K++)
		{
			System.out.print("*");
		}
		System.out.print("(" + k+")");
		System.out.println();
		System.out.print("l:");
		for(int L=0; L<l/(int)Math.pow(10, 2);L++)
		{
			System.out.print("*");
		}
		//System.out.print("(" + l+")");
		System.out.println();
		System.out.print("m");
		for(int M=0; M<m/(int)Math.pow(10, 2);M++)
		{
			System.out.print("*");
		}
		System.out.print("(" +m+")");
		System.out.println();
		System.out.print("n:");
		for(int N=0; N<n/(int)Math.pow(10, 2);N++)
		{
			System.out.print("*");
		}
		System.out.print("(" + n+")");
		System.out.println();
		System.out.print("o:");
		for(int O=0; O<o/(int)Math.pow(10, 2);O++)
		{
			System.out.print("*");
		}
		System.out.print("(" + o+")");
		System.out.println();
		System.out.print("p:");
		for(int P=0; P<p/(int)Math.pow(10, 2);P++)
		{
			System.out.print("*");
		}
		System.out.print("(" + p+")");
		System.out.println();
		System.out.print("q:");
		for(int Q=0; Q<q/(int)Math.pow(10, 2);Q++)
		{
			System.out.print("*");
		}
		System.out.print("(" + q+")");
		System.out.println();
		System.out.print("r:");
		for(int R=0; R<r/(int)Math.pow(10, 2);r++)
		{
			System.out.print("*");
		}
		System.out.print("(" + r+")");
		System.out.println();
	  	System.out.print("s:");
		for(int S=0; S<s/(int)Math.pow(10, 2);S++)
		{
			System.out.print("*");
		}
		System.out.print("(" + s+")");
		System.out.println();
		System.out.print("t:");
		for(int T=0; T<t/(int)Math.pow(10, 2);T++)
		{
			System.out.print("*");
		}
		System.out.print("(" + t+")");
		System.out.println();
		System.out.print("u:");
		for(int U=0; U<u/(int)Math.pow(10, 2);U++)
		{
			System.out.print("*");
		}
		System.out.print("(" + u+")");
		System.out.println();
		System.out.print("v");
		for(int V=0; V<v/(int)Math.pow(10, 2);V++)
		{
			System.out.print("*");
		}
		System.out.print("(" +v+")");
		System.out.println();
		System.out.print("w:");
		for(int W=0; W<w/(int)Math.pow(10, 2);W++)
		{
			System.out.print("*");
		}
		System.out.print("(" + w+")");
		System.out.println();
		System.out.print("x:");
		for(int X=0; X<x/(int)Math.pow(10, 2);X++)
		{
			System.out.print("*");
		}
		System.out.print("(" + x+")");
		System.out.println();
		System.out.print("y:");
		for(int Y=0; Y<y/(int)Math.pow(10, 2);Y++)
		{
			System.out.print("*");
		}
		System.out.print("(" + y+")");
		System.out.println();
		System.out.print("z:");
		for(int Z=0; Z<z/(int)Math.pow(10, 2);z++)
		{
			System.out.print("*");
		}
		System.out.print("(" + z+")");
		System.out.println();
	
		
      
   /*   for(int a=0; a<upper.length; a++)
      {
    	  for(int b=0; b< upper[a]; b++)
    		  System.out.print("*");
      }
*/
      //  Print the results
     /// System.out.println ();
      }
      
      // Counting
         for (int letter=0; letter < upper.length; letter++)
      {
         System.out.print ( (char) (letter + 'A') ); 
         System.out.println (": " + upper[letter]);
      }

      System.out.println ();
    
		System.out.println ("Non-alphabetic characters: " + other);
   }


	}

