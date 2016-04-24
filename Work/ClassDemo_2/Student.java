class Student
{
	private String name;
	private int physics;
	private int chemistry;
	private int math;
	
	
	Student()
	{
		name = "undefined";
		physics = chemistry = math = -1;
	}
	
	public void setName(String name)
	{
		this.name = name;		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPhysics(int physics)
	{
		if (physics >= 0 && physics <= 100)
			this.physics = physics;
		else
			this.physics = -1;				 
	}
	
	public void setChemistry(int chemistry)
	{
		if (chemistry >= 0 && chemistry <= 100)
			this.chemistry = chemistry;
		else
			this.chemistry = -1;
	}
	
	
	public void setMath(int math)
	{
		if (math >= 0 && math <= 100)
			this.math = math;
		else
			this.math = -1;
	}
	
	
	int getPhysics(){return physics;}
	int getChemistry(){return chemistry;}
	int getMath(){return math;}
	
	
	int getTotal()
	{
		int total = 0;
		if (physics != -1)
			total += physics;
		if (chemistry != -1)
			total += chemistry;
		if (math != -1)
			total += math;
		return total;
	}
	
	
	int getMaxMarks()
	{
		int total = 0;
		if (physics != -1)
			total += 100;
		if (chemistry != -1)
			total += 100;
		if (math != -1)
			total += 100;
		return total;
	}
	
	float getPercent()
	{
		int maxMarks = getMaxMarks();
		if (maxMarks == 0)
			return -1.0f;
		return getTotal() * 100.0f / getMaxMarks();
	}
	
	void show()
	{
		System.out.println("Name : " + name);
		System.out.println("Physics : " + (physics == -1 ? "Undefined" : physics));
		System.out.println("Chemistry : " + (chemistry == -1 ? "Undefined" : chemistry));
		System.out.println("Math : " + (math == -1 ? "Undefined" : math));		
		System.out.println("Percentage : " + (getPercent() == -1 ? "Undefined" : getPercent()));
		System.out.println();
	}
	
	
	void setDetails(String name, int physics, int chemistry, int math)
	{
		setName(name);
		setPhysics(physics);
		setChemistry(chemistry);
		setMath(math);
	}
	
	void inputDetails()
	{
		System.out.print("Enter name : ");
		name = System.console().readLine();
		
		System.out.print("Enter marks for physics : ");
		setPhysics(Integer.parseInt(System.console().readLine()));
		
		System.out.print("Enter marks for chemistry : ");
		setChemistry(Integer.parseInt(System.console().readLine()));
		
		System.out.print("Enter marks for math : ");
		setMath(Integer.parseInt(System.console().readLine()));		
		
	}
}