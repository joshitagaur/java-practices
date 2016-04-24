class ExceptionHandling
{
	public static void main(String args[])
	{
		float n1, n2, n3;
		
		try
		{
			System.out.print("Enter first number : ");
			n1 = Float.parseFloat(System.console().readLine());
			
			System.out.print("Enter second number : ");
			n2 = Float.parseFloat(System.console().readLine());
			
			n3 = n1 + n2;
			System.out.println("Sum of " + n1 + " and " + n2 + " is " + n3);
		}
		catch (NumberFormatException exp)
		{
			System.out.println("Don't You Know What Is A Number ?");
		}
	}
}

/*
What is Exception ?
Run time error in java program is called as Exception.
Addressing the run time error is called as Exception Handling.


The concept of exception and exception handling arise in a class called as Throwable.
This an abstract class which extends Object class.
From this class have been derived two classes
1. Exception
	The Exception and its child classes are used to handle runtime errors that occur in the byte code.
	
2. Error
	The Error and its child classes are used to handle runtime errors that may occur in the jre.



						Object
						
						
						Throwable (abstract class)
						
						
		Exception							Error

			
			
		RuntimeException
		
			SqlException
			IOException
			ClassNotFoundException
			NumberFormatException
			ArrayIndexOutOfBoundsException
			StringIndexOutOfBoundsException
			.........
			..........
			
			
	In java exception handling is done using the following five keywords		
	try
	catch
	finally
	throw
	throws			

 **/