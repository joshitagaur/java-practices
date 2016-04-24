class Employee
{
	private String name;
	private int age;
	
	Employee()
	{
		name = "undefined";
		age = 0;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName(){return name;}
	
	void setAge(int age) throws InvalidAgeException
	{
		if (age >= 20 && age <= 30)
		{		
			this.age = age;			
		}
		else
		{
			InvalidAgeException iae = new InvalidAgeException("?Age Should Be Between 20 and 30 yrs.");
			throw iae;
		}						
	}
	
	int getAge(){return age;}
	
	void show()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println();
	}
	
}