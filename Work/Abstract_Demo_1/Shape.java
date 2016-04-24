abstract class Shape
{
	private String name;
	
	Shape()
	{
		name = "undefined";
	}
	
	Shape(String name)
	{
		this.name= name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName(){return name;}
	
	abstract void inputDimensions();
	abstract float getArea();
	abstract float getPerimeter();
	void show()
	{
		System.out.println("Shape : " + name);
	}
	
}