class CustomException
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.setName("BC");
		e.show();
		try
		{
			e.setAge(125);
			e.show();
		}
		catch (InvalidAgeException exp)
		{
			System.out.println(exp);
		}
	}
}