class MyAddress
{
	public static void main(String args[])
	{
		String str;
		System.out.print("Enter your name : ");
		str = System.console().readLine();
		
		System.out.println("Welcome - " + str + " To the World Of Java Programming");
		
		System.out.println("Jawahar Sharma");
		System.out.println("338, Pritiviraj Nagar");
		System.out.println("Bhagwan Gunj UIT Colony");
		System.out.println("Ajmer - Rajasthan");
		System.out.println("PIN - 305001");
	}
}

/*
System.console().readLine() is the method to be used for inputting any value from the user through keyboard in char base applications.
The data type of input taken using System.console().readLine() is always String.
If you enter any numeric values, then they need to be type casted to the desired data type.
 **/