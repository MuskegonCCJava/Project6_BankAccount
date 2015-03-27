import java.util.Date;

//	Main_BA.java by Kyle Wolff and Brandon VanderMey on 3/26/2015

public class Main_BA
{
	public static void main(String[] args)
	{
		Date today = new Date();
		System.out.println("Bank Account by Kyle Wolff and Brandon VanderMey on " + today);
		
		Checking checking = new Checking(114234);
		Savings savings = new Savings(5.0, 115512);
		
		checking.setBalance(200.23);
		savings.setBalance(500.55);
		
		System.out.println(checking.getChecking() + "\n" + savings.getSavings());
	}
}
