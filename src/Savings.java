//	Saving.java by Kyle Wolff and Brandon VanderMey on 3/26/2015

public class Savings extends Account
{
	private double interest;
	
	public Savings(double interest, int number)
	{
		super(number);
		this.interest = interest;
	}
	
	@Override
	public double getBalance()
	{
		return balance;
	}
	
	@Override
	public int getNumber()
	{
		return number;
	}
	
	public String getSavings()
	{
		return "Savings Account Information: Account number: " + getNumber() + " | Balance: " + getBalance() + " | Interest Rate: " + interest;
	}
}
