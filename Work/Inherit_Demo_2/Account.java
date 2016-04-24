class Account
{
	private String name;
	private int acno;
	private static int ano;
	private float balance;
	private String status;
	
	static 
	{
		ano = 100;
	}
	
	private void assignAccountNo()
	{
		acno = ano;
		ano += 125;			
	}
		
	
	Account()
	{
		name = "undefined";
		assignAccountNo();
		balance = 0;
		status = "Account Opened Successfully...!";
	}
	
	Account(String name)
	{
		this.name = name;
		assignAccountNo();
		balance = 0;
		status = "Account Opened Successfully...!";
	}
	
	Account(String name, float openingBalance)
	{
		this.name = name;
		assignAccountNo();
		balance = 0;
		deposit(openingBalance);
		status = "Account Opened Successfully...!";
	}
	
	boolean deposit(float amount)
	{
		if (amount <= 0)
		{
			status = "Deposit failed...";
			return false;
		}
			
		balance += amount;
		status = "Deposit Successfull...";
		return true;
	}
	
	boolean withdraw(float amount)
	{
		if (amount <= 0 || amount > balance)
		{
			status = "Withdraw Failed...";
			return false;
		}
		balance -= amount;
		status = "Withdraw Successfull...";
		return true;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName(){return name;}
	int getAccountNo(){return acno;}
	float getBalance(){return balance;}
	
	
	void show()
	{
		System.out.println("Name        : " + name);
		System.out.println("Account No. : " + acno);
		System.out.println("Balance     : " + balance);
	}	
		
	String getStatus()
	{
		return status;
	}		
		
	void showStatus()
	{
		System.out.println("Status : " + status);
	}		
}