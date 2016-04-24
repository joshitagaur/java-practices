class SumSingleDigit
{
	public static void main(String args[])
	{
		int num;
		boolean flag=true;
		int sum=0;
		System.out.println("Enter a no");
		num=Integer.parseInt(System.console().readLine());
		
		do{
			while(num>0)
			{
			
			int last=num%10;
			num/=num;
			sum+=sum;
			}
			System.out.println("Sum is"+sum);
			
			if(sum>9)
			{
			
				num=sum;
				sum=0;
				System.out.println("Sum is"+sum);
			
			}
			else
			{
			
				flag=false;
			}	
					
		}while(flag);
	}
}