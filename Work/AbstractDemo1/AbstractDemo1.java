public class AbstractDemo1
{
	public static void main(String args[])
	{
		Shape s;
		//s = new Shape();
		
		Rectangle r = new Rectangle();
		r.inputDimensions();
		r.show();
		
		
		Circle c = new Circle();
		c.inputDimensions();
		c.show();
		
		s = r;
		s.show();
		
		s = c;
		s.show();
	}
}