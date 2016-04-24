import java.awt.*;

class Line extends Shape
{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	Line(int x1, int y1, int x2, int y2, Color color)
	{
		super("line",color);
		this.x1 = x1;
		this.y1 = y1;
		
		this.x2 = x2;		
		this.y2 = y2;
	}
	
	void draw(Graphics g)
	{
		Color color = g.getColor();
		g.setColor(getColor());
		g.drawLine(x1,y1,x2,y2);
		g.setColor(color);
	}
}