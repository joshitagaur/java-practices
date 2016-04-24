class InputDemo
{
	public static void main(String args[])
	{
		int n1, n2, n3;
		String str;
		
		System.out.print("Enter first number : ");
		str = System.console().readLine();
		n1 = Integer.parseInt(str);
		
		System.out.print("Enter second number : ");
		n2 = Integer.parseInt(System.console().readLine());
		
		n3 = n1 + n2;
		
		System.out.println("The sum of " + n1 + " and " + n2 + " is " + n3);				
	}
}