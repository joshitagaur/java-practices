class SetAccount
{
	private String name;
	private long accountno;
	private float balance;
	private float dep;
	private  float wid;
	

	
	void setDeposit(float amount)
	{
		if(amount<=0.0f)
		{
			
			dep=-0.0f;
			
		}
		else
		{
			dep=amount;	
		}
	}
	void setWithdraw(float amount)
	{
		if(amount<=0.0f&&amount>balance)
		{
			
			wid=-0.0f;
		}
		
		else
		{
			wid=amount;
		}
	}

	float getDeposit()
	{
		return dep;
	}
	float getWithdraw()
	{
		return wid;
	}
	
	
		void inputDetails()
	{
		System.out.println("Enter name: "+name);
		name=System.console().readLine();
		
		System.out.println("Enter account no: "+accountno);
		accountno=Integer.parseInt(System.console().readLine());
		
		System.out.println("Enter balance"+balance);
		balance=Integer.parseInt(System.console().readLine());
		
		System.out.println("Enter amount to deposit: ");
		setDeposit(Float.parseFloat(System.console().readLine()));
		
		System.out.println("Enter amount to withdraw: ");
		setWithdraw(Float.parseFloat(System.console().readLine()) );
	}
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Account no is: "+accountno);
		System.out.println("Balance is: "+balance);
		System.out.println("Amount deposited: "+(dep==-0.0f?"Not valid":dep));
		System.out.println("Amount withdrawn: "+(wid==-0.0f?"Not valid":wid));
	}
}