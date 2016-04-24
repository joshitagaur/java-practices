class InheritDemo1
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		//r.setDimensions(50,30);
		r.inputDimensions(); 
		r.showDimensions();
		System.out.println(r);
		
		Box b = new Box();
		b.inputDimensions();
		b.showDimensions();
		System.out.println(b);
	}
}