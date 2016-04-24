import java.util.Random;
class MaxMinArray
{
	public static void main(String args[])
	{
		int num[],i, max, min;
		int count;
		String choice;
		
		
		System.out.print("How many numbers would you like to input : ");
		count = Integer.parseInt(System.console().readLine());
		
		System.out.print("Would you like to auto generate the input [y/n] : ");
		choice = System.console().readLine();
		
		num = new int[count];
		
		if (choice.equals("Y") || choice.equals("y"))
		{
			Random r = new Random();
			for (i = 0; i < count; i++)
				num[i] = 10 + r.nextInt(90);
		}
		else
		{
			for (i = 0; i < count; i++)
			{
				System.out.print("Enter value #" + (i+1) + " : ");
				num[i] = Integer.parseInt(System.console().readLine());
			}
		}
		
		
		System.out.println("The array contains...");
		max = min = num[0];
		for (i = 0; i < count; i++)
		{
			System.out.println(num[i]);
			if (max < num[i])
				max = num[i];
			else if (min > num[i])
				min = num[i];
		}
			
			
		System.out.println("Maximum Value : " + max);
		System.out.println("Minimum Value : " + min);
	}
}