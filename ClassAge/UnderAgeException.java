class UnderAgeException extends Exception
{
	private String errMsg;
	
	UnderAgeException()
	{
		errMsg="Under age...";
		
	}
	UnderAgeException(String errMsg)
	{
		this.errMsg=errMsg;
	}
	
    public	String toString()
	{
		return errMsg;
	}
}