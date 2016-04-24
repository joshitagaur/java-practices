public class Labour extends Employee
{
	private float hoursWorked;
	
	Labour()
	{
		hoursWorked = 240;
	}
	
	Labour(String name)
	{
		super(name);
		hoursWorked = 240;						
	}
		
	Labour(String name, float basicPay)
	{
		super(name);
		setHoursWorked(basicPay);
	}
	
	void setHoursWorked(float hoursWorked)
	{
		if (hoursWorked < 0)
			this.hoursWorked = 240;
		else
			this.hoursWorked = hoursWorked;
	}
	
	float getHoursWorked(){return hoursWorked;}
	
	public float getSalary()
	{
		return hoursWorked * 50;
	}
	
	void show()
	{
		super.show();
		System.out.println("Salary : " + getSalary());
	}
}