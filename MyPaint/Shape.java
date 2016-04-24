import java.awt.*;


abstract class Shape
{
	private String name;
	private Color color;
	
	Shape()
	{
		name = "undefined";
		color=Color.BLACK;
	}
	
	Shape(String name)
	{
		this.name = name;
		color=Color.BLACK;
	}
	
	Shape(Color color)
	{
		name = "undefined";
		this.color = color;
	}
	
	Shape(String name, Color color)
	{
		this.name  = name;
		this.color = color;		
	}
	
	
	void setName(String name)
	{
		this.name = name;
	}
	
	void setColor(Color color)
	{
		this.color = color;
	}
	
	
	String getName(){return name;}
	Color getColor(){return color;}
	
	abstract void draw(Graphics g);
}