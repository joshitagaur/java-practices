class InheritDemo2
{
	public static void main(String args[])
	{
		Account a1 = new Account("ABC",50000);
		a1.showStatus();
		a1.deposit(40000);
		a1.showStatus();
		a1.withdraw(-3000);
		a1.showStatus();
		
	}
}