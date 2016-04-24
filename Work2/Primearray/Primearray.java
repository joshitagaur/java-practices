class Primearray
{
	public static void main(String args[])
	{
		int num[];
		int count;
		int i,j,k;
		
		
		System.out.print("How many numbers would you like to input : ");
		count = Integer.parseInt(System.console().readLine());
		
		if (count > 0)
		{
			num = new int[count];
			for(j=0;j<num.length;j++)
			{
				System.out.println("Enter no #"+(j+1));
				num[j]=Integer.parseInt(System.console().readLine());
			}
			for(i = 0;i<num.length;i++)
			{
				if(num[i]==2)
				System.out.println("Prime no is"+num[i]);
				
				else if(num[i]==3)
				System.out.println("Prime no is"+num[i]);
				
				
				else if (num[i]%2==0)
				for(k=0;k<num.length;k++)
				{
				   break;
				}
						
				else
						{
							int divisor;
							int limit=(int)Math.sqrt(num[i]);
							for(divisor=3;divisor<=limit;divisor=+2)
							{
								if(num[i]%divisor==0)
									break;
							}
							if(divisor>limit)
							System.out.println("Prime no is"+num[i]);
									
						}
			}
		}
	}
}		