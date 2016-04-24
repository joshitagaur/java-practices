/*
class Job extends Thread
{
	private String name;
	private int start;
	private int end;
	
	Job(String name, int start, int end)
	{
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	void performJob()
	{
		start();
	}
	
	public void run()
	{
		doJob();
	}
	
	private void doJob()
	{
		System.out.println("Job " + name + " started...");
		for (int i = start; i <= end; i++)
			System.out.println(name + " : " + i);
		System.out.println("Job " + name + " terminated...");
	}
}
*/

class Job implements Runnable
{
	private String name;
	private int start;
	private int end;
	Thread t;
	
	Job(String name, int start, int end)
	{
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	void performJob()
	{
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		doJob();
	}
	
	private void doJob()
	{
		System.out.println("Job " + name + " started...");
		for (int i = start; i <= end; i++)
			System.out.println(name + " : " + i);
		System.out.println("Job " + name + " terminated...");
	}
}