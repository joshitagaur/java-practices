class TitleCase
{
	public static void main(String args[])
	{
		String str, result = "";
		int position;
		
		System.out.print("Enter a string : ");
		str = System.console().readLine();
		
		str = str.trim();
		
		do
		{
			position = str.indexOf(" ");
			if (position != -1)
			{
				String temp = str.substring(0,position);
				result = result + temp.substring(0,1).toUpperCase() + temp.substring(1).toLowerCase() + " ";
				str = str.substring(position).trim();
			}			
		}while (position != -1);

		String temp = str;
		result = result + temp.substring(0,1).toUpperCase() + temp.substring(1).toLowerCase();

		System.out.println(result);						
	}
}

/*
 
 "    this     is    some    sample     string    "
 "this     is    some    sample     string"
 
 
 ---
 	position = 4
 	temp = "this"
 	result= "" + "This" + " ";
 	str = "is    some    sample     string"
 ---
 
 
 */