class DigitSum
{
	public static void main (String args[])
	{
	
		int num;
		int sum=0;
		
		System.out.print("Enter a no:");
		num=Integer.parseInt(System.console().readLine());
		
		while(num>0)
		{
		
		int last=num%10;
		num=num/10;
		sum+=last;
		}
		System.out.println("sum is:"+sum);
	}
}
