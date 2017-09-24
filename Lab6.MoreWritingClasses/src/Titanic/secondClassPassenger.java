package Titanic;

public class secondClassPassenger extends Passenger
{
    public secondClassPassenger(boolean child, String sex, boolean survivor)
    {
        super(2, child, sex, survivor); // 1 = 1st class passenger
    }
}