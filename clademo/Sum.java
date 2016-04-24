import java.sql.*;
public class Sum
{
	public static void main(String args[])
	{
		float s = 0;
		int i;
		for (i=0;i<=args.length;i++)
		{
			try
			{
				float temp = Float.parseFloat(args[i]);
				s += temp;
			}
			catch(NumberFormatException exp)
			{
				System.out.println("Ignoring invalid input - " + args[i] + "....");
			}
			catch (ArrayIndexOutOfBoundsException exp)
			{
			}
			/*
			catch (SQLException exp)
			{
			}
			*/
		}

		System.out.println("The sum of numbers is : " + s);
	}
}