class ClassDemo
{
	public static void main(String args[])
	{
		Rectangle r1, r2, r3;
		r1 = new Rectangle();
		r1 = new Rectangle(70,50);	//we need to explicitly call a constructor to create an object.
		//r1.setLength(40);
		//r1.setBreadth(20);
		r1.showDimensions();
		
		r2 = new Rectangle();
		
		r3 = new Rectangle();
		r3.setLength(100);
		r3.setBreadth(60);
		
		
		//r1.showDimensions();
		r2.showDimensions();
		r3.showDimensions();
		
		
		
		
	}
}

/*
What is r ?
In java any variable whose data type is class, is called as reference variabled.
The size of reference variable is always 2 bytes and its default value is always null.
Threfore in the above example r is a reference variable.

in our example, the part of the memory where the reference variable r gets created is called as stack.

The part of the memory where the object gets created is called as Heap.


Rectangle r;
r = new Rectangle(50,20);

 **/