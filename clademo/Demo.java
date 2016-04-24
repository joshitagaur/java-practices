public class Demo
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Following arguments were passed to the program...");
		for (i=0;i<args.length;i++)
			System.out.println("args[" + i + "] = " + args[i]);
	}
}