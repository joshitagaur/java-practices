class Circle extends Shape
{
	private float radius;
	
	
	Circle()
	{
		super("Circle");
	}
	
	Circle(float radius)
	{
		super("Circle");
		setRadius(radius);
	}
	
	void setRadius(float radius)
	{
		if (radius < 0)
			this.radius = -1;
		else
			this.radius = radius;
	}
	
	float getRadius(){return radius;}
	
	void inputDimensions()
	{
		System.out.print("Enter radius : ");
		setRadius(Float.parseFloat(System.console().readLine()));
	}
	
	void showDimensions()
	{
		System.out.println("Radius : " + radius);
	}
	
	float getArea()
	{
		return (float)(Math.PI * radius * radius);
	}
	
	float getPerimeter()
	{
		return (float)(2 * Math.PI * radius);
	}
	
	void show()
	{
		super.show();
		showDimensions();
		System.out.println("Area : " + getArea());
		System.out.println("Circumference : " + getPerimeter());
		System.out.println();
	}
}