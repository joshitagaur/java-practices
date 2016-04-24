class ReverseDiff
{
	public static void main(String args[])
	{
		int num=0;
		int last;
		int reverse=0;
		int diff;
		int temp;
		
		System.out.println("Enter a no");
		num=Integer.parseInt(System.console().readLine());
		temp=num;
		while(num>0)
		{
		
		last=num%10;
		reverse=reverse*10+last;
		num/=10;
		
		}
		
		System.out.println("Reverse is"+reverse);
		if(reverse>temp)
		{
			System.out.println("diff is"+(reverse-temp));
		}
	    else
	    {
	    	System.out.println("Diff is"+(temp-reverse));
	    }
	}
	
	
}