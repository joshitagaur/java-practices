class GCDemo
{
	public static void main(String args[])
	{
		Test t;
		int i;
		for (i=1;i<=50;i++)
		{
			t = new Test("object" + i, 5000);
			System.gc();
		}
				
	}
}


class Test
{
	private long num[];
	private String objectName;
			
	Test(String objectName, int elementCount)
	{
		this.objectName = objectName;
		num = new long[elementCount];
		System.out.println("Object Created : " + objectName);
	}	
		
	protected void finalize()
	{
		System.out.println(objectName + " Deallocated...");
	}
}

/*

Their is component of JRE called as garbage collector.


 **/