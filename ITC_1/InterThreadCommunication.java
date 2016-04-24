class ITC
{
	public static void main(String args[])
	{
		Counter counter = new Counter();
		Producer p = new Producer(counter);
		Consumer c = new Consumer(counter);
	}
}