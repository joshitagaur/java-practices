class Rectangle extends Shape
{
	private int length;
	private int breadth;
	
	Rectangle()
	{
		super("Rectangle");
		length = 60;
		breadth = 30;
	}
	
	Rectangle(int length, int breadth)
	{
		super("Rectangle");
		setLength(length);
		setBreadth(breadth);
	}
	
	void setLength(int length)
	{
		if (length >= 0)
			this.length = length;
	}
	
	void setBreadth(int breadth)
	{
		if (breadth >= 0)
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
	
	float getArea(){return length * breadth;}
	float getPerimeter(){return 2 * (length + breadth);}
	
	void show()
	{
		super.show();
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
	}
}
