class Box extends Rectangle
{
	private int depth;
	
	Box()
	{
		depth = 20;
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
			this.depth = -1;
	}
	
	int getDepth(){return depth;}
	
	
	void inputDimensions()
	{
		super.inputDimensions();
		System.out.print("Enter depth : ");
		int temp = Integer.parseInt(System.console().readLine());
	}
	
	void showDimensions()
	{
		super.showDimensions();
		System.out.println("Depth   : " + (depth == -1 ? "Undefined" : depth));
	}
	
	void setDimensions(int length, int breadth, int depth)
	{
		setDimensions(length, breadth);
		setDepth(depth);
	}
	
	public String toString()
	{
		return "Box [" + 
			(getLength() == -1 ? "Undefined" : getLength())   + "x" + 
			(getBreadth() == -1 ? "Undefined" : getBreadth()) + "x" + 
			(depth == -1 ? "Undefined" : depth) + "]";		
	}
}

/*
Java supports only single inheritance.
A child class can inherit at the most only from a single parent.
Here parent class is called as super class.
here child class is called as sub class.

What is not inherited ?
Constructors are not inherited.

All members (data members and methods) are inherited.
private members of the super class are not directly accessible in the sub class.


When an object of the sub class gets constructed in the memory, then first it creates that
portion which the sub class had inherited from the super class. After that it creates that 
portion which is explicit to the sub class.

Object of sub class = Object of super class + new features.

Only the constructor of the sub class can call the constructor of the super class.
No other method of the sub class can call the constructor of the super class.
If the consturctor of the sub class do not explicitly call any constructor of the super class,
then its always the default constructor of the super class which gets called.

To call the super class constructor we make use of the keyword "super"
 **/