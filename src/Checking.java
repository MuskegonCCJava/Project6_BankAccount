//	Checking.java by Kyle Wolff and Brandon VanderMey on 3/26/2015

public class Checking extends Account
{
	public Checking(int number)
	{
		super(number);
	}
	
	@Override
	public int getNumber()
	{
		return number;
	}
	
	@Override
	public double getBalance()
	{
		return balance;
	}
	
	public String getChecking()
	{
		return "Checking Account Information: Account number: " + getNumber() + " | Balance: " + getBalance();
	}
}
