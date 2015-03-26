//	Account.java by Kyle Wolff and Brandon VanderMey on 3/26/2015

public abstract class Account
{
	protected int number;
	protected double  balance;
	
	public Account(int number)
	{
		this.number = number;
		balance = 0.0;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public abstract int getNumber();
	
	public abstract double getBalance();
}
