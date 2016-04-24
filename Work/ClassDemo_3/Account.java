class Account
{
	private String name;
	private int acno;
	private float balance;
	private static int ano;
	
	static 
	{
		ano = 100;
	}
	
	Account()
	{
		name = "undefined";
		acno = ano;
		ano += 25;
		balance = 0;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName(){return name;}
	
	
	boolean deposit(float amount)
	{
		if (amount <= 0)
			return false;
		balance += amount;
		return true;
	}
	
	boolean withdraw(float amount)
	{
		if (amount <= 0 || amount > balance)
			return false;
		balance -= amount;
		return true;
	}	
		
	void show()
	{
		System.out.println("Name        : " + name);
		System.out.println("Account No. : " + acno);
		System.out.println("Balance     : " + balance);
		System.out.println();
	}
	
	static int getNextAccountNo()
	{
		return ano;
	}
}