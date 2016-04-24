class Exponent
{
	public static void main(String args[])
	{
		int num,num2;
		int i;
		int j;
		
		System.out.println("Enter a no");
		num=Integer.parseInt(System.console().readLine());
		
		System.out.println("Enter 2nd no");
		num2=Integer.parseInt(System.console().readLine());
		j=1;
		for(i=1;i<=num2;i++)
		
		{
		
			j=num*j;
		}
		System.out.println("Value is"+j);
	}
}