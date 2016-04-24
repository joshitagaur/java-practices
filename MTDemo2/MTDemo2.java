class MTDemo2
{
	public static void main(String args[])
	{
		System.out.println("Main Thread Started....");
		Job j1, j2, j3, j4;
		
		j1 = new Job("A", 1, 30);
		j2 = new Job("B", 100, 130);
		j3 = new Job("C", 200, 230);
		j4 = new Job("D", 300, 330);
		
		j1.performJob();
		j2.performJob();
		j3.performJob();
		j4.performJob();
		
		try
		{
			j1.t.join();
			j2.t.join();
			j3.t.join();
			j4.t.join();
			
		}
		catch (InterruptedException exp)
		{
		}
		
		
		System.out.println("Main Thread Terminated....");
	}
}