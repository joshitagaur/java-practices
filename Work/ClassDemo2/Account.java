class Account
{
	private String name;
	private int accountNo;
	private float balance;
	private String status;
	private static int ano;
	
	static 
	{
		ano = 100;
	}
	
	Account()
	{
		name="undefined";
		//accountNo = 0;
		accountNo = ano;
		ano += 50;
		balance = 0;
		status = "Account Created Successfully...";
	}
	
	Account(String name, float openingBalance)
	{
		this.name = name;
		//this.accountNo = accountNo;
		accountNo = ano;
		ano += 50;
		if (openingBalance >= 0)
			balance = openingBalance;
		status = "Account Created Successfully...";
	}
	
	void setName(String name)
	{
		this.name = name;
	}	
	String getName(){return name;}
	
	/*
	void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}
	*/	
	int getAccountNo(){return accountNo;}
	
	boolean deposit(float amount)
	{
		status = "Deposit failed...";
		if (amount <= 0)
			return false;
		balance += amount;
		status = "Deposit successfull...";
		return true;
	}
	
	boolean withdraw(float amount)
	{
		status = "Withdraw failed...";
		if (amount <= 0 || amount > balance)
			return false;		
		balance -= amount;		//balance = balance - amount;
		status = "Withdraw successfull...";
		return true;
	}
	
	float getBalance(){return balance;}
	
	String getStatus()
	{
		return status;
	}
	
	void showStatus()
	{
		System.out.println(status);
	}
	
	public void showAccount()
	{
		System.out.println("Name        : " + name);
		System.out.println("Account No. : " + accountNo);
		System.out.println("Balance     : " + balance);
		System.out.println();
	}
	
	
	public String toString()
	{
		return name + "[ANO:" + accountNo + ",Bal:" + balance + "]";	
	}
	
	public static int getNextAccountNo()
	{
		return ano;
	}
}

/*
Shared members of the class.
These are such members of the class which do not get created individually for each and every instance of the class. Rather a single copy of them exist, and this
single copy is shared by all the instance of the class. Such member are called as shared members.
To make a particular member of the class as shared, we need to declare as static.

The instance members belong to a specific instance. To access them we need to have the reference variable of that particular instance. As mentioned above, the 
shared members do to belong to a specific instance, they belong to the class. Therefore we access then using the class name, rather than the reference variable.
The instance members of the class come into existnace only when the object is created (i.e after invoking the new operator). The shared members always exist in 
the memory and can be accessed without even creating any object of the class.

A non static method can refer both static as well as non-static members of the class.
However, static method can access only other static members of the class.
 **/