class Counter
{
	private int value;
	private boolean valueAvailable;
	Counter()
	{
		value = 0;
		valueAvailable = false;
	}
	
	/*
	synchronized void setValue(int value)
	{
		this.value = value;
		System.out.println("Value Produced : " + value);
	}
	
	synchronized  int getValue()
	{
		System.out.println("Value Consumed : " + value);
		return value;
	}
	*/
	
	synchronized void setValue(int value)
	{
		try
		{
			if (valueAvailable)
				wait();
			this.value = value;
			System.out.println("Value Produced : " + value);
			valueAvailable = true;
			notify();
		}
		catch (InterruptedException exp){}
	}
	
	synchronized int getValue()
	{
		try
		{
			if (!valueAvailable)
				wait();
			System.out.println("Value Consumed : " + value);
			valueAvailable = false;
			notify();
		}
		catch (InterruptedException exp){}
		return value;
			
	}
}