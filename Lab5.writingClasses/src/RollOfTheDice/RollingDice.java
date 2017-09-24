package RollOfTheDice; 
//********************************************************************
//  RollingDice.java
//
//  Demonstrates the creation and use of a user-defined class.
//********************************************************************

public class RollingDice
{
   //-----------------------------------------------------------------
   //  Creates two Die objects and rolls them several times.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Die die1, die2, die3;
      int sum;

      die1 = new Die();
      
      die2 = new Die();
      die3 = new Die();

      die1.roll();
      die2.roll();
      die3.roll();
      die3.toString();
      System.out.println ("Die One:\n" + die1 + "\nDie Two:\n" + die2 + "\nDie Three:\n" + die3);

      die1.roll();
      die2.roll(); //setFaceValue(4);
      die3.setFaceValue(4);
      System.out.println ("Die One:\n" + die1 + ",\nDie Two: \n" + die2 + ",\nDie three: \n" + die3);

      sum = die1.getFaceValue() + die2.getFaceValue() + die3.getFaceValue();
      System.out.println ("Sum: \n" + sum);

      sum = die1.roll() + die2.roll() + die3.roll();
      System.out.println ("Die One: \n" + die1 + "\nDie Two:\n" + die2 + "\nDie Three:\n" + die3);
      System.out.println ("New sum: \n" + sum);
      die1.nudge(); // uses the nudge statement
      die2.nudge();
      die3.nudge();
      System.out.println(" New nudge die:\n" + "Die One:\n" + die1 + ",\nDie Two: \n" + die2 + ",\nDie three: \n" + die3); // runs the new nudge dice
   }
}
