class LCM
{
	public static void main(String args[])
	{
		int n1, n2, start, end, i;
		
		System.out.print("Enter first number : ");
		n1 = Integer.parseInt(System.console().readLine());
		
		
		System.out.print("Enter second number : ");
		n2 = Integer.parseInt(System.console().readLine());
		
		start = n1 > n2 ? n1 : n2;
		end = n1 * n2;
		
		for (i = start; i <= end; i++)
		{
			if (i % n1 == 0 && i % n2 == 0)
				break;
		}
		
		System.out.println("The LCM of " + n1 + " and " + n2 + " is " + i);
	}
}