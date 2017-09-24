package Titanic;

public class thirdClassPassenger extends Passenger
{
    public thirdClassPassenger(boolean child, String sex, boolean survivor)
    {
        super(3, child, sex, survivor); // 1 = 1st class passenger
    }
}