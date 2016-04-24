class InvalidAgeException extends Exception
{
	private String errMsg;
	
	InvalidAgeException()
	{
		errMsg = "Invalid Age...";
	}
	
	InvalidAgeException(String errMsg)
	{
		this.errMsg = errMsg;
	}
	
	public String toString()
	{
		return errMsg;
	}
}


/*

Creating a custom exception is a four step proces...
1. Create a class which extends the inbuilt class Exception.
2. In this class create a private data member of String data type say errMsg
3. Provide two constructors for the class.
	3a. Default constructor
		in this constructor assign some default error message to the variable created in step no. 2
		
	3b. Overloaded constructor
		Make this constructor accept a single parameter of String data type. Assign the value of this parameter to the variable created in step no. 2.
		
4. Override the toString() method. In this method return the value of the variable created in step no. 2.
	(the toString() method is defined in the Object class, and any class directly or indirectly inherits from the Object class,
	thus every class has got toString method. When an object is directly printed, then that objects toString method is called.)


*/