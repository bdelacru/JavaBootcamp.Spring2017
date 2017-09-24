package Titanic;

public class PasssangerData {
	private Passenger[] collection;
	private int count;
	private int numSurvivors; 
   //-----------------------------------------------------------------
   //  Constructor: Creates an initially empty collection.
   //---------------------------------------------------------------
  public PasssangerData()
   {
      collection = new Passenger[100];
      count = 0;
      numSurvivors = 0;
   }
//-------------------------------------------------------------------
// adding passengers
//--------------------------------------------------------------------
	public void addPassenger(int status, boolean child, String sex, boolean survivor)
	{
		if(count == collection.length)
			increaseSize();
		
		//collection[count]= new Passenger (status, child, sex, survivor);
		if(status==1)
			collection[count]=new firstClassPassenger(child,sex,survivor);
		if(status==2)
			collection[count]=new secondClassPassenger(child,sex,survivor);
		if(status==3)
			collection[count]=new thirdClassPassenger(child,sex,survivor);
		if(status==4)
			collection[count]=new crewPassenger(child,sex,survivor);
		numSurvivors+=(survivor ? 1 : 0);
		count++;
	}
//--------------------------------------------------------------------
// making the print statement readable
//--------------------------------------------------------------------
	public String toString()
	{
String report = "~~~~~~~~~~~~~~~~~~~~~~\n";
report+= "Number of Survivors: " + numSurvivors + "\n";

for( int pass=0; pass< count; pass++)
	report+= collection[pass].toString() + "\n";
return report; 
	}
//--------------------------------------------------------------------
// increasing the size of passenger
//-------------------------------------------------------------------
	private void increaseSize()
	{
		
		Passenger[] temp= new Passenger[collection.length *2];
		for(int passenger=0; passenger < collection.length; passenger++)
			temp[passenger] = collection[passenger];
		collection= temp;
	}
}

