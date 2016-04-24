class Box extends Rectangle
{
	private int depth;
	
	Box()
	{
		//super();
		depth = 0;
		System.out.println("Class Box : Default constructor called...");		
	}
	
	Box(int length, int breadth, int depth)
	{		
		super(length, breadth);
		setDepth(depth);
		System.out.println("Class Box : Overloaded constructor called...");
	}
	
	
	void setDepth(int depth)
	{
		if (depth >= 0)
			this.depth = depth;
		else
			this.depth = 0;
	}
	
	void setDimensions(int length, int breadth, int depth)
	{
		setDimensions(length, breadth);
		setDepth(depth);
	}
	
	void inputDimensions()
	{
		super.inputDimensions();
		System.out.print("Enter depth : ");
		setDepth(Integer.parseInt(System.console().readLine()));
	}
	
	void show()
	{
		super.show();
		System.out.println("Depth   : " + depth);
	}
	
	int getVolume()
	{
		return getArea() * depth;
	}
}