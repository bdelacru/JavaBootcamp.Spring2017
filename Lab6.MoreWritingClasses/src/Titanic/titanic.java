package Titanic;

import java.io.*;
import java.util.Scanner;

public class titanic {
	public static void main(String[] args) throws IOException {
	    int status; 
	    boolean child, survivor;
	    String sex;
	    int count=0, numSurvivor=0, children=0, men=0, women=0, boy=0, girl=0;
	    PasssangerData titanic = new PasssangerData();
	    File input = new File("titanic.txt"); // adding the file in 
	    String content = new Scanner(input).useDelimiter("\\Z").next(); // reading the file in String
	    Scanner in = new Scanner(content); // reading the file from a string
	  //  System.out.println(content); // to test out
  

      while (in.hasNext()) {
    	      status = in.nextInt();
    	      child = in.nextBoolean();
    	      sex = in.next();
    	      survivor= in.nextBoolean();
    	      
    	      titanic.addPassenger( status, child, sex,survivor);
    	      count++; // Total number of people
    	      
    	     if(survivor)
    	    	 numSurvivor++;
    	     if(child)
    	    	 children++;
    	     if(sex.equals("male"))
    	    	 men++;
    	     if(sex.equals("female"))
    	    	 women++;
    	     if(child && sex.equals("male"))
    	    	 boy++;
    	     if(child && sex.equals("female"))
    	    	 girl++;
    	     
    	    }
      System.out.println(titanic);
      System.out.println("Number of passenger: " + count);
      System.out.println("Number of Survivors: " + numSurvivor);
      System.out.println("Number of children: " + children);
      System.out.println("Number of Women: " + women);
      System.out.println("Number of Men: " + men);
      System.out.println("Survivor rate: " + (double)(numSurvivor*100/count) + "%");
      System.out.println("Number of boys: " + boy);
      System.out.println("Numbber of girls: " + girl);
	}
}
