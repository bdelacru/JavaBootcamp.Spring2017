package Titanic;

public class crewPassenger extends Passenger
{
    public crewPassenger(boolean child, String sex, boolean survivor)
    {
        super(4, child, sex, survivor); // 1 = 1st class passenger
    }
}