public class Sum
{
	public static void main(String args[])
	{
		float s = 0;
		for (int i = 0; i < args.length; i++)
		{
			try
			{
				s += Float.parseFloat(args[i]);
			}
			catch (NumberFormatException exp)
			{
				System.out.println("Ignoring bad input " + args[i] + "....");
			}
		}
		System.out.println("The sum is : " + s);
	}
}