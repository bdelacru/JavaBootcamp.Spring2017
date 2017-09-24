package Titanic;

public class firstClassPassenger extends Passenger
{
    public firstClassPassenger(boolean child, String sex, boolean survivor)
    {
        super(1, child, sex, survivor); // 1 = 1st class passenger
    }
}