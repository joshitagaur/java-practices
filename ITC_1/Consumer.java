class Consumer implements Runnable
{
	private Thread t;
	private Counter counter;
	
	Consumer(Counter counter)
	{
		this.counter = counter;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		int i;
		do
		{
			i = counter.getValue();
		} while (i < 50);		
	}
	
	
}