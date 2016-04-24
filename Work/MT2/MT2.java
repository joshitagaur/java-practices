public class MT2
{	
	public static void main(String args[])
	{
		Printer p = new Printer();
		Job j1 = new Job("Java",p);
		Job j2 = new Job("Programming",p);
		Job j3 = new Job("Language",p);
	}
}