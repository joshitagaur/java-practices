class ClassAge
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setName("Joshita");
		try
		{
			e.setAge(45);
			e.show();
			
		}
		catch(UnderAgeException u)
		{
			System.out.println(u);
		}
		catch(OverAgeException o)
		{
			System.out.println(o);
		}
	}
}