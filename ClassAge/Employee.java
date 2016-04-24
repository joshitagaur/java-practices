class Employee
{
	private String name;
	private int age;
	
	Employee()
	{
		name="undefined";
		age=0;
	}
	
	void setName(String name)
	{
		this.name=name;
		
	}
	String getName()
	{
		return name;
	
	}
	
	void setAge(int age) throws UnderAgeException,OverAgeException
	{
		if(age<20)
		{
			
		
			UnderAgeException u=new UnderAgeException("Enter age above 20 years...");
			throw u;
		}
		else if(age>30)
		{
			OverAgeException o=new OverAgeException("Enter age below 30 years...");
			throw o;
		}
		else
		{
			this.age=age;
		}
	}
	
	int getAge()
	{
		return age;
	}
	
	void show()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}