class Employee
{
	private String name;
	private int age;
	
	Employee()
	{
		name = "Undefined";
		age = 0;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName(){return name;}
	
	/*
	void setAge(int age)
	{
		if (age >= 20 && age <= 30)
			this.age = age;
		else
			System.out.println("Invalid age...");
	}
	*/
	/*
	void setAge(int age) throws InvalidAgeException
	{
		if (age < 20  || age > 30)
		{
			InvalidAgeException iae = new InvalidAgeException();
			throw iae;
		}
		this.age = age;
	}
	*/
	
	void setAge(int age) throws UnderAgeException, OverAgeException
	{
		if (age < 20)
			throw new UnderAgeException();
		else if (age > 30)
			throw new OverAgeException();
		this.age = age;
	}
	int getAge(){return age;}
	
	void show()
	{
		System.out.println("Name : " + getName());
		System.out.println("Age  : " + age);
	}
}