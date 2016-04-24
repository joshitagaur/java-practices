class ClassDemo2
{
	
	static 
	{
		System.out.println("Executing before main...");
	}
	
	public static void main(String args[])
	{
		System.out.println("Next Account No. Would Be : " + Account.getNextAccountNo());
		
		/*
		Account a1, a2;
		
		a1 = new Account();
		a1.setName("Naresh");
		//a1.setAccountNo(123);
		a1.deposit(10000);
		
		a2 = new Account("Vishal",20000);
		
		a1.showAccount();
		a2.showAccount();
		
		
		a1.deposit(40000);
		a1.showStatus();
		a1.showAccount();
		
		a1.withdraw(45000);
		a1.showStatus();
		a1.showAccount();
		
		a1.withdraw(45000);
		a1.showStatus();
		a1.showAccount();
		*/
	}
}