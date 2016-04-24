class Rectangle
{
	private int length;
	private int breadth;
	
	Rectangle()
	{
		length = 60;
		breadth = 30;
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
			this.length = -1;
	}
	int getLength(){return length;}
	
	void setBreadth(int breadth)
	{
		if (breadth >= 0)
			this.breadth = breadth;
		else
			this.breadth = -1;
	}
	int getBreadth(){return breadth;}
	
	void setDimensions(int length, int breadth)
	{
		setLength(length);
		setBreadth(breadth);
	}
	
	void inputDimensions()
	{
		int temp;
		System.out.print("Enter length : ");
		temp = Integer.parseInt(System.console().readLine());
		setLength(temp);
		
		System.out.print("Enter breadth : ");
		temp = Integer.parseInt(System.console().readLine());
		setBreadth(temp);
	}
	
	void showDimensions()
	{
		System.out.println("Length  : " + (length == -1 ? "Undefined" : length));
		System.out.println("Breadth : " + (breadth == -1? "Undefined" : breadth));
	}
	
	public String toString()
	{
		return "Rectangle [" + (length == -1 ? "Undefined" : length) + "x" + (breadth == -1? "Undefined" : breadth) + "]";
	}
}