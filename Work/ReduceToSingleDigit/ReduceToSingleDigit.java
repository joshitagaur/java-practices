class ReduceToSingleDigit
{
	public static void main(String args[])
	{
		int num;
		int sum = 0;
		boolean flag = true;
		System.out.print("Enter first number : ");
		num = Integer.parseInt(System.console().readLine());
		do
		{
			while (num > 0)
			{
				int lastDigit = num % 10;
				num /= 10;
				sum += lastDigit;
			}
			
			System.out.println("The Sum is : " + sum);
			if (sum > 9)
			{
				num = sum;
				sum = 0;
			}				
			else
				flag = false;
		} while(flag);
	}
}