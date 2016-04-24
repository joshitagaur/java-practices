import java.util.Random;

class Max_Min_Array
{
	int num[],i, max, min;
	int count;
	String choice;
	
	
	System.out.println("How many numbers would you like to input : ");
	count = Integer.parseInt(System.console().readLine());
	
	System.out.print("Would you like to auto generate the input [y/n] : ");
	choice = System.console().readLine();
	
	num = new int[count];
	
	if (choice.equals("Y") || choice.equals("y))
	{
		Random r = new Random();
		for (i = 0; i < count; i++)
			num[i] = 10 + r.nextInt(90);
	}
	
}