class MTDemo1
{
	public static void main (String args[])
	{
		System.out.println("Main Started....");
		
		Job j1, j2, j3, j4;
		
		j1 = new Job("A",1,30);
		j2 = new Job("B",100,130);
		j3 = new Job("C",200,230);
		j4 = new Job("D",300,330);
		
		j1.doJob();
		j2.doJob();
		j3.doJob();
		j4.doJob();
		
		/*
		while (j1.isAlive() || j2.isAlive() || j3.isAlive() || j4.isAlive())
		{
			System.out.println("In the main thread...");
		}
		*/
		
		try
		{
			j1.join();
			j2.join();
			j3.join();
			j4.join();
		}
		catch (InterruptedException exp){}
		
		System.out.println("Main Terminated...");
	}
}