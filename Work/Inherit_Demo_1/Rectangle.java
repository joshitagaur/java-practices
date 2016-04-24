class Rectangle
{
	private int length;
	private int breadth;
	
	Rectangle()
	{
		length = 0;
		breadth = 0;
		System.out.println("Class Rectangle : Default constructor called...");
	}
	
	Rectangle(int length, int breadth)
	{
		setLength(length);
		setBreadth(breadth);
		System.out.println("Class Rectangle : Overloaded constructor called...");
	}
	
	void setLength(int length)
	{
		if (length >= 0)
			this.length = length;
		else
			this.length = 0;
	}
	
	void setBreadth(int breadth)
	{
		if (breadth >= 0)
			this.breadth = breadth;
		else
			this.breadth = 0;
	}
	
	void setDimensions(int length, int breadth)
	{
		setLength(length);
		setBreadth(breadth);
	}
	
	void inputDimensions()
	{
		System.out.print("Enter length : ");
		setLength(Integer.parseInt(System.console().readLine()));
		
		System.out.print("Enter bredth : ");
		setBreadth(Integer.parseInt(System.console().readLine()));
	}
	
	
	void show()
	{
		System.out.println("Length  : " + length);
		System.out.println("Breadth : " + breadth);
	}
	
	int getArea(){return length * breadth;}
	int getPerimeter(){return 2 * (length + breadth);}
}