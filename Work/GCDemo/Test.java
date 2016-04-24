class Test
{
	private long num[];
	private int objectNo;
	private static int ono;
	
	static
	{
		ono = 1;
	}
		
	
	Test()
	{
		num = new long[5000];
		objectNo = ono;
		ono++;
		System.out.println("Object No. is : " + objectNo);
	}		
		
	protected void finalize()
	{
		System.out.println("Deallocating object no : " + objectNo);
	}
}