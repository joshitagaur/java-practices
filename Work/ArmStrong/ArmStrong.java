class ArmStrong
{
	public static void main(String args[])
	{
		int i, start, end, num;
		
		start = 1;
		end = 1000;
		
		for (i=start; i <= end; i++)
		{
			num = i;
			//determine the no of digits in the num
			int count = 0;
			while (num > 0)
			{
				num /= 10;
				count++;
			}
			
			num = i;
			int sum = 0;
			while (num > 0)
			{
				int lastDigit = num % 10;
				num /= 10;
				
				int result = 1;
				for (int j=1;j<=count;j++)
					result = result * lastDigit;
					
				sum += result;
			}
			
			if (sum == i)
				System.out.println("Armstrong Number : " + i);
		}
	}
}