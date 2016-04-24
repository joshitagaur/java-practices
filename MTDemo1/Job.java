class Job extends Thread
{
	private String name;
	private int start, end;
	
	Job(String name, int start, int end)
	{
		this.name = name;
		this.start = start;
		this.end = end;
		
	}
	
	void doJob()
	{
		start();
	}
	
	public void run()
	{
		performTask();
	}
	
	private void performTask()
	{
		System.out.println("Job : " + name + " started...");
		for (int i = start; i <= end; i++)
			System.out.println(name + " : " + i);
		System.out.println("Job : " + name + " terminated...");
	}
}