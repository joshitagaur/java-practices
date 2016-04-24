class Printer
{
	synchronized public void print(String matter)
	{
		System.out.print("[" + matter);
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException exp){}
		System.out.println("]");
	}
}