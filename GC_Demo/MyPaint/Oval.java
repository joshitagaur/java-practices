import java.awt.*;

class Oval extends Shape
{
	private int x;
	private int y;
	private int width;
	private int height;
	
	
	Oval(int x, int y, int width, int height, Color color)
	{
		super("Oval", color);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(getColor());
		g.drawOval(x, y, width, height);
		//g.fillOval(x, y, width, height);
	}
}
