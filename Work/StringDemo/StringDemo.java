public class StringDemo
{
	public static void main(String args[])
	{
		String s1 = "This is some sample string";
		String s2 = new String("This is some sample string");
		
		char aChar[] = {'a','b','c','d','e'};
		String s3 = new String(aChar);
		
		byte aByte[] = {65,66,67,68,69,70};
		String s4 = new String(aByte);
		
		String s5 = "This is some sample string";
		
		
		System.out.println(s1.length());
			
						
		if (s1 == s2)
			System.out.println("Same...");
		else
			System.out.println("Not Same...");
			
		if (s1 == s5)
			System.out.println("Same...");
		else
			System.out.println("Not Same...");
			
			
		if (s1.equals(s2))
			System.out.println("Same...");
		else
			System.out.println("Not Same...");
			
		s2 = new String("this is some sample string");
		
		if (s1.equals(s2))
			System.out.println("Same...");
		else
			System.out.println("Not Same...");
			
		if (s1.equalsIgnoreCase(s2))
			System.out.println("Same...");
		else
			System.out.println("Not Same...");
			
			
		aChar = s1.toCharArray();
		for(char c : aChar)	
			System.out.println(c);
			
			
		aByte = s1.getBytes();
		for (byte b : aByte)
			System.out.println(b);
			
			
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		
		
		System.out.println(s1.contains("amp"));
		System.out.println(s1.contains("Amp"));
		
		System.out.println(s1.indexOf("Amp"));
		
		
		System.out.println(s1.indexOf("is"));
		System.out.println(s1.indexOf("is",3));
		
		
		int index = -1;
		do
		{
			index = s1.indexOf("is",index+1);
			if (index != -1)
				System.out.println("is found at : " + index);
		} while (index != -1);
		
		
		System.out.println(s1.lastIndexOf("is"));
		System.out.println(s1.lastIndexOf("is",4));
		
		System.out.println(s1.charAt(3));
		
		s1 = "    this    is   some    sample    string    ";
		System.out.println("[" + s1 + "]");
		System.out.println("[" + s1.trim() + "]");
		
		
		s1 = "this is some sample string";
		System.out.println(s1.replace("is","ISSSSSSSSSS"));			
	}
}

/*
The most important characteristic of the java String is that it is immutable..
Once a string gets constructed in the memory, its not possible to makey any changes into it.
 **/