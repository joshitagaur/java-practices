public class ClassDemo_3
{
	
	static 
	{
		System.out.println("Executing from the static block...");
	}
	
	public static void main(String args[])
	{
		System.out.println("Next Account No Is : " + Account.getNextAccountNo());
		
		
		/*
		Account a1 = new Account();
		a1.setName("Sunil");
		a1.deposit(10000);
		a1.show();
		
		a1.withdraw(2000);
		a1.show();
		
		Account a2, a3, a4;
		
		a2 = new Account();
		a3 = new Account();
		a4 = new Account();
		
		a2.show();
		a3.show();
		a4.show();
		*/
	}
}