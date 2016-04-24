/*
Creating an Exception class is a four step process
1. Create a class which extends the class Exception
2. In this class create a private data member of String data type say errMsg
3. Provide two constructors for the class
	3a. default constructor
		In this constructor assign some default error message to the variable created in step no. 2
	3b. Overloaded constructor
		Make this constructor accept a single parameter of String data type. Assign the value of this parameter
		to the variable created in step no. 2.
4. Override the toString method
	In the method return the value of the variable created in step no. 2
 **/
 
 class InvalidAgeException extends Exception
 {
 	private String errMsg;
 	
 	InvalidAgeException()
 	{
 		errMsg = "Invalid age...";
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