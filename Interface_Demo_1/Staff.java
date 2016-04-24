class Staff extends Employee
{
	private float basicPay;
	
	Staff()
	{
		basicPay = 8000;
	}
	
	Staff(float basicPay)
	{
		setBasicPay(basicPay);
	}
	
	void setBasicPay(float basicPay)
	{
		this.basicPay = basicPay;
	}
	
	float getBasicPay()
	{
		return basicPay;
	}
	
	public float getSalary()
	{
		return basicPay + (basicPay * 0.6f) + (basicPay * 0.30f) + 2000;
	}
	
	void show()
	{
		super.show();
		System.out.println("Salary : " + getSalary());
		System.out.println();
	}
}