class Counter
{
	private int value;
	private boolean valueAvailable;
	
	Counter()
	{
		valueAvailable = false;
	}
	
	synchronized void setValue(int value)
	{
		try
		{
			if (valueAvailable)	
				wait();
			this.value = value;
			valueAvailable = true;
			System.out.println("Value Produced : " + value);
			notify();
		}
		catch (InterruptedException exp)
		{
		}				
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
		catch (InterruptedException exp)
		{
		}
		
		return value;
	}
}