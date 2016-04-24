public class EBill
{
	public static void main(String args[])
	{
		int units;
		float bill;
		float s1 = 300;
		float s2 = 500 * 0.8f;
		float s3 = 500 * 0.6f;
		float s4 = 500 * 0.4f;
		
		System.out.print("Enter no. of units consumed : ");
		units = Integer.parseInt(System.console().readLine());
		
		if (units <= 500)
			bill = 300;
		else if (units <= 1000)
			bill = s1 + (units-500) * 0.8f;
		else if (units <= 1500)
			bill = s1 + s2 + (units-1000) * 0.6f;
		else if (units <= 2000)
			bill = s1 + s2 + s3 + (units - 1500) * 0.4f;
		else 
			bill = s1 + s2 + s3 + s4 + (units - 2000) * 0.25f;
			
		System.out.println("Amount Payable : " + bill);
		
		
	}
}