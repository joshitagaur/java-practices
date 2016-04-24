abstract class Employee implements Salary
{
	private String name;
	
	Employee()
	{
		name = "Undefined";
	}
	
	Employee(String name){setName(name);}
	
	void setName(String name){this.name = name;}
	String getName(){return name;}	
	void show()
	{
		System.out.println("Name : " + name);
	}	
}