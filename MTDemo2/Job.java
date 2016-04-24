class Job implements Runnable
{
	private String name;
	private int start;
	private int stop;
	
	Thread t;
	
	Job(String name, int start, int stop)
	{
		this.name = name;
		this.start = start;
		this.stop = stop;
	}
	
	void performJob()
	{
		t = new Thread(this);		//the constructor of the thread class accepts an object of such a class which had implemented the Runnable interface.
		t.start();
	}
	
	public void run()
	{
		System.out.println(name + " started...");
		for (int i = start; i <= stop; i++)
			System.out.println(name + " : " + i);
		System.out.println(name + " terminated...");		
	}
}