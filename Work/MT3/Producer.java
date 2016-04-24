class Producer extends Thread
{
	private Counter counter;
	
	Producer(Counter counter)
	{
		this.counter = counter;
		start();
	}
	
	public void run()
	{
		for (int i = 1; i <=50; i++)
		{
			counter.setValue(i);
		}
	}		
}