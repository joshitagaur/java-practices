public class Exception2
{
	public static void main(String args[]) throws UnderAgeException, OverAgeException
	{
		Employee e;
		e = new Employee();
		e.setName("ABC");
		
		/*
		int age;
		boolean flag = true;
		do
		{
			try
			{
				System.out.print("Enter age : ");
				age = Integer.parseInt(System.console().readLine());
				e.setAge(age);
				flag = false;
			}
			catch (InvalidAgeException exp)
			{
				flag= true;
			}
		} while (flag);					
		*/
		
		/*		
		try
		{
			e.setAge(10);
		}
		
		catch (UnderAgeException exp){System.out.println(exp);}		
		//catch (OverAgeException exp){System.out.println(exp);}		
		catch (Exception exp){System.out.println(exp);}
		*/
		
		e.setAge(10);
		e.show();
	}
}