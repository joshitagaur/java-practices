public class GCDemo
{
	public static void main(String args[])
	{
		final  int x;
		
		for (int i = 1; i <= 2000; i++)
		{
			Test t = new Test();			
			//System.gc();
		}
		x = 45;
		System.out.println("value of x : " + x);
		//x = 20;
	}	
}