import java.awt.*;

class Rectangle extends Shape
{
	private int x;
	private int y;
	private int width;
	private int height;
	
	Rectangle(int x, int y, int width, int height, Color color)
	{
		super("Rectangle", color);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(getColor());
		g.drawRect(x, y, width, height);
	}
}
