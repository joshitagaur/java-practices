class Rectangle extends Shape
{
	private int length;
	private int breadth;
	
	Rectangle()
	{
		super("Rectangle");		
	}
	
	Rectangle(int length, int breadth)
	{
		super("Rectangle");
		setLength(length);
		setBreadth(breadth);
	}
	
	void setLength(int length)
	{
		if (length < 0)
			this.length = -1;
		else
			this.length = length;
	}
	
	void setBreadth(int breadth)
	{
		if (breadth < 0)
			this.breadth = -1;
		else
			this.breadth = breadth;
	}
	
	int getLength(){return length;}
	int getBreadth(){return breadth;}
	
	
	void inputDimensions()
	{
		System.out.print("Enter length : ");
		setLength(Integer.parseInt(System.console().readLine()));
		
		System.out.print("Enter breadth : ");
		setBreadth(Integer.parseInt(System.console().readLine()));
	}
	
	void showDimensions()
	{
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
	}
	
	float getArea(){return length * breadth;}
	float getPerimeter(){return 2 * (length + breadth);}
	
	void show()
	{
		super.show();
		showDimensions();
		System.out.println("Area : " + getArea());
		System.out.println("Perimeter : " + getPerimeter());
		System.out.println();
	}
	
}