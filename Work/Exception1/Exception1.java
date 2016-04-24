public class Exception1
{
	public static void main(String args[])
	{
		int num = 1;
		do
		{			
			System.out.print("Enter a number [0 to quit] : ");
			try
			{
				num = Integer.parseInt(System.console().readLine());
				if (num != 0)
					System.out.println("Its double is " + (num*2));
			}
			catch (NumberFormatException exp)
			{
				System.out.println("Invalid input...!!!Plz. Retry...");				
			}
			
		}while (num != 0);
	}
}

/*
What is exception ?
The error encountered while executing the byte code is called as Exception.
In other words the run time error is called as exception.

The class from which the concept of exception starts is Throwable class.
This is an abstract class
From this class, two classes have been derived
1. Exception
	Exception and its child classes are used to trap run time errors in the byte code.
	
2. Error.
	Error and its child classes are used to trap run time errors in jre.
	
		



					Object
					
					
					Throwable
					
					
		Exception				Error
		
		
		
From Exception has been derived another class called as RuntimException
From RuntimeException has been derived large no. of individual exception classes which are specialized to handle a specific type of exception.
ArrayIndexOutOfBoundsException
SQLException
NumberFormatException
IOException
InterruptedException


Exception handling in java is done using the following five keywords
try
catch
finally
throw
throws


try, catch and finally are the names of the blocks.

In the try block we write those statements that we want to monitor for exceptin generation.
The try block is either followed by catch block or by finally block or by both.
If both the blocks are present, then first comes the catch block.
Their can be multiple catch blocks following a single try block, but their can be at the most
only a single finally block that could follow a try block.


block
{
	statement_1;
	statement_2;
	...........;
	statement_n;
}

the prerequisite of the exception handling is that we should know before hand the different exceptions that are likely to occur
while performing the given task.

		
 **/