class Job implements Runnable
{
	private Printer printer;
	private String matter;
	private Thread t;
	
	Job(String matter, Printer printer)
	{
		this.matter = matter;
		this.printer = printer;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		synchronized(printer) 
		{
			printer.print(matter);
		}		
	}
	

}