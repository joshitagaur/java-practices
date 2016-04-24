class Box
{
	private int length;
	private int breadth;
	private int depth;
	
	Box()
	{
		length=breadth=depth=-1;
	}
	
	void getLength(int len)
	{
		if (len<0)
		{
			length=-1;
		}
		else
		length=len;
	}
	void getBreadth(int bre)
	{
		if(bre<0)
		{
			breadth=-1;
		}
		else
		breadth=bre;
	}
	void getDepth(int dep)
	{
		if(dep<0)
		{
			depth=-1;
		}
		depth=dep;
	}
	int getLength()
	{
		return length;
	}
	int getBreadth()
	{
		return breadth;
	}
	int getDepth()
	{
		return depth;
	}
	
	void show()
	{
		System.out.println("Length is: "+getLength());
		System.out.println("breadth is: "+getBreadth());
		System.out.println("Depth is: "+getDepth());
	}
	
	void inputDimensions(int length,int breadth,int depth)
	{
		System.out.println("Enter Length: "+length);
		System.out.println("Enter Breadth: "+breadth);
		System.out.println("Enter depth: "+depth);
	}
}