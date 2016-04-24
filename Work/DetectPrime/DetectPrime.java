public class DetectPrime
{
	public static void main(String args[])
	{
		int num;
		System.out.print("Enter number to check : ");
		num = Integer.parseInt(System.console().readLine());
		
		if (num <= 1)
			System.out.println("Not a prime number...");
		else if (num >= 2 && num <= 3)
			System.out.println("Its a prime number...");
		else if (num % 2 == 0)
			System.out.println("Not a prime number...");
		else
		{
			int limit = (int)Math.sqrt(num);
			int divisor;
			for (divisor = 3; divisor <= limit; divisor += 2)
			{
				if (num % divisor == 0)
					break;
			}
			
			if (divisor > limit)
				System.out.println("Its a prime number...");
			else
				System.out.println("Its not a prime number...");
			
		}
	}
}