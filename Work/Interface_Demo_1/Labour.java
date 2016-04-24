class Labour extends Employee
{
	private float hourlyWages;
	private int hoursWorked;
	
	Labour()
	{
		hourlyWages = 100;
	}
	
	Labour(float hourlyWages)
	{
		setHourlyWages(hourlyWages);
	}
	
	
	void setHourlyWages(float hourlyWages)
	{
		this.hourlyWages = hourlyWages;
	}
	
	float getHourlyWages(){return hourlyWages;}
	
	void setHoursWorked(int hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	
	int getHoursWorked()
	{
		return hoursWorked;
	}
	
	public float getSalary()
	{
		return hoursWorked * hourlyWages;
	}
	
	void show()
	{
		super.show();
		System.out.println("Salary : " + getSalary());
		System.out.println();
	}
}