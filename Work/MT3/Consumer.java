class Consumer implements Runnable
{
	private Counter counter;
	private Thread t;
	Consumer(Counter counter)
	{
		this.counter = counter;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		int value = 0;
		do
		{
			value = counter.getValue();
		} while (value < 50);
	}		
}