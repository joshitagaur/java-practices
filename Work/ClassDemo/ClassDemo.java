class ClassDemo
{
	public static void main(String args[])
	{
		Rectangle r;			//here r is called as reference variable.
								//current value in r is null.
								
								
		r = new Rectangle(5,3);	//now an object gets created in heap and its address get assigned to r.
		r.show();
		
		r.inputDimensions();
		r.show();
		
		System.out.println(r);				
	}
}