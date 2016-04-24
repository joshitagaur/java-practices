class AD1
{
	public static void main(String args[])
	{
		//int[] num, i;
		
		int num[], i, max, min;		
		num = new int[10];
		
		//int num[] = {12,324,456,67,56,23,23,56,78,67,32,123,34,56,67,45,21,213,34,76,768,562,3};
		//int i;
		
		System.out.println("Total no. of elements : " + num.length);
		for (i=0;i<num.length;i++)
			System.out.println("num[" + i + "] = " + num[i]);
			
			
		for (i=0;i<num.length;i++)
		{
			System.out.print("Enter value #" + (i+1) +  " : ");
			num[i] = Integer.parseInt(System.console().readLine());
		}
		
		
		max = min = num[0];
		System.out.println("You entered the following values...");
		for (i=0;i<num.length;i++)
		{
			System.out.println("num[" + i + "] = " + num[i]);
			if (max < num[i])
				max = num[i];
			else if (min > num[i])
				min = num[i];
		}
		
		System.out.println("Maximum value is : " + max);
		System.out.println("Minimum value is : " + min);
		
	}
}