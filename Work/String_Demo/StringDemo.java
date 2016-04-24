class StringDemo
{
	public static void main(String args[])
	{
		String s1 = "This is some sample string";
		String s2 = new String("This is some sample string");				
		
		char aChar[] = {'a','b','c','d','e'};
		String s3 = new String(aChar);
		
		byte aByte[] = {65,66,67,68,69};
		String s4 = new String(aByte);
		
		String s5 = "This is some sample string";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		
		
		System.out.println(s1.charAt(5));
		
		aChar = s1.toCharArray();
		for (int i = 0; i < aChar.length; i++)
			System.out.println(aChar[i]);
			
		aByte = s1.getBytes();
		for (int i = 0; i < aChar.length; i++)
			System.out.println(aByte[i]);
			
			
		if (s1.equals(s2))
			System.out.println("Contents are same");
		else
			System.out.println("Contents are not same");
						
		s2 = s2.toUpperCase();
		
		if (s1.equalsIgnoreCase(s2))
			System.out.println("Contents are same");
		else
			System.out.println("Contents are not same");
			
		s2 = new String("This is some sample string");
			
		if (s1 == s2)			
			System.out.println("Same");
		else
			System.out.println("Not Same");
			
			
		if (s1 == s5)			
			System.out.println("Same");
		else
			System.out.println("Not Same");
			
		
		System.out.println(s1.contains("amp"));
		
		System.out.println(s1.indexOf("is"));
		System.out.println(s1.indexOf("is",3));
		
		
		System.out.println(s1.lastIndexOf("is"));
		System.out.println(s1.lastIndexOf("is",4));
		
		
		System.out.println(s1.replace("is","ISSSSSSSSSSSSS"));
		
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,12));
		
		s5 = "    this    is    some    sample     string    ";
		System.out.println("[" + s5 + "]");
		System.out.println("[" + s5.trim() + "]");
			
		System.out.println(s1.startsWith("This"));
		System.out.println(s1.endsWith("ing"));			
					
	}
}

/*
Strings are immutable. Once a string gets constructed, it is not possible to change its contents.


Input a string and convert it to title case. This Is Some Sample String
Input a string and remove all extra spaces between words. "  this    is    some    sample    string  "  --> "this is some sample string"
Input a string and convert it to piglatin. this is some sample string ---> hista sia omesa amplesa tringsa
 **/