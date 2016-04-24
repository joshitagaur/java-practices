class Array_Demo_1
{
	public static void main(String args[])
	{
		//int[] num, i;
		
		//int num[], i;
		int num[] = {23,45,67,45,32,34,56,76,6,34,23,34,56,67,56,23,123,543,567,56,34,23,34,56,674,5};
		int i;
		int count;
		/*
		System.out.println("How many numbers would you like to input : ");
		count = Integer.parseInt(System.console().readLine());				
		num = new int[count];
		*/
		System.out.println("The no. of elements in num is : " + num.length);
		for (i = 0; i < num.length; i++)
			System.out.println("num[" + i + "] : " + num[i]);
			
			
					 				
	}
}

/*
Java supports only dynamic arrays. IT NEVER SUPPORTS STATIC ARRAY.
 **/