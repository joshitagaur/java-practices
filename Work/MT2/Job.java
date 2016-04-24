class Job extends Thread
{
	private Printer printer;
	private String matter;
	
	Job(String matter, Printer printer)
	{
		this.printer = printer;
		this.matter = matter;
		start();
	}
	
	public void run()
	{
		synchronized (printer)
		{
			printer.print(matter);
		}		
	}
}