class Rectangle
{
	private int length;
	private int breadth;
	
	Rectangle()
	{
		length = 60;
		breadth = 30;
	}
	
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	void setLength(int length)
	{
		this.length = length;
	}
	
	int getLength(){return length;}
	
	void setBreadth(int breadth)
	{
		this.breadth = breadth;
	}
	
	int getBreadth(){return breadth;}
	
	
	void setDimensions(int length, int breadth)
	{
		setLength(length);
		setBreadth(breadth);
	}
	
	void show()
	{
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
	}	
		
	void inputDimensions()
	{
		System.out.print("Enter length : ");
		length = Integer.parseInt(System.console().readLine());
		
		System.out.print("Enter breadth : ");
		breadth = Integer.parseInt(System.console().readLine());
	}
	
	public String toString()
	{
		return "Rectangle [" + length + "x" + breadth + "]";
	}
}