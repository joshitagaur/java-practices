class Prime
{
	public static void main(String args[])
	{
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i : num)
		{
			int temp = i;
			System.out.println("Checking " + temp + "....");
			if (temp <= 1)
				System.out.println("its not a prime number...");
			else if (temp >= 2 && temp <= 3)
				System.out.println("its a prime number...");
			else if (temp % 2 == 0)
				System.out.println("its not a prime number...");
			else
			{
				int limit = (int)Math.sqrt(temp);
				int divisor;
				for (divisor = 3; divisor <= limit; divisor += 2)
				{
					if (temp % divisor == 0)
						break;
				}
				if (divisor > limit)
					System.out.println("Its a prime number...");
				else
					System.out.println("its not a prime number...");
			}
			System.out.println();				
		}
	}
}