class SyncDemo1
{
	public static void main(String args[])
	{
		Printer printer = new Printer();
		
		Job j1 = new Job("Java", printer);
		Job j2 = new Job("Programming", printer);
		Job j3 = new Job("Language", printer);
	}
}