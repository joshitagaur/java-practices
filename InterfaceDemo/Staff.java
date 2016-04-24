public class Staff extends Employee
{
	private float basicPay;
	
	Staff()
	{
		basicPay = 5000;
	}
	
	Staff(String name)
	{
		super(name);
		basicPay = 3000;
						
	}
	
	Staff(String name, float hoursWorked)
	{
		super(name);
		setBasicPay(hoursWorked);
	}
	
	void setBasicPay(float basicPay)
	{
		if (basicPay < 0)
			this.basicPay = 240;
		else
			this.basicPay = basicPay;
	}
	
	float getBasicPay(){return basicPay;}
	
	public float getSalary()
	{
		return basicPay + (basicPay * 0.6f) + (basicPay * 0.2f) + 5000;
	}
	
	void show()
	{
		super.show();
		System.out.println("Salary : " + getSalary());
	}
}