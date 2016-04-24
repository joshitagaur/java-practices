class SumSingle
{
	public static void main(String args[])
	{
		//*my method
	
	int num=0;
	int sum=0;
	int temp=0;
	int temp2=0;
	
	System.out.println("Enter a no");
	num=Integer.parseInt(System.console().readLine());
	
	while(num>0)
	{
		int last=num%10;
		num/=10;
		sum+=last;
	}
	System.out.println("Sum is"+sum);
	if(sum>10)
	{
		while(sum>0)
		{
			temp=sum%10;
			sum/=10;
			temp2+=temp;
		}
		System.out.println("Sum is"+temp2);
	}
	}
}