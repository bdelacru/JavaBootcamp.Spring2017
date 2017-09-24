package RollOfTheDice;
//********************************************************************
//  Die.java 
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.
//********************************************************************

public class Die
{
   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the die

   //-----------------------------------------------------------------
   //  Constructor: Sets the initial face value.
   //-----------------------------------------------------------------
   public Die()
   {
      faceValue = 1;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1;

      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue(int value)
   {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue()
   {
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this die.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = " +---+\n | " + faceValue + " | \n +---+";
      return result;
   }
   public int nudge()
   {
	   if ( faceValue == 1 || faceValue == 2 ||faceValue== 3 || faceValue==4 ||faceValue== 5 ) {
		   faceValue+=1;
	   }
	   else
	   {
		   faceValue=1;
	   }
		 return faceValue;  
		   
   }
}
