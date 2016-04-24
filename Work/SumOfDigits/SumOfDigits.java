public class SumOfDigits
{
	public static void main(String args[])
	{
		int num;
		int sum = 0;
		int reverse = 0;
		
		System.out.print("Enter a number : ");
		num = Integer.parseInt(System.console().readLine());
		while (num > 0)
		{
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num /= 10;
			sum += lastDigit;
		}
		System.out.println("Sum of digits : " + sum);
		System.out.println("Reverse is : " + reverse);
		System.out.println();
	}
}