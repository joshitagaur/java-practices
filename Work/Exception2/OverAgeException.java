 class OverAgeException extends Exception
 {
 	private String errMsg;
 	
 	OverAgeException()
 	{
 		errMsg = "Over age...";
 	}
 	
 	OverAgeException(String errMsg)
 	{
 		this.errMsg = errMsg;
 	}
 	
 	public String toString()
 	{
 		return errMsg;
 	}
 }