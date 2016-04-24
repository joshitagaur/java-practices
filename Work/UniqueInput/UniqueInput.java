class UniqueInput
{
	public static void main(String args[])
	{
		int num[], temp;
		int count;
		int i, j;
		boolean duplicate;
		
		System.out.print("How many numbers would you like to input : ");
		count = Integer.parseInt(System.console().readLine());
		
		if (count > 0)
		{
			num = new int[count];
			i = 0;
			do
			{
				System.out.print("Enter value #" + (i+1) + " : ");
				temp = Integer.parseInt(System.console().readLine());
				duplicate = false;
				for (j=0;j<i;j++)
				{
					if (num[j] == temp)
					{
						duplicate = true;
						break;
					}
				}
				
				if (duplicate)
					System.out.println("The value " + temp + " has already been entered...\n");
				else
				{
					num[i] = temp;
					i++;
				}					
			} while (i < count);
			
			
			System.out.println("You entered the following values...");
			for (i = 0; i < num.length; i++)
				System.out.println(num[i]);
		}
		
	}
}