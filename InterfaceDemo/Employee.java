abstract class Employee implements Salary
{
	private String name;
	
	Employee()
	{
		name = "undefined";
	}
	
	Employee(String name)
	{
		this.name = name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}
	
	void show()
	{
		System.out.println("Name : " + name);
	}
}