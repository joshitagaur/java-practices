class SumDigits
{
	public static void main(String args[])
	{
		int num, temp;
		System.out.print("Enter a number : ");
		num = Integer.parseInt(System.console().readLine());
		int sum = 0;
		int reverse = 0;
		temp = num;
		while (num > 0)
		{
			int lastDigit = num % 10;
			num /= 10;
			sum += lastDigit;
			reverse = reverse * 10 + lastDigit;
		}
		
		System.out.println("Sum Of Digits : " + sum);
		System.out.println("Reversed : " + reverse);
		if (reverse == temp)
			System.out.println("its a palindrome..");
	}
}