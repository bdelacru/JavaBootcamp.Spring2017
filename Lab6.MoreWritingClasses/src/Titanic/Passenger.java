package Titanic;

public class Passenger{
	private int status;
	private boolean child;
	private String sex;
	private boolean survivor; 
	

	public Passenger(int status, boolean child, String sex, boolean survivor)
	{
		this.status=status;
		this.child=child;
		this.sex=sex;
		this.survivor=survivor;
		
	}
	public String toString()
	{
		String result = "--------------------------\n";
		
		result+= " " + status;
		result+= " " + child ;
		result+= " " + sex ;
		result+= " " + survivor;
		
		return result;
	}
}


