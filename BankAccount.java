



public class BankAccount{
	
	private String owner;
	private double balance;
	private double accountNumber;
	private boolean enoughFunds;
	
	public BankAccount(String owner, double balance, double accountNum)
	{
		this.owner = owner;
		this.balance = balance;
		this.accountNumber = accountNum;
	}

	
	
	public void Deposit(double amount)
	{
		balance += amount;
	}
	
	public void Withdraw(double amount)
	{
		enoughFunds = CheckFunds(amount);
		if(enoughFunds)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Sorry, you don't have enough funds");
			System.out.println("Amount withdrawn: $0.00");
		}
			
		
	}

	
	public double getBalance()
	{
		return this.balance;
	}
	
	
	
	public String showInfo()
	{
		return "Name: " + this.owner + "\n" + 
				"Balance: " + this.balance + "\n" +
				"Account Number: " + this.accountNumber + "\n";
	}
	
	public boolean CheckFunds(double amount)
	{
		if((balance - amount) > 0.0)
		{
		return true;
		}
		else
		{
		return false;
			
		}
		
		
	}
		

}
